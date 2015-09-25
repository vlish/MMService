package com.softserve.service;

import java.util.List;

import com.softserve.entity.Group;
import com.softserve.entity.Lesson;
import com.softserve.entity.Teacher;

public interface TeacherService {
	public void createTeacher(Teacher teacher);
	public void deleteTeacher(Teacher teacher);
	public Teacher getTeacherByLesson(Lesson lesson);
	public List<Teacher> getTeachersByGroup(Group group);
}
