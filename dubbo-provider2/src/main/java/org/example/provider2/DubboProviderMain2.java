package org.example.provider2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboProviderMain2 {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-provider2.xml"});
        context.start();
        System.in.read(); // press any key to exit
    }
}
