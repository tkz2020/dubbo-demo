package org.example.provider;

import org.example.api.DemoService;

public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        System.out.println("-------provider-------" + name);
        return "Hello" + name + ",我是默认权重的服务端";
    }
}
