package com.yorbit.docker.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yorbit.docker.ui.exception.DatabaseConnectionException;
import com.yorbit.docker.ui.model.Student;
import com.yorbit.docker.ui.service.impl.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceImpl studentService;

	@RequestMapping(value = {"/student","/"}, method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student", "command", new Student());
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public ModelAndView indexPage(@ModelAttribute("SpringWeb") Student student) throws DatabaseConnectionException {
		return studentService.registerUser(student);

	}

}
