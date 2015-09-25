package com.softserve.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.softserve.entity.Group;
import com.softserve.entity.Lesson;
import com.softserve.entity.Teacher;

import static com.softserve.utils.Queries.*;

@Repository
public class TeacherDaoImpl implements TeacherDao {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public void createTeacher(Teacher teacher) {
		entityManager.persist(teacher);		
	}

	@Override
	public void deleteTeacher(Teacher teacher) {
		entityManager.remove(teacher);		
	}

	@Override
	public Teacher getTeacherByLesson(Lesson lesson) {
		Query query = entityManager.createQuery(GET_TEACHER_BY_LESSON);
		Long id = lesson.getId();
		query.setParameter("lessonId",id);
		Teacher teacher = (Teacher) query.getSingleResult();		
		return teacher;
	}

	@Override
	public List<Teacher> getTeachersByGroup(Group group) {
		Query query = entityManager.createQuery(GET_TEACHERS_BY_GROUP);
		Long id = group.getId();
		query.setParameter("groupId", id);
		List<Teacher> teachers = query.getResultList();
		return teachers;
	}
}
