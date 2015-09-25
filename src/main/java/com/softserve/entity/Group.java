package com.softserve.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "groups")
public class Group extends BaseEntity implements Serializable {
	
	@Id
	@Column(name="idGroups",unique=true, nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="name",nullable=false)
	private String name;
	
	@Column(name="students_number")
	private int st_number;
	
	@Column(name="teachersId")
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "group")
	private List<Teacher> teachers;
	
	@Column(name="studentsId")
	@OneToMany(fetch = FetchType.LAZY,mappedBy="group")
	private List<Student> students;
	
	@Column(name="lessonsId")
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "group")
	private List<Lesson> lessons;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	public int getSt_number() {
		return st_number;
	}
	public void setSt_number(int st_number) {
		this.st_number = st_number;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public List<Lesson> getLessons() {
		return lessons;
	}
	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}
	
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lessons == null) ? 0 : lessons.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + st_number;
		result = prime * result
				+ ((students == null) ? 0 : students.hashCode());
		result = prime * result
				+ ((teachers == null) ? 0 : teachers.hashCode());
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
		Group other = (Group) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lessons == null) {
			if (other.lessons != null)
				return false;
		} else if (!lessons.equals(other.lessons))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (st_number != other.st_number)
			return false;
		if (students == null) {
			if (other.students != null)
				return false;
		} else if (!students.equals(other.students))
			return false;
		if (teachers == null) {
			if (other.teachers != null)
				return false;
		} else if (!teachers.equals(other.teachers))
			return false;
		return true;
	}
	
}
