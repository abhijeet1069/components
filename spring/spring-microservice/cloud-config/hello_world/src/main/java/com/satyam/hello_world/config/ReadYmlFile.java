package com.satyam.hello_world.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="app")
public class ReadYmlFile {
    private String msg;

    public String getMsg() {
        return msg;
    }

    //used internally by spring boot to save msg
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
