package com.softserve.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.dao.StudentDao;
import com.softserve.entity.Group;
import com.softserve.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDao studentDao;

	@Override
	public void createStudent(Student student) {
		studentDao.createStudent(student);		
	}

	@Override
	public void deleteStudent(Student student) {
		studentDao.deleteStudent(student);		
	}

	@Override
	public List<Student> getStudentsByGroup(Group group) {
		List<Student> students = studentDao.getStudentsByGroup(group);
		return students;
	}
}
