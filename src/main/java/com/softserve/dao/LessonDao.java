package com.softserve.dao;

import java.util.List;

import com.softserve.entity.Lesson;
import com.softserve.entity.Teacher;

public interface LessonDao {
	public void createLesson(Lesson lesson);
	public void deleteLesson(Lesson lesson);
	public List<Lesson> getLessonsByTeacher(Teacher teacher);
	public List<Lesson> getAllLessons();
}
