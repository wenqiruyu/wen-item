package com.server.eureka.wen.config;

import com.netflix.appinfo.InstanceInfo;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 项目名称：wen-item
 * 类名称：EurekaStateChangeListener
 * 类描述：Eureka的事件监听
 * 创建人：yingx
 * 创建时间： 2020/3/19
 * 修改人：yingx
 * 修改时间： 2020/3/19
 * 修改备注：
 */
@Component
public class EurekaStateChangeListener {

    /**
     * 服务下线事件
     *
     * @param event
     * @return void
     * @author yingx
     * @date 2020/3/19
     */
    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        System.err.println(event.getServerId() + "\t" + event.getAppName() + " 服务下线");
    }

    /**
     * 服务注册事件
     *
     * @param event
     * @return void
     * @author yingx
     * @date 2020/3/19
     */
    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        System.err.println(instanceInfo.getAppName() + "进行注册");
    }

    /**
     * 服务续约事件
     *
     * @param event
     * @return void
     * @author yingx
     * @date 2020/3/19
     */
    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
        System.err.println(event.getServerId() + "\t" + event.getAppName() + " 服务进行续约");
    }

    /**
     * Eureka注册中心启动事件
     *
     *
     * @param event
     * @return void
     * @author yingx
     * @date 2020/3/19
     */
    @EventListener
    public void listen(EurekaRegistryAvailableEvent event) {
        System.err.println("注册中心 启动");
    }

    /**
     * Eureka server启动事件
     *
     * @param event
     * @return void
     * @author yingx
     * @date 2020/3/19
     */
    @EventListener
    public void listen(EurekaServerStartedEvent event) {
        System.err.println("Eureka Server 启动");
    }
}
