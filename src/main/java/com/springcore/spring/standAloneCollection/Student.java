package com.springcore.spring.standAloneCollection;

import java.util.List;

public class Student {
    private List<String> course;

    public Student(List<String> course) {
        this.course = course;
    }
    public Student(){
        super();
    }

    public List<String> getCourse() {
        return course;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [course=" + course + "]";
    }
    
}
