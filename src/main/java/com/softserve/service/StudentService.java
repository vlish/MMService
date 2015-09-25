package com.softserve.service;

import java.util.List;

import com.softserve.entity.Group;
import com.softserve.entity.Student;

public interface StudentService {
	public void createStudent(Student student);
	public void deleteStudent(Student student);
	public List<Student> getStudentsByGroup(Group group);
}
