package io.erehsawsaltul.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import io.erehsawsaltul.springmvc.dto.Employee;

@Controller
public class ListController {
	
	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		
		Employee employee = new Employee();
		
		employee.setId(79);
		employee.setName("John");
		employee.setSalary(2000);
		
		Employee employee2 = new Employee();
		employee2.setId(49);
		employee2.setName("Colad");
		employee2.setSalary(1000);
		
		Employee employee3 = new Employee();
		employee3.setId(96);
		employee3.setName("Jane");
		employee3.setSalary(5000);
		
		Employee employee4 = new Employee();
		employee4.setId(30);
		employee4.setName("Born");
		employee4.setSalary(4700);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		
		modelAndView.addObject("employees", employees);
		
		return modelAndView;
	}
}
