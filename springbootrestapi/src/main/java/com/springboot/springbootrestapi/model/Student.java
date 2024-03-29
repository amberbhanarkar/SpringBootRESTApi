package com.springboot.springbootrestapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Students")
@EntityListeners(AuditingEntityListener.class)
public class Student {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Long rollnum;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String standard;
	
	@NotBlank
	private String section;
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date admDate;
	
//	@NotBlank
	private Float percentage;

	public Long getRollnum() {
		return rollnum;
	}

	public void setRollnum(Long rollnum) {
		this.rollnum = rollnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Date getAdmDate() {
		return admDate;
	}

	public void setAdmDate(Date admDate) {
		this.admDate = admDate;
	}

	public Float getPercentage() {
		return percentage;
	}

	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}

}
