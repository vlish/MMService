package com.softserve.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.dao.TeacherDao;
import com.softserve.entity.Group;
import com.softserve.entity.Lesson;
import com.softserve.entity.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherDao teacherDao;

	@Override
	public void createTeacher(Teacher teacher) {
		teacherDao.createTeacher(teacher);
	}

	@Override
	public void deleteTeacher(Teacher teacher) {
		teacherDao.deleteTeacher(teacher);
	}

	@Override
	public Teacher getTeacherByLesson(Lesson lesson) {
		Teacher teacher = teacherDao.getTeacherByLesson(lesson);
		return teacher;
	}

	@Override
	public List<Teacher> getTeachersByGroup(Group group) {
		List<Teacher> teachers = teacherDao.getTeachersByGroup(group);
		return teachers;
	}
}
