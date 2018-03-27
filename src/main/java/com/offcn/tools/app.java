package com.offcn.tools;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
public static void main(String[] args) {
	ApplicationContext Context = new ClassPathXmlApplicationContext("spring-dao.xml");
}
}
