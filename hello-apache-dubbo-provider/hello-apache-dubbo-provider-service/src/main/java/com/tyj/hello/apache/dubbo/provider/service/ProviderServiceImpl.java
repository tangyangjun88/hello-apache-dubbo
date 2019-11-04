package com.tyj.hello.apache.dubbo.provider.service;

import com.tyj.hello.apache.dubbo.provider.api.ProvidreService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class ProviderServiceImpl implements ProvidreService {
    @Override
    public String echo(String string) {
        return "echo Dubbo "+string;
    }
}
