package com.springcore.spring.autowiring.annotation;

public class Student {
   private Course course;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(Course course) {
	super();
	this.course = course;
}

public Course getCourse() {
	return course;
}

public void setCourse(Course course) {
	this.course = course;
}

@Override
public String toString() {
	return "Student [course=" + course + "]";
}

}
