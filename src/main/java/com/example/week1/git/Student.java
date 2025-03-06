package com.example.week1.git;

import lombok.Getter;

@Getter
public class Student {

  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public static void main(String[] args) {
    Student student1 = new Student("홍길동", 25);
    System.out.println("이름: " + student1.getName() + ", 나이: " + student1.getAge());
  }
}
