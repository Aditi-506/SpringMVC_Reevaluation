package com.greatlearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.dao.StudentDAO;
import com.greatlearning.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDAO studentDAOImpl;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentDAOImpl.findAll();
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return studentDAOImpl.findById(id);
	}

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		studentDAOImpl.save(student);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		studentDAOImpl.deleteById(id);
	}

}
