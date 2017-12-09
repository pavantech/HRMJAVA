package com.jpsoftech.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYER_QAL")
public class QalificationDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="QUALIFICATION_ID")
	private Integer qualificationId;
	@Column(name="NAME_OF_INSTITUTION")
	private String nameOfInstitution;
	@Column(name="YEAR_FROM")
	private Date yearFrom;
	@Column(name="YEAR_END")
	private Date yearEnd;
	@Column(name="COURSE_NAME")
	private String courseName;
	@Column(name="EDUCATION_NAME")
	private String educationName;
	@Column(name="MARKS_PERCENTAGE")
	private String marksPercentage;
	@Column(name="DEVISION_OR_DISTINCTION")
	private String divisiondistinction;
	public String getNameOfInstitution() {
		return nameOfInstitution;
	}
	public void setNameOfInstitution(String nameOfInstitution) {
		this.nameOfInstitution = nameOfInstitution;
	}
	public Date getYearFrom() {
		return yearFrom;
	}
	public void setYearFrom(Date yearFrom) {
		this.yearFrom = yearFrom;
	}
	public Date getYearEnd() {
		return yearEnd;
	}
	public void setYearEnd(Date yearEnd) {
		this.yearEnd = yearEnd;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getEducationName() {
		return educationName;
	}
	public void setEducationName(String educationName) {
		this.educationName = educationName;
	}
	public String getMarksPercentage() {
		return marksPercentage;
	}
	public void setMarksPercentage(String marksPercentage) {
		this.marksPercentage = marksPercentage;
	}
	public String getDivisiondistinction() {
		return divisiondistinction;
	}
	public void setDivisiondistinction(String divisiondistinction) {
		this.divisiondistinction = divisiondistinction;
	}
	
	
	
	

}
