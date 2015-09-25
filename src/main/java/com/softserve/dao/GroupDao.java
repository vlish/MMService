package com.softserve.dao;

import java.util.List;

import com.softserve.entity.Group;
import com.softserve.entity.Teacher;

public interface GroupDao {
	void createGroup(Group group);
	Group getGroupByName(String name);
	Group getGroupByTeacher(Teacher teacher);
	List<Group> getAllGroups();
	void deleteGroup(Group group);
}
