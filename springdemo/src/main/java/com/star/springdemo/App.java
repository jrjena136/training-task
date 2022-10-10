package com.star.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application.xml"));
    	
    	ApplicationContext factory = new ClassPathXmlApplicationContext("application.xml");
    	
		/*
		 * Object o = factory.getBean("emp1"); Employee emp1 = (Employee) o;
		 * System.out.println(emp1);
		 * System.out.println(emp1.getEid()+" "+emp1.getEname()+" "+emp1.getSalary());
		 * 
		 * 
		 * Employee emp2 = factory.getBean("emp2",Employee.class);
		 * System.out.println(emp2);
		 * System.out.println(emp2.getEid()+" "+emp2.getEname()+" "+emp2.getSalary());
		 * 
		 */
    	Employee e = factory.getBean(Employee.class);
    	System.out.println(e);
    	
    }
}
