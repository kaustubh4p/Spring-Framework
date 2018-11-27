package com.spring.core.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.bean.Employee;

/**
 * @author KaustubhWaghmare
 *
 */
public class App {
	
	public static void main(String args[])
	{
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("springSingleton.xml"); // Singleton
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("springPrototype.xml"); // Prototype
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springAnnotation.xml"); // Annotation Scan
		
		Employee champ = (Employee)ctx.getBean(Employee.class);
		champ.setEmpName("Champ");
    	System.out.println("Emp Name : " + champ.getEmpName());
    	
    	Employee master = (Employee)ctx.getBean(Employee.class);
    	System.out.println("Emp Name : " + master.getEmpName());
		
    	/* ************************************************************** */
    	
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(); // Prototype
//		ctx.scan("com.spring.core.bean");
//		ctx.refresh();
//		Employee champ = (Employee)ctx.getBean(Employee.class);
//		champ.setEmpName("Champ");
//    	System.out.println("Emp Name : " + champ.getEmpName());
//    	
//    	Employee master = (Employee)ctx.getBean(Employee.class);
//    	System.out.println("Emp Name : " + master.getEmpName());
		
	}

}
