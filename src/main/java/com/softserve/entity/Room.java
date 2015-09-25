package com.softserve.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="rooms")
public class Room extends BaseEntity implements Serializable {
	
	@Id
	@Column(name="idRooms",unique=true,nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="number",unique=true,nullable=false)	
	private int number;
	
	@Column(name="stage",nullable=false)
	private int stage;
	
	@Column(name="lessonsId")
	@OneToMany(fetch=FetchType.LAZY,mappedBy="room")
	private List<Lesson> lessons;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getStage() {
		return stage;
	}
	public void setStage(int stage) {
		this.stage = stage;
	}
	public List<Lesson> getLessons() {
		return lessons;
	}
	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((lessons == null) ? 0 : lessons.hashCode());
		result = prime * result + number;
		result = prime * result + stage;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (id != other.id)
			return false;
		if (lessons == null) {
			if (other.lessons != null)
				return false;
		} else if (!lessons.equals(other.lessons))
			return false;
		if (number != other.number)
			return false;
		if (stage != other.stage)
			return false;
		return true;
	}
}
