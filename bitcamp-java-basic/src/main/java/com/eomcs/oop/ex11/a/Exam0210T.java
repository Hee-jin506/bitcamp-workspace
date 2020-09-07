package com.eomcs.oop.ex11.a;

public class Exam0210T {
  public static void main(String[] args) {
    Exam0210 obj = new Exam0210();
    
    Exam0210.sValue = 100;
    Exam0210.sm();
    
    // Exam0210.iValue = 100;
    // Exam0210.im();
    
    obj.iValue = 100;
    obj.im();
    
    Exam0210.A obj2;
    
    // obj2 = new Exam0210.A(); 
    
    obj2 = obj.new A();
//    obj2 = new obj.A();
    obj2.m1();
    
  }

}
