package com.eomcs.oop.ex12;

public class Exam0130 {
  
  static interface Player {
    void play(String name);
  }
  
  public static void main(String[] args) {
    Player p1 = (String name) -> System.out.println(name + " 님 환영합니다.");
    Player p2 = (name) -> System.out.println(name + " 님 환영합니다.");
    Player p3 = name -> System.out.println(name + " 님  환영합니다.");
  }

}
