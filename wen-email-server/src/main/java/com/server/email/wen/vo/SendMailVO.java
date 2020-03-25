package com.server.email.wen.vo;

import java.io.File;
import java.util.List;

/**
 * 项目名称：wen-item
 * 类名称：SendMailVO
 * 类描述：TODO
 * 创建人：yingx
 * 创建时间： 2020/3/25
 * 修改人：yingx
 * 修改时间： 2020/3/25
 * 修改备注：
 */
public class SendMailVO {

    /**
     * 发送邮件给
     */
    private List<String> mailName;

    /**
     * 邮件标题
     */
    private String title;

    /**
     * 邮件内容
     */
    private String content;

    /**
     * 附件
     */
    private List<File> fileList;

    public List<String> getMailName() {
        return mailName;
    }

    public void setMailName(List<String> mailName) {
        this.mailName = mailName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    @Override
    public String toString() {
        return "SendMailVO{" +
                "mailName=" + mailName +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", fileList=" + fileList +
                '}';
    }
}
