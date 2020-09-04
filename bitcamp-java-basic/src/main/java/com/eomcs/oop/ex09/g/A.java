package com.eomcs.oop.ex09.g;

public interface A {
  
  static String m1() {
    return "안녕하세요!";
  }
  
  default String m2() {
    return "안녕하세요!";
  }
  
  void m3();
}
