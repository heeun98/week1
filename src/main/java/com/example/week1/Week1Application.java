package com.example.week1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.datasource.init.ScriptUtils;

@SpringBootApplication
public class Week1Application {

  public static void main(String[] args) {
    SpringApplication.run(Week1Application.class, args);

    Student student1 = new Student("백지훈", 25);
    System.out.println("이름: " + student1.getName() + ", 나이: " + student1.getAge());
  }
}
