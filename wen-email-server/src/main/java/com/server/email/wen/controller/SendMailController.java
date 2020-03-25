package com.server.email.wen.controller;

import com.server.common.wen.vo.ResultVO;
import com.server.email.wen.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    /*public ResultVO sendSimpleMail(String){

        sendMailService.sendSimpleMail()
    }*/
}
