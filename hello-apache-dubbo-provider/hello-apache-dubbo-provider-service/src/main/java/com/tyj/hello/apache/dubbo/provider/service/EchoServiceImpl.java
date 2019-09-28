package com.tyj.hello.apache.dubbo.provider.service;

import com.tyj.hello.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService{

    @Override
    public String echo(String str) {
        return "Echo Hello "+str;
    }
}