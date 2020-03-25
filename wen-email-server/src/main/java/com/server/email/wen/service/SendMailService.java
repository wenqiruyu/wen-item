package com.server.email.wen.service;

import com.server.common.wen.vo.ResultVO;

import java.io.File;
import java.util.List;

/**
 * 项目名称：wen-item
 * 类名称：SendMailService
 * 类描述：TODO
 * 创建人：yingx
 * 创建时间： 2020/3/25
 * 修改人：yingx
 * 修改时间： 2020/3/25
 * 修改备注：
 */
public interface SendMailService {

    ResultVO sendSimpleMail(String title, String content, String... mailName);

    ResultVO sendAttachmentsMail(String title, String content, List<File> fileList, String... mailName);
}
