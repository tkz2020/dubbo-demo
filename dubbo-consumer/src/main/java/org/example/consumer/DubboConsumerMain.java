package org.example.consumer;

import org.example.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboConsumerMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService"); // get remote service proxy
        DubboConsumerMain dubboConsumerMain = new DubboConsumerMain();
        dubboConsumerMain.testLeastActiveLoadBalance(demoService);
    }


    /**
     * 测试dubbo负载均衡（最小连接数）
     * @param demoService
     */
    private void testLeastActiveLoadBalance(DemoService demoService){
        for (int i = 0; i < 10; i++){
            int finalI = i;
            new Thread(() -> {
                demoService.sayHello("测试最小连接数" + finalI);
            }).start();
        }
        demoService.sayHello("测试最小连接数-debug");
    }
}
