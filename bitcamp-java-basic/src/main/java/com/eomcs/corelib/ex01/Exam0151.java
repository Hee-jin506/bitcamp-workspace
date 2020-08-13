package com.eomcs.corelib.ex01;

import java.util.HashSet;

public class Exam0151 {
  static class Student {
    String name;
    int age;
    boolean working;
  
  
  public Student(String name, int age, boolean working) {
    this.name = name;
    this.age = age;
    this.working = working;
  }
    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + age;
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + (working ? 1231 : 1237);
      return result;
    }
    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Student other = (Student) obj;
      if (age != other.age)
        return false;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      if (working != other.working)
        return false;
      return true;
    }
  } 
  public static void main(String[] args) {
    Student s1 = new Student("홍길동", 20, false);
    Student s2 = new Student("홍길동", 20, false);
    Student s3 = new Student("임꺽정", 21, true);
    Student s4 = new Student("유관순", 22, true);
    
    System.out.println(s1 == s2);
    
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());
    System.out.println(s4.hashCode());
    System.out.println("----------------");
    
    HashSet<Student> set = new HashSet<Student>();
    set.add(s1);
    set.add(s2);
    set.add(s3);
    set.add(s4);
    
    Object[] list = set.toArray();
    for (Object obj : list) {
      Student student = (Student) obj;
      System.out.printf("%s, %d, %s\n", 
          student.name, student.age, student.working ? "재직중" : "실업중");
    }
  }
  

}
