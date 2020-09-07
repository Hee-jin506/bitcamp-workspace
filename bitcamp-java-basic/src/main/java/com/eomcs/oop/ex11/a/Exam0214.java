package com.eomcs.oop.ex11.a;

public class Exam0214 {
  public static void main(String[] args) {
    Exam0213 outer = new Exam0213();
    
    Exam0213.A obj;
    
    obj = outer.new A();
    // obj = new A(outer);
    
    Exam0213.A obj2 = new Exam0213().new A();
    
    // obj2 = new A(new Exam0213());
  }

}
