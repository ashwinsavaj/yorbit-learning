package com.yorbit.docker.ui.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yorbit.docker.ui.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

}
