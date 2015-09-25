package com.softserve.dao;

import java.util.List;

import com.softserve.entity.Group;
import com.softserve.entity.Lesson;
import com.softserve.entity.Teacher;

public interface TeacherDao {
	public void createTeacher(Teacher teacher);
	public void deleteTeacher(Teacher teacher);
	public Teacher getTeacherByLesson(Lesson lesson);
	public List<Teacher> getTeachersByGroup(Group group);	
}
