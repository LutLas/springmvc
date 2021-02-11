package io.erehsawsaltul.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import io.erehsawsaltul.springmvc.dto.Employee;

@Controller
public class ObjectController {
	
	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		
		Employee employee = new Employee();
		
		employee.setId(69);
		employee.setName("Muyoba");
		employee.setSalary(2300);
		
		modelAndView.addObject("employee", employee);
		
		return modelAndView;
	}
}
