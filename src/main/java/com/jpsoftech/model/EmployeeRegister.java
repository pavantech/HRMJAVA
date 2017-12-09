package com.jpsoftech.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "EMPLOYER_REG")
public class EmployeeRegister implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="EMPLOYER_ID")
	private Integer employerId;
	@Column(name="EMP_ID")
	private String empId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="EMAIL_ID")
	private String emailId;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="DATE_OF_BIRTH")
	private String dataOfBirth;
	@Column(name="GENDER")
	private String gender;
	@Column(name="AGE")
	private String age;
	@Column(name="MARITAL_STATUS")
	private String maritalstatus;
	@Column(name="DATE_OF_JOINING")
	private String dateOfJoining;
	@Column(name="BANK_NAME")
	private String bankName;
	@Column(name="BANK_ACCOUNT_NUMBER")
	private String bankAccountNumber;
	@Column(name="BANK_IFS_CODE")
	private String bankIfsCode;
	@Column(name="BANK_ADDRESS")
	private String bankAddress;
	@Column(name="PASSPORT_ID")
	private String passportId;
	@Column(name="PASSPORT_VALID_FROM")
	private String passportValidFrom;
	@Column(name="PASSPORT_VALID_TO")
	private String passportValidTO;
	@Column(name="FATHER_NAME")
	private String fatherName;
	@Column(name="HUSBAND_NAME")
	private String husbandName;
	@Column(name="EMERGENCY_NUMBER")
	private String emergencyNumber;
	@Column(name="RELIGION")
	private String religion;
	@ManyToOne
	@JoinColumn(name = "licPolicyId")
	private Policy licPolicy;
	@Column(name="PHONE_WITH_CODE")
	private String phoneWithCode;
	@ManyToOne
	@JoinColumn(name = "qualificationId")
	private QalificationDetails qualification;
	@Column(name="priviousEmployeeId")
	private PreviousEmployee previousEmployee;
	@Column(name="designation")
	private String designation;
	@Column(name="DEPARTMENT")
	private String department;
	@Column(name="leadId")
	private String leadId;
	@Column(name="PERMANENT_ADDRESS")
	private String address;
	@Column(name="PERMANENT_CITY")
	private String city;
	@Column(name="PERMANENT_STATE")
	private String state;
	@Column(name="PERMANENT_ZIPCODE")
	private String zipcode;
	@Column(name="PERMANENT_COUNTRY")
	private String country;
	@Column(name="CURRENT_ADDRESS")
	private String currentaddress;
	@Column(name="CURRENT_CITY")
	private String currentcity;
	@Column(name="CURRENT_STATE")
	private String currentstate;
	@Column(name="CURRENT_ZIPCODE")
	private String currentzipcode;
	@Column(name="CURRENT_COUNTRY")
	private String currentcountry;
	@Column(name="ORGANIZATION_NAME")
	private String organizationName;
	@Column(name="AADHAAR_NUMBER")
	private String aadhaarNumber;
	@Column(name="PAN_NUMBER")
	private String panNumber;
	@Column(name="pfAccountId")
	private PfAccount pfAccount;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CLIENT_ID", nullable = false)
	private ClientRegister clientRegister;
	
	
	public Integer getEmployerId() {
		return employerId;
	}
	public void setEmployerId(Integer employerId) {
		this.employerId = employerId;
	}
	public ClientRegister getClientRegister() {
		return clientRegister;
	}
	public void setClientRegister(ClientRegister clientRegister) {
		this.clientRegister = clientRegister;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPhoneWithCode() {
		return phoneWithCode;
	}
	public void setPhoneWithCode(String phoneWithCode) {
		this.phoneWithCode = phoneWithCode;
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
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getAadhaarNumber() {
		return aadhaarNumber;
	}
	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getDataOfBirth() {
		return dataOfBirth;
	}
	public void setDataOfBirth(String dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public String getBankIfsCode() {
		return bankIfsCode;
	}
	public void setBankIfsCode(String bankIfsCode) {
		this.bankIfsCode = bankIfsCode;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	public String getPassportId() {
		return passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}
	public String getPassportValidFrom() {
		return passportValidFrom;
	}
	public void setPassportValidFrom(String passportValidFrom) {
		this.passportValidFrom = passportValidFrom;
	}
	public String getPassportValidTO() {
		return passportValidTO;
	}
	public void setPassportValidTO(String passportValidTO) {
		this.passportValidTO = passportValidTO;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getHusbandName() {
		return husbandName;
	}
	public void setHusbandName(String husbandName) {
		this.husbandName = husbandName;
	}
	public String getEmergencyNumber() {
		return emergencyNumber;
	}
	public void setEmergencyNumber(String emergencyNumber) {
		this.emergencyNumber = emergencyNumber;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	
	public Policy getLicPolicy() {
		return licPolicy;
	}
	public void setLicPolicy(Policy licPolicy) {
		this.licPolicy = licPolicy;
	}
	public QalificationDetails getQualification() {
		return qualification;
	}
	public void setQualification(QalificationDetails qualification) {
		this.qualification = qualification;
	}
	public PreviousEmployee getPreviousEmployee() {
		return previousEmployee;
	}
	public void setPreviousEmployee(PreviousEmployee previousEmployee) {
		this.previousEmployee = previousEmployee;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getLeadId() {
		return leadId;
	}
	public void setLeadId(String leadId) {
		this.leadId = leadId;
	}
	public String getCurrentaddress() {
		return currentaddress;
	}
	public void setCurrentaddress(String currentaddress) {
		this.currentaddress = currentaddress;
	}
	public String getCurrentcity() {
		return currentcity;
	}
	public void setCurrentcity(String currentcity) {
		this.currentcity = currentcity;
	}
	public String getCurrentstate() {
		return currentstate;
	}
	public void setCurrentstate(String currentstate) {
		this.currentstate = currentstate;
	}
	public String getCurrentzipcode() {
		return currentzipcode;
	}
	public void setCurrentzipcode(String currentzipcode) {
		this.currentzipcode = currentzipcode;
	}
	public String getCurrentcountry() {
		return currentcountry;
	}
	public void setCurrentcountry(String currentcountry) {
		this.currentcountry = currentcountry;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public PfAccount getPfAccount() {
		return pfAccount;
	}
	public void setPfAccount(PfAccount pfAccount) {
		this.pfAccount = pfAccount;
	}
	
	

}
