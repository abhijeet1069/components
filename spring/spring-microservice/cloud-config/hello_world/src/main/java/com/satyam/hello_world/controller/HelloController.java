package com.satyam.hello_world.controller;

import com.satyam.hello_world.config.ReadYmlFile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final ReadYmlFile props;


    public HelloController(ReadYmlFile props){
        this.props = props;
    }

    @GetMapping("/")
    public String index(){
        return props.getMsg();
    }
}
