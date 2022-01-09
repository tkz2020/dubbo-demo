package org.example.provider1;

import org.example.api.DemoService;

public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        System.out.println("-------provider1-------" + name);
        return "Hello" + name + ",我是权重为200的服务端";
    }
}
