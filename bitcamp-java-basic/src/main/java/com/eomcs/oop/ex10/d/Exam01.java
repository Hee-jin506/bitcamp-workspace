package com.eomcs.oop.ex10.d;

public class Exam01 {
  
  public static void main(String[] args) {
    
    Hong s1= new Hong();
    Kim s2 = new Kim();
    
    s1.introduce();
    System.out.println("----------");
    
    s2.introduce();
    
    System.out.println("----------");
    
    hi(s1);
    
    System.out.println("----------");
    
    hi(s2);
  }
  
  static void hi(Student student) {
    student.introduce();
  }

}
