package com.eomcs.oop.ex12;

public class Exam0160 {
  
  static interface Player {
    int play(int a);
  }
  
  public static void main(String[] args) {
    
    m1((a) -> a);
  }
  
  static void m1(final Player obj) {
    obj.play(2);
  }
}
