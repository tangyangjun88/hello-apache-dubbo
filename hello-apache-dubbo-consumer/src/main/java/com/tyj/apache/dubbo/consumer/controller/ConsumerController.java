package com.tyj.apache.dubbo.consumer.controller;

import com.tyj.hello.apache.dubbo.provider.api.ProvidreService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Reference(version = "1.0.0")
    private ProvidreService providreService;

    @GetMapping(value = "echo/{string}")
    public String echo(@PathVariable("string") String string){
        return providreService.echo(string);
    }
}
