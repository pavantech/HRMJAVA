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
@Table(name = "EMPLOYEE_PRE_ORG")
public class PreviousEmployee  implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PRV_EMP_ID")
	private Integer priviousEmployeeId;
	@Column(name="ORG_EMP_ID")
	private String employeeId;
	@Column(name="ORG_NAME")
	private String organizationName;
	@Column(name="DATE_OF_JOINING")
	private Date periodFROM;
	@Column(name="DATE_OF_END")
	private Date periodTo;
	@Column(name="GROSS_SALARY")
	private String grossSalary;
	@Column(name="DESIGNATION")
	private String designation;
	@Column(name="HR_NAME")
	private String hrName;
	@Column(name="HR_PHONE")
	private String hrPhone;
	@Column(name="ORG_PHONE")
	private String orgPhone;
	@Column(name="ORG_EXT")
	private String orgExtension;
	@Column(name="REF_EMP_NAME1")
	private String refEmpName1;
	@Column(name="REF_EMP_MOB1")
	private String refEmpMob1;
	@Column(name="REF_EMP_NAME2")
	private String refEmpName2;
	@Column(name="REF_EMP_MOB2")
	private String refEmpMob2;
	@Column(name="REF_EMP_NAME3")
	private String refEmpName3;
	@Column(name="REF_EMP_MOB3")
	private String refEmpMob3;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="CITY")
	private String city;
	@Column(name="STATE")
	private String state;
	@Column(name="ZIPCODE")
	private String zipcode;
	@Column(name="COUNTRY")
	private String country;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public Date getPeriodFROM() {
		return periodFROM;
	}
	public void setPeriodFROM(Date periodFROM) {
		this.periodFROM = periodFROM;
	}
	public Date getPeriodTo() {
		return periodTo;
	}
	public void setPeriodTo(Date periodTo) {
		this.periodTo = periodTo;
	}
	public String getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(String grossSalary) {
		this.grossSalary = grossSalary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getHrName() {
		return hrName;
	}
	public void setHrName(String hrName) {
		this.hrName = hrName;
	}
	public String getHrPhone() {
		return hrPhone;
	}
	public void setHrPhone(String hrPhone) {
		this.hrPhone = hrPhone;
	}
	public String getOrgPhone() {
		return orgPhone;
	}
	public void setOrgPhone(String orgPhone) {
		this.orgPhone = orgPhone;
	}
	public String getOrgExtension() {
		return orgExtension;
	}
	public void setOrgExtension(String orgExtension) {
		this.orgExtension = orgExtension;
	}
	public String getRefEmpName1() {
		return refEmpName1;
	}
	public void setRefEmpName1(String refEmpName1) {
		this.refEmpName1 = refEmpName1;
	}
	public String getRefEmpMob1() {
		return refEmpMob1;
	}
	public void setRefEmpMob1(String refEmpMob1) {
		this.refEmpMob1 = refEmpMob1;
	}
	public String getRefEmpName2() {
		return refEmpName2;
	}
	public void setRefEmpName2(String refEmpName2) {
		this.refEmpName2 = refEmpName2;
	}
	public String getRefEmpMob2() {
		return refEmpMob2;
	}
	public void setRefEmpMob2(String refEmpMob2) {
		this.refEmpMob2 = refEmpMob2;
	}
	public String getRefEmpName3() {
		return refEmpName3;
	}
	public void setRefEmpName3(String refEmpName3) {
		this.refEmpName3 = refEmpName3;
	}
	public String getRefEmpMob3() {
		return refEmpMob3;
	}
	public void setRefEmpMob3(String refEmpMob3) {
		this.refEmpMob3 = refEmpMob3;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
