package com.softserve.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import static com.softserve.utils.Queries.*;

import org.springframework.stereotype.Repository;

import com.softserve.entity.Group;
import com.softserve.entity.Teacher;

@Repository
public class GroupDaoImpl implements GroupDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void createGroup(Group group) {
		entityManager.persist(group);		
	}

	@Override
	public Group getGroupByName(String name) {
		Query query = entityManager.createQuery(GET_GROUP_BY_NAME);
		query.setParameter("name", name);
		Group resultGroup = (Group) query.getSingleResult();		
		return resultGroup;
	}

	@Override
	public Group getGroupByTeacher(Teacher teacher) {
		Long teacherId = teacher.getId();
		Query query = entityManager.createQuery(GET_GROUP_BY_TEACHER);
		query.setParameter("teacherId", teacherId);
		Group resultGroup = (Group) query.getSingleResult();
		return resultGroup;
	}

	@Override
	public List<Group> getAllGroups() {
		Query query = entityManager.createQuery(GET_ALL_GROUPS);
		List<Group> allGroups = query.getResultList();
		return allGroups;
	}

	@Override
	public void deleteGroup(Group group) {
		entityManager.remove(group);	
	}
}
