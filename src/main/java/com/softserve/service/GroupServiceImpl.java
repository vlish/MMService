package com.softserve.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.GroupDao;
import com.softserve.entity.Group;
import com.softserve.entity.Teacher;

@Service
public class GroupServiceImpl implements GroupService {
	
	@Autowired
	GroupDao groupDao;

	@Override
	@Transactional
	public void createGroup(Group group) {
		groupDao.createGroup(group);		
	}

	@Override
	@Transactional
	public void deleteGroup(Group group) {
		groupDao.deleteGroup(group);		
	}

	@Override
	public Group getGroupByName(String name) {
		Group group = groupDao.getGroupByName(name);
		return group;
	}

	@Override
	public Group getGroupByTeacher(Teacher teacher) {
		Group group = groupDao.getGroupByTeacher(teacher);
		return group;
	}

	@Override
	public List<Group> getAllGroups() {
		List<Group> groups = groupDao.getAllGroups();		
		return groups;
	}

}
