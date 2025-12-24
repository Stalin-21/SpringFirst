package com.springapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// UC5: Spring Core - Application startup and component scanning

import com.springapi.component.EmployeeBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
