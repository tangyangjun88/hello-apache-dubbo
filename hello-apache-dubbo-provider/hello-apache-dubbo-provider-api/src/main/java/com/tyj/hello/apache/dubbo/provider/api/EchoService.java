package com.tyj.hello.apache.dubbo.provider.api;

public interface EchoService {
    /**
     * 输出信息
     * @param str
     * @return
     */
    String echo(String str);
}
