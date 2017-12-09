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
@Table(name = "EMPLOYEE_POLICY")
public class Policy implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="LIC_POLICY_ID")
	private Integer licPolicyId;
	@Column(name="POLICY_PERSON_NAME")
	private String policyPersonName;
	@Column(name="POLICY_PERSON_AGE")
	private String policyPersonAge;
	@Column(name="POLICY_PERSON_PERCENTAGE")
	private String policyPersonpercentage;
	@Column(name="POLICY_PERSON_GENDER")
	private String policyPersongender;
	@Column(name="POLICY_PERSON_DOB")
	private Date policyPersonDateBirth;
	@Column(name="POLICY_EMP_RELATION")
	private String policyEmprelationShip;
	public Integer getLicPolicyId() {
		return licPolicyId;
	}
	public void setLicPolicyId(Integer licPolicyId) {
		this.licPolicyId = licPolicyId;
	}
	public String getPolicyPersonName() {
		return policyPersonName;
	}
	public void setPolicyPersonName(String policyPersonName) {
		this.policyPersonName = policyPersonName;
	}
	public String getPolicyPersonAge() {
		return policyPersonAge;
	}
	public void setPolicyPersonAge(String policyPersonAge) {
		this.policyPersonAge = policyPersonAge;
	}
	public String getPolicyPersonpercentage() {
		return policyPersonpercentage;
	}
	public void setPolicyPersonpercentage(String policyPersonpercentage) {
		this.policyPersonpercentage = policyPersonpercentage;
	}
	public String getPolicyPersongender() {
		return policyPersongender;
	}
	public void setPolicyPersongender(String policyPersongender) {
		this.policyPersongender = policyPersongender;
	}
	public Date getPolicyPersonDateBirth() {
		return policyPersonDateBirth;
	}
	public void setPolicyPersonDateBirth(Date policyPersonDateBirth) {
		this.policyPersonDateBirth = policyPersonDateBirth;
	}
	public String getPolicyEmprelationShip() {
		return policyEmprelationShip;
	}
	public void setPolicyEmprelationShip(String policyEmprelationShip) {
		this.policyEmprelationShip = policyEmprelationShip;
	}
	
	
	

}
