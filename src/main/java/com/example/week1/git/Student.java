package com.example.week1.git;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Student {

  private String name;
  private int age;

  public static void main(String[] args) {
    Student student1 = new Student("백지훈", 25);
    System.out.println("이름: " + student1.getName() + ", 나이: " + student1.getAge());
  }
}
