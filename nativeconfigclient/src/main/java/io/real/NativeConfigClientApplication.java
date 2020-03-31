package io.real;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NativeConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(NativeConfigClientApplication.class,args);
    }

}