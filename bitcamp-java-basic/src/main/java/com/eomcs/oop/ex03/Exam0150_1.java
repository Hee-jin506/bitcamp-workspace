package com.eomcs.oop.ex03;

public class Exam0150_1 {
  static class Student {
    static int count;
    
    String name;
    int age;
  }
  
  public static void main(String[] args) {
    Student.count = 0;
    
    Student s1 = new Student();
    s1.name = "홍길동";
    s1.age = 10;
    
    // Student.name = "홍길동";
    Student.count++;
    
    Student s2 = new Student();
    s2.name = "임꺽정";
    s2.age = 20;
    
    Student.count++;
    
    Student s3 = new Student();
    s3.name = "윤관순";
    s3.age = 30;
    
    Student.count++;
    
    System.out.printf("%d, %s, %d\n", Student.count, s1.name, s1.age);
    System.out.printf("%d, %s, %d\n", Student.count, s2.name, s2.age);
    System.out.printf("%d, %s, %d\n", Student.count, s3.name, s3.age);
    
    System.out.println(s1.count);
    System.out.println(s2.count);
    System.out.println(s3.count);
  }

}
