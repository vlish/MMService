package com.softserve.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import static com.softserve.utils.Queries.*;

import com.softserve.entity.Lesson;
import com.softserve.entity.Teacher;

@Repository
public class LessonDaoImpl implements LessonDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void createLesson(Lesson lesson) {
		entityManager.persist(lesson);
	}

	@Override
	public void deleteLesson(Lesson lesson) {
		entityManager.remove(lesson);
	}

	@Override
	public List<Lesson> getLessonsByTeacher(Teacher teacher) {
		Query query = entityManager.createQuery(GET_LESSONS_BY_TEACHER);
		Long id = teacher.getId();
		query.setParameter("teacherId", id);
		List<Lesson> lessons = query.getResultList();
		return lessons;				
	}

	@Override
	public List<Lesson> getAllLessons() {
		Query query = entityManager.createQuery(GET_ALL_LESSONS);
		List<Lesson> lessons = query.getResultList();
		return lessons;
	}
}
