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
@Table(name = "EMPLOYEE_PF")
public class PfAccount implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PF_ACCOUNT_ID")
	private Integer pfAccountId;
	@Column(name="UAN")
	private String UAN;
	@Column(name="PF_ACCOUNT_NUMBER")
	private String PFACCOUNTNUMBER;
	@Column(name="DATE_OF_JOINING")
	private Date dateOfJoinging;
	@Column(name="DATE_OF_EXIT")
	private Date dateOfExit;
	@Column(name="SCHEMA_CERT_NO")
	private String schemaCertificateNo;
	@Column(name="PPONO")
	private String ppoNo;
	@Column(name="NON_CONT_PERIOD")
	private String nonContributaryPeriod;
	
	
	
}
