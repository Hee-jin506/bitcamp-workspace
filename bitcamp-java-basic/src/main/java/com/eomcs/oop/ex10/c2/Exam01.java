package com.eomcs.oop.ex10.c2;

public class Exam01 {
  
  public static void main(String[] args) {
    Restaurant r = new Restaurant();
    Farm f = new Farm();
    
    work(r);
    
    System.out.println("-------------------");
    
    work(f);
    
  }
  
  static void work(Building obj) {
    obj.build();
  }
}
