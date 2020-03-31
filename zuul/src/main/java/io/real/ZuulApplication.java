package io.real;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy     //包含了@EnableZuulServer 设置该类是网关的启动类
@EnableAutoConfiguration             //可以帮助SpringBoot应用所有符合条件的配置 @Configuration 配置
// 加载到当前SpringBoot 创建并使用的IOC
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }

}
