package com.softserve.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import static com.softserve.utils.Queries.*;

import com.softserve.entity.Lesson;
import com.softserve.entity.Room;

@Repository
public class RoomDaoImpl implements RoomDao {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void createRoom(Room room) {
		entityManager.persist(room);		
	}

	@Override
	public void deleteRoom(Room room) {
		entityManager.remove(room);		
	}

	@Override
	public Room getRoomByLesson(Lesson lesson) {
		Query query = entityManager.createQuery(GET_ROOM_BY_LESSON);
		Long id = lesson.getId();
		query.setParameter("lessonId", id);
		Room room = (Room) query.getResultList().get(0);
		return room;
	}

}
