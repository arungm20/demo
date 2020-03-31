package com.fs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.fs.examples.model.Employee;
import com.fs.examples.service.EmployeeService;
import com.fs.examples.service.SendEmailService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableCaching
@ComponentScan(basePackages = {"com.fs","com.fs.investments"})
@EnableAutoConfiguration
@EnableSwagger2
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		EmployeeService employeeService = context.getBean(EmployeeService.class);

		Employee emp = new Employee();
		emp.setEmpId("emp");
		emp.setEmpName("emp");

		Employee emp1 = new Employee();
		emp1.setEmpId("emp1");
		emp1.setEmpName("emp1");

		Employee emp2 = new Employee();
		emp2.setEmpId("emp2");
		emp2.setEmpName("emp2");

		employeeService.insertEmployee(emp);

		List<Employee> employees = new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employeeService.insertEmployees(employees);

		System.out.println("Inside the main class making call to service first time");
		List<Employee> employeeList1 = employeeService.getAllEmployees();
		for (Employee employee : employeeList1) {
			System.out.println(employee.toString());
		}

		System.out.println("Inside the main class making call to service second time where it will use hazelcast");
		List<Employee> employeeList2 = employeeService.getAllEmployees();
		for (Employee employee : employeeList2) {
			System.out.println(employee.toString());
		}

		SendEmailService sendEmailService = context.getBean(SendEmailService.class);

		/*
		 * System.out.println("/n-----------------------------------------/n");
		 * System.out.println("Sending Email using Java Mail");
		 * 
		 * sendEmailService.sendEmail(); try {
		 * sendEmailService.sendEmailWithAttachment(); } catch (MessagingException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); } catch (IOException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */

		
	}

}
