package com.softserve.dao;

import com.softserve.entity.Lesson;
import com.softserve.entity.Room;

public interface RoomDao {
	public void createRoom(Room room);
	public void deleteRoom(Room room);
	public Room getRoomByLesson(Lesson lesson);
}
