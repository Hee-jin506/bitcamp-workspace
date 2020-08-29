package com.eomcs.corelib.ex01;

public class Exam0140 {
  
  static class My {
    String name;
    int age;
  }
  
  public static void main(String[] args) {
    My obj1 = new My();
    obj1.name = "홍길동";
    obj1.age = 20;
    
    My obj2 = new My();
    obj2.name = "홍길동";
    obj2.age = 20;
    
    System.out.println(Integer.toHexString(obj1.hashCode()));
    System.out.println(Integer.toHexString(obj2.hashCode()));
    
    System.out.println(obj1);
    System.out.println(obj2);
  }

}
