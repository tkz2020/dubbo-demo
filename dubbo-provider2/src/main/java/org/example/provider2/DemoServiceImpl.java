package org.example.provider2;

import org.example.api.DemoService;

import java.util.concurrent.TimeUnit;

public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        System.out.println("-------provider2-------" + name);
        try {
            TimeUnit.MINUTES.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello" + name + ",我是权重为300的服务端";
    }
}
