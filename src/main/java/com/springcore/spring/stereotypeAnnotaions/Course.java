package com.springcore.spring.stereotypeAnnotaions;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class Course {
   @Value("Java Full Stack")
   private String courseName;
   
   @Value("#{topic}")
   private List<String> topics;

   public String getCourseName() {
    return courseName;
   }

   public void setTopics(List<String> topics) {
      this.topics = topics;
   }

   public List<String> getTopics() {
      return topics;
   }

   public void setCourseName(String courseName) {
    this.courseName = courseName;
   }
   
   public Course(){
    super();
   }

    public Course(String courseName, List<String> topics) {
      this.courseName = courseName;
      this.topics = topics;
   }

    @Override
    public String toString() {
      return "Course [courseName=" + courseName + ", topics=" + topics + "]";
    }

}
