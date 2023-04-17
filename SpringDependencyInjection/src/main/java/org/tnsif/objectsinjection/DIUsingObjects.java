package org.tnsif.objectsinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingObjects {

	public static void main(String[] args) {
		BeanFactory f = new ClassPathXmlApplicationContext("web.xml");
		Charger e=f.getBean("charger",Charger.class);
		System.out.println(e);
	

	}

}
