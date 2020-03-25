package com.server.email.wen.service.impl;

import com.server.common.wen.enums.ExceptionEnum;
import com.server.common.wen.exception.ExtenException;
import com.server.common.wen.vo.ResultVO;
import com.server.email.wen.service.SendMailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import java.io.File;
import java.util.List;

/**
 * 项目名称：wen-item
 * 类名称：SendMailServiceImpl
 * 类描述：TODO
 * 创建人：yingx
 * 创建时间： 2020/3/25
 * 修改人：yingx
 * 修改时间： 2020/3/25
 * 修改备注：
 */
@Service
public class SendMailServiceImpl implements SendMailService {

    private final static Logger logger = LoggerFactory.getLogger(SendMailServiceImpl.class);

    @Value("${spring.mail.username}")
    private String springMailUsername;

    @Autowired
    private JavaMailSender mailSender;

    /**
     * 发送普通邮件
     *
     * @param title    邮件标题
     * @param content  邮件内容
     * @param mailName 发送给
     * @return com.server.common.wen.vo.ResultVO
     * @author yingx
     * @date 2020/3/25
     */
    @Override
    public ResultVO sendSimpleMail(String title, String content, String... mailName) {

        logger.info("SendMailServiceImpl sendSimpleMail start ... mailName:{}, title:{}, content:{}", mailName, title, content);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(springMailUsername);
        message.setTo(mailName);
        message.setSubject(title);
        message.setText(content);
        try {
            mailSender.send(message);
        } catch (Exception e) {
            logger.error("SendMailServiceImpl sendSimpleMail error ... e:{}", e);
            throw new ExtenException("sendSimpleMail", ExceptionEnum.UNEXPECTED_ERROR.getCode(),
                    ExceptionEnum.UNEXPECTED_ERROR.getMessage());
        }
        logger.info("SendMailServiceImpl sendSimpleMail end ... ");
        return new ResultVO();
    }

    /**
     * 发送带附件的邮件
     *
     * @param title    邮件标题
     * @param content  邮件内容
     * @param fileList 邮件附件
     * @param mailName 发送给
     * @return com.server.common.wen.vo.ResultVO
     * @author yingx
     * @date 2020/3/25
     */
    @Override
    public ResultVO sendAttachmentsMail(String title, String content, List<File> fileList, String... mailName) {

        logger.info("SendMailServiceImpl sendAttachmentsMail start ... mailName:{}, title:{}, content:{}, fileNum:{}",
                mailName, title, content, fileList.size());
        MimeMessage message = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(springMailUsername);
            helper.setTo(mailName);
            helper.setSubject(title);
            helper.setText(content);
            String fileName = null;
            for (File file : fileList) {
                fileName = MimeUtility.encodeText(file.getName(), "GB2312", "B");
                helper.addAttachment(fileName, file);
            }
        } catch (Exception e) {
            logger.error("SendMailServiceImpl sendAttachmentsMail error ... e:{}", e);
            throw new ExtenException("sendAttachmentsMail", ExceptionEnum.UNEXPECTED_ERROR.getCode(),
                    ExceptionEnum.UNEXPECTED_ERROR.getMessage());
        }
        mailSender.send(message);
        return new ResultVO();
    }
}
