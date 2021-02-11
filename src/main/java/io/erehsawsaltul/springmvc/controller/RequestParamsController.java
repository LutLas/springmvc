package io.erehsawsaltul.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import io.erehsawsaltul.springmvc.dto.User;

@Controller
public class RequestParamsController {

	@RequestMapping("/showData")
	public ModelAndView showData(
			@RequestParam("id") int id,
			@RequestParam("name") String name,
			@RequestParam(value="salary",required = false, defaultValue = "69.69") double salary
			) {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		
		ModelAndView modelAndView = new ModelAndView();
		
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(salary+"@test.com");
		
		modelAndView.addObject("user", user);
		modelAndView.setViewName("regResult");

		return modelAndView;
		}
}
