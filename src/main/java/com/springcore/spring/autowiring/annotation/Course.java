package com.springcore.spring.autowiring.annotation;

public class Course {
   private String courseName;
   private int courseId;
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public Course(String courseName, int courseId) {
	super();
	this.courseName = courseName;
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
@Override
public String toString() {
	return "Course [courseName=" + courseName + ", courseId=" + courseId + "]";
}
   
}
