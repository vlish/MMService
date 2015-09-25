package com.softserve.utils;

public class Queries {
	public static final String GET_GROUP_BY_NAME = "Select g from groups where g.name=:name";
	public static final String GET_GROUP_BY_TEACHER = "Select g from groups where g.idTeachers=:teacherId";
	public static final String GET_ALL_GROUPS ="Select g from groups g";
	public static final String DELETE_GROUP = "delete g from groups g";
	
	public static final String DELETE_LESSON = "delete l from lessons l";
	public static final String GET_LESSONS_BY_TEACHER = "select l from lessons where l.idTeachers=:teacherId";
	public static final String GET_ALL_LESSONS = "select l from lessons l";
	
	public static final String DELETE_ROOM = "delete r from rooms r";
	public static final String GET_ROOM_BY_LESSON = "select r from rooms where r.idLessons =:lessonId"; 
	
	public static final String GET_STUDENTS_BY_GROUP = "select s from students  where s.idGroups =:groupId";
	
	public static final String GET_TEACHER_BY_LESSON = "select t from teachers where t.idLessons =:lessonId";
	
	public static final String GET_TEACHERS_BY_GROUP = "select t from teacher where t.idGroups =:groupId";
	
}
