package com.eomcs.corelib.ex01;

public class Exam0160 {
  static class My {
    
  }
  
  public static void main(String[] args) {
    My obj1 = new My();
    
    Class<?> classInfo = obj1.getClass();
    System.out.println(classInfo.getName());
    System.out.println(classInfo.getSimpleName());
  }

}
