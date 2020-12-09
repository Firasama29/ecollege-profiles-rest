package com.ecollege.model;
import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection = "Profile")
public class Profile implements Serializable{

	private static final long serialVersionUID = 6586862029509019898L;

	@Id
	private long studentId;
	private String studentName;
	private String email;
	private String confirmEmail;
	private String password;
	private String confirmPassword;
	private String nationality;
	private String course;
	private String intake;
	private int currentYear;
	private int graduationYear;
	private int age;
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(long studentId, String studentName, String email, String confirmEmail, String password,
			String confirmPassword, String nationality, String course, String intake, int currentYear,
			int graduationYear, int age) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.email = email;
		this.confirmEmail = confirmEmail;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.nationality = nationality;
		this.course = course;
		this.intake = intake;
		this.currentYear = currentYear;
		this.graduationYear = graduationYear;
		this.age = age;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
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

	public int getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}

	public int getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Profile [studentId=" + studentId + ", studentName=" + studentName + ", email=" + email
				+ ", confirmEmail=" + confirmEmail + ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", nationality=" + nationality + ", course=" + course + ", intake="
				+ intake + ", currentYear=" + currentYear + ", graduationYear=" + graduationYear + ", age=" + age + "]";
	}
}
