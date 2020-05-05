package com.yorbit.docker.ui.service;

import org.springframework.web.servlet.ModelAndView;

import com.yorbit.docker.ui.exception.DatabaseConnectionException;
import com.yorbit.docker.ui.model.Student;

public interface StudentService {

	public ModelAndView registerUser(Student student) throws DatabaseConnectionException;

}
