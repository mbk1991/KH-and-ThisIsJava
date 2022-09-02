package org.kh.hellospring.run;

import org.kh.hellospring.MessageBean;
import org.kh.hellospring.MessageBeanHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloRun {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		//spring-context.xml 파일을 참조하여
		MessageBean bean
		=(MessageBeanHello)ctx.getBean("messageBean");
		bean.sayHello("Spring^^");
	
	}
}
