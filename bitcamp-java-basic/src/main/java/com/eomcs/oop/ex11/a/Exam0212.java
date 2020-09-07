package com.eomcs.oop.ex11.a;

public class Exam0212 {
  public static void main(String[] args) {
    Exam0211.A obj;
    obj = new Exam0211.A();
    
    Exam0211.B obj2;
//    obj2 = new Exam0211.B();
    
    Exam0211 outer = new Exam0211();
    obj2 = outer.new B();
    
    outer.iValue = 100;
    outer.im();
  }

}
