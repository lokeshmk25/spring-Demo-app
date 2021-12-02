package com.bridgelabz.demoapp;

import com.bridgelabz.demoapp.component.DemoBean;
import com.bridgelabz.demoapp.component.EmployeeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class HelloWorldApplication {
	     public static final Logger logger= LoggerFactory.getLogger(HelloWorldApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to spring concepts");
		ApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
		logger.debug("Checking context: {}",context.getBean(DemoBean.class));
		logger.debug("\n ***Example using @autowired annotation on property ***");
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setId(100);
		employeeBean.setName("Lokesh");
		employeeBean.showEmployeeDetails();
	}

}


