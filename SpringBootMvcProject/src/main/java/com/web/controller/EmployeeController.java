package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.model.Employee;

@Controller//it is mvc controller
public class EmployeeController {
	
	@RequestMapping("/welcome")
	public ModelAndView greet() {
		//below constructor contains argument as: viewName, modelName, modelObject
		return new ModelAndView("welcome", "msg", "Welcome to JSP page");
	}
	
	@RequestMapping(name="/emp",method = RequestMethod.GET)
	public ModelAndView getEmployee() {
		return new ModelAndView("emp","command",new Employee());
	}
	//Post handler
	@RequestMapping(name="/addemp",method = RequestMethod.POST)
	public ModelAndView createEmpployee(@ModelAttribute(value = "emp") Employee emp, ModelAndView model) {
		model.addObject(emp);
		model.setViewName("empinfo");		
		return model;
	}
}
