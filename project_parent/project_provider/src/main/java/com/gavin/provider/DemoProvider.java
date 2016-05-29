package com.gavin.provider;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DemoProvider {
	 public static void main(String[] args) throws IOException {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});  
//		 FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(configLocations);
	        context.start();  
	   
	        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟  
	}
}
