package com.springcore.spring.qualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private int studentId;
    private String studentName;

    private Course course;
    public Student(){
        super();
    }
    public Student(int studentId, String studentName , Course course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    @Autowired
    @Qualifier("course1")
    public void setCourse(Course course){
        this.course = course;
    }
    public int getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public Course getCourse() {
        return course;
    }
    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", course=" + course + "]";
    }
   
}
