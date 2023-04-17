package org.tnsif.autowiredexample;
//Program to demonstrate on autowire concept
//driver class
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Bike b = c.getBean("bike", Bike.class);
		b.accept();

	}

}

/*OUTPUT
Bike is dependent on Petrol
Day-by-day Petrol price is increasing +and middle class person cant able to use theirbike*/