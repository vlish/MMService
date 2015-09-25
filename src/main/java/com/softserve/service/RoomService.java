package com.softserve.service;

import com.softserve.entity.Lesson;
import com.softserve.entity.Room;

public interface RoomService {
	public void createRoom(Room room);
	public void deleteRoom(Room room);
	public Room getRoomByLesson(Lesson lesson);
}
