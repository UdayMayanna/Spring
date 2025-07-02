package com.springcore;

public class Student {
   private int studentId;
   private String studentName;
   private String studentCity;
   private String studentAge;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int studentId, String studentName, String studentCity, String studentAge) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentCity = studentCity;
	this.studentAge = studentAge;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentCity() {
	return studentCity;
}
public void setStudentCity(String studentCity) {
	this.studentCity = studentCity;
}
public String getStudentAge() {
	return studentAge;
}
public void setStudentAge(String studentAge) {
	this.studentAge = studentAge;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
			+ ", studentAge=" + studentAge + "]";
}     
}
