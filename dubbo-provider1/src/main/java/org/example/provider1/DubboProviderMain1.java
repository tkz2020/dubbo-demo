package org.example.provider1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboProviderMain1 {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-provider1.xml"});
        context.start();
        System.in.read(); // press any key to exit
    }
}
