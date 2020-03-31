package io.real.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/native")
public class NativeConfigHandler {

    @Value("${env.name:config server not found}")
    private String name;

    @Value("${env.password:config server not found}")
    private String password;

    @GetMapping("/getMsg")
    public String getMsg(){
        return this.name+this.password;
    }

}
