package com.softserve.dao;

import java.util.List;

import com.softserve.entity.Group;
import com.softserve.entity.Student;

public interface StudentDao {
	public void createStudent(Student student);
	public void deleteStudent(Student student);
	public List<Student> getStudentsByGroup(Group group);
}
