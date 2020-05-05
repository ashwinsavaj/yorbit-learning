package com.yorbit.docker.ui.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.yorbit.docker.ui.dao.StudentDAO;
import com.yorbit.docker.ui.exception.DatabaseConnectionException;
import com.yorbit.docker.ui.model.Student;
import com.yorbit.docker.ui.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO userDao;

	@Override
	public ModelAndView registerUser(Student student) throws DatabaseConnectionException {

		boolean isRegistered = userDao.userRegistration(student);

		if (isRegistered) {
			ModelAndView model = new ModelAndView();
			model.setViewName("/result");
			model.addObject("name", student.getName());
			model.addObject("age", student.getAge());
			model.addObject("id", student.getId());
			return model;
		}

		return new ModelAndView("/error");

	}
	
}
