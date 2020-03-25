package com.wen.log.starter.entity;

import java.time.LocalDateTime;

/**
 * 项目名称：wen-item
 * 类名称：SysLogEntity
 * 类描述：系统日志实体类
 * 创建人：yingx
 * 创建时间： 2020/3/16
 * 修改人：yingx
 * 修改时间： 2020/3/16
 * 修改备注：
 */
public class SysLogEntity {

    /**
     * 操作用户id
     */
    private Long userId;

    /**
     * 操作用户名
     */
    private String userName;

    /**
     * 操作IP
     */
    private String requestIp;

    /**
     * 日志类型 操作类型 异常类型
     */
    private String logType;

    /**
     * 操作描述
     */
    private String description;

    /**
     * 类路径
     */
    private String classPath;

    /**
     * 请求类型
     */
    private String actionMethod;

    /**
     * 请求地址
     */
    private String requestUri;

    /**
     * 请求类型 HttpMethod{GET:GET请求;POST:POST请求;PUT:PUT请求;DELETE:DELETE请求;PATCH:PATCH请求;TRACE:TRACE请求;HEAD:HEAD请求;OPTIONS:OPTIONS请求;}
     */
    private String httpMethod;

    /**
     * 请求参数
     */
    private String params;

    /**
     * 返回值
     */
    private String result;

    /**
     * 异常详情信息
     */
    private String errorDesc;

    /**
     * 异常描述
     */
    private String errorDetail;

    /**
     * 开始时间
     */
    private LocalDateTime startTime;

    /**
     * 完成时间
     */
    private LocalDateTime endTime;

    /**
     * 消耗时间
     */
    private Long consumingTime;

    /**
     * 请求浏览器
     */
    private String browser;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClassPath() {
        return classPath;
    }

    public void setClassPath(String classPath) {
        this.classPath = classPath;
    }

    public String getActionMethod() {
        return actionMethod;
    }

    public void setActionMethod(String actionMethod) {
        this.actionMethod = actionMethod;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Long getConsumingTime() {
        return consumingTime;
    }

    public void setConsumingTime(Long consumingTime) {
        this.consumingTime = consumingTime;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    @Override
    public String toString() {
        return "SysLogEntity{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", requestIp='" + requestIp + '\'' +
                ", logType='" + logType + '\'' +
                ", description='" + description + '\'' +
                ", classPath='" + classPath + '\'' +
                ", actionMethod='" + actionMethod + '\'' +
                ", requestUri='" + requestUri + '\'' +
                ", httpMethod='" + httpMethod + '\'' +
                ", params='" + params + '\'' +
                ", result='" + result + '\'' +
                ", errorDesc='" + errorDesc + '\'' +
                ", errorDetail='" + errorDetail + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", consumingTime=" + consumingTime +
                ", browser='" + browser + '\'' +
                '}';
    }
}
