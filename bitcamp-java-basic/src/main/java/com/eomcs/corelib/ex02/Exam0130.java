package com.eomcs.corelib.ex02;

public class Exam0130 {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    
    System.out.println(s1.hashCode() == s2.hashCode());
  }

}
