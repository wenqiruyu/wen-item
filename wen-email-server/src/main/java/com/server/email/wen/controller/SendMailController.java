package com.server.email.wen.controller;

import com.server.common.wen.vo.ResultVO;
import com.server.email.wen.service.SendMailService;
import com.server.email.wen.vo.SendMailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * 项目名称：wen-item
 * 类名称：SendMailController
 * 类描述：TODO
 * 创建人：yingx
 * 创建时间： 2020/3/25
 * 修改人：yingx
 * 修改时间： 2020/3/25
 * 修改备注：
 */
@RestController
@RequestMapping("/mail")
public class SendMailController {

    @Autowired
    private SendMailService sendMailService;

    @Autowired
    private JavaMailSender mailSender;

    /**
     * 邮件发送
     *
     * @param sendMailVO
     * @return com.server.common.wen.vo.ResultVO
     * @author yingx
     * @date 2020/3/26
     */
    @PostMapping("/sendMail")
    public ResultVO sendMail(@RequestBody SendMailVO sendMailVO) {

        ResultVO resultVO = sendMailService.sendMail(sendMailVO);
        return resultVO;
    }

    @PostMapping("/sendSimpleMail")
    public ResultVO sendSimpleMail() {

        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = null;
            mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom("yxwenqiyu@163.com");
            mimeMessageHelper.setTo("2234150293@qq.com");
            mimeMessageHelper.setSubject("测试");
            mimeMessageHelper.setText("测试测试", true);
            mailSender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return new ResultVO();
    }
}
