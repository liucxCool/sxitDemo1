package com.up2.test;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-redis.xml");
		Test1 test1 = (Test1) context.getBean("Test1");

		System.out.println("执行getStu方法");
		Student1 stu = test1.getStu();
		System.out.println("执行getStu方法返回：" + stu.toString());

	}

	@Cacheable(key = "kk1-1", value = "stu1")
	public Student1 getStu() {
		System.out.println("进方法了");
		Student1 student1 = new Student1("小明", "28");
		System.out.println("student1" + student1.toString());
		return student1;
	}

}
