package com.softserve.service;

import java.util.List;

import com.softserve.entity.Group;
import com.softserve.entity.Teacher;

public interface GroupService {
	public void createGroup(Group group);
	public void deleteGroup(Group group);
	public Group getGroupByName(String name);
	public Group getGroupByTeacher(Teacher teacher);
	public List<Group> getAllGroups();
}
