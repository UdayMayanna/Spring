package com.springcore.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
  //@Autowired
  //-> Autowiring using property
   private Course course;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Autowired  
//-> Autowiring using constructor
public Student(@Qualifier("course2") Course course) {
	super();
	System.out.println("Constructor is called");
	this.course = course;
}

public Course getCourse() {
	return course;
}

//@Autowired
//-> Autowiring using stter method
public void setCourse(Course course) {
	this.course = course;
	System.out.println("Setting Value");
}

@Override
public String toString() {
	return "Student [course=" + course + "]";
}

}
