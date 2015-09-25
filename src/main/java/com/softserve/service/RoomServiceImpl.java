package com.softserve.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.RoomDao;
import com.softserve.entity.Lesson;
import com.softserve.entity.Room;

@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	RoomDao roomDao;
	
	@Override
	@Transactional
	public void createRoom(Room room) {
		roomDao.createRoom(room);		
	}

	@Override
	@Transactional
	public void deleteRoom(Room room) {		
		roomDao.deleteRoom(room);
	}

	@Override
	public Room getRoomByLesson(Lesson lesson) {
		Room room = roomDao.getRoomByLesson(lesson);
		return room;
	}
}
