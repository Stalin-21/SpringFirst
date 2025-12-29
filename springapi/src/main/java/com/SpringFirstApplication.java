package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// UC5: Spring Core - Application startup and component scanning

import com.day2.assignment1.component.EmployeeBean;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFirstApplication {

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(SpringFirstApplication.class, args);

		EmployeeBean employeeBean =
				context.getBean(EmployeeBean.class);

		employeeBean.showEmployeeDetails();
	}
}
