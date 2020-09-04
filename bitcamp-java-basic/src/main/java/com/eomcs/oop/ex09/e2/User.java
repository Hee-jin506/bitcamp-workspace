package com.eomcs.oop.ex09.e2;

public class User {
  public static void main(String[] args) {
    play(new FirstComputer());
    
    play(new SecondComputer());
    
    play(new ThirdComputer());
    
    play2(new NewComputer());
  }
  
  static void play(Computer computer) {
    computer.compute();
    System.out.println("----------");
  }
  
  static void play2(Computer2 computer2) {
    computer2.compute();
    computer2.touch();
    System.out.println("----------");
  }

}
