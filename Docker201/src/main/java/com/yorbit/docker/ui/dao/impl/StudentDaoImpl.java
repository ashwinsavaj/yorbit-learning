package com.yorbit.docker.ui.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yorbit.docker.ui.dao.StudentDAO;
import com.yorbit.docker.ui.exception.DatabaseConnectionException;
import com.yorbit.docker.ui.model.Student;
import com.yorbit.docker.ui.repository.StudentRepository;

@Service
public class StudentDaoImpl implements StudentDAO {

	@Autowired
	StudentRepository userRepository;

	@Override
	public boolean userRegistration(Student student) throws DatabaseConnectionException {
		try {
			userRepository.save(student);
			return true;
		} catch (Exception e) {
			throw new DatabaseConnectionException("Could not connect with database. Please refer logs !!");
		}
	}

}
