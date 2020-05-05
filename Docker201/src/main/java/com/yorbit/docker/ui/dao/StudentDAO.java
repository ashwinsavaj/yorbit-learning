package com.yorbit.docker.ui.dao;

import com.yorbit.docker.ui.exception.DatabaseConnectionException;
import com.yorbit.docker.ui.model.Student;

public interface StudentDAO {

	public boolean userRegistration(Student student) throws DatabaseConnectionException;
}
