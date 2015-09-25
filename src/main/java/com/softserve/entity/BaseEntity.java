package com.softserve.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class BaseEntity {
	
	@Column(name = "Created_By")
	private String createdBy;
	
	@Column(name = "Updated_By")
	private String updatedBy;
	
	@Column(name = "Created_Date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;	
	
	@Column(name = "Modified_Date")
	@Temporal(TemporalType.TIMESTAMP)	
	private Date modifiedDate;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}	
	
}
