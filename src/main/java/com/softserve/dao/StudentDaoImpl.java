package com.softserve.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.softserve.entity.Group;
import com.softserve.entity.Student;

import static com.softserve.utils.Queries.*;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void createStudent(Student student) {
		entityManager.persist(student);
	}

	@Override
	public void deleteStudent(Student student) {		
		entityManager.remove(student);
	}

	@Override
	public List<Student> getStudentsByGroup(Group group) {
		Query query = entityManager.createQuery(GET_STUDENTS_BY_GROUP);
		Long id = group.getId();
		query.setParameter("groupId", id);
		return null;
	}

}
