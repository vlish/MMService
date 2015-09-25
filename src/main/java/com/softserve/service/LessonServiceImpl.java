package com.softserve.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.LessonDao;
import com.softserve.entity.Lesson;
import com.softserve.entity.Teacher;

@Service
public class LessonServiceImpl implements LessonService {

	@Autowired
	LessonDao lessonDao;

	@Override
	@Transactional
	public void createLesson(Lesson lesson) {
		lessonDao.createLesson(lesson);
	}

	@Override
	@Transactional
	public void deleteLesson(Lesson lesson) {
		lessonDao.deleteLesson(lesson);
	}

	@Override
	public List<Lesson> getLessonsByTeacher(Teacher teacher) {
		List<Lesson> lessons = lessonDao.getLessonsByTeacher(teacher);
		return lessons;
	}

	@Override
	public List<Lesson> getAllLessons() {
		List<Lesson> lessons = lessonDao.getAllLessons();
		return lessons;
	}
}
