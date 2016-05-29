package com.gavin.consumer;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gavin.service.DemoService;

public class DemoConsumer {
	public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "applicationContext.xml" });  
        context.start();  
  
        DemoService demoService = (DemoService) context.getBean("demoService"); //  
        String hello = demoService.sayHello("tom"); // ִ  
        System.out.println(hello); //   
  
        //   
        List list = demoService.getUsers();  
        if (list != null && list.size() > 0) {  
            for (int i = 0; i < list.size(); i++) {  
                System.out.println(list.get(i));  
            }  
        }  
        // System.out.println(demoService.hehe());  
        System.in.read();  
    }  
}
