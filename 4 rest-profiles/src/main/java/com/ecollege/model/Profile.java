package com.ecollege.model;
import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Profile")
public class Profile implements Serializable{

	private static final long serialVersionUID = 6586862029509019898L;

	@Id
	private long studentId;
	private String firstName;
	private String surName;
	private String email;
	private String confirmEmail;
	private String password;
	private String confirmPassword;
	private Date dob;
	private String nationality;
	private String course;
	private String intake;
	private String currentAddress;
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Profile(long studentId, String firstName, String surName, String email, String confirmEmail, String password,
			String confirmPassword, Date dob, String nationality, String course, String intake, String currentAddress) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.surName = surName;
		this.email = email;
		this.confirmEmail = confirmEmail;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.dob = dob;
		this.nationality = nationality;
		this.course = course;
		this.intake = intake;
		this.currentAddress = currentAddress;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConfirmEmail() {
		return confirmEmail;
	}

	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getIntake() {
		return intake;
	}

	public void setIntake(String intake) {
		this.intake = intake;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	@Override
	public String toString() {
		return "Profile [studentId=" + studentId + ", firstName=" + firstName + ", surName=" + surName + ", email="
				+ email + ", confirmEmail=" + confirmEmail + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", dob=" + dob + ", nationality=" + nationality + ", course=" + course + ", intake="
				+ intake + ", currentAddress=" + currentAddress + "]";
	}
}
