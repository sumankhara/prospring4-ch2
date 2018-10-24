package com.apress.prospring4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		/*MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
		MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();*/
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MessageRenderer mr = ctx.getBean("messageRenderer", MessageRenderer.class);
		mr.render();
	}
}
