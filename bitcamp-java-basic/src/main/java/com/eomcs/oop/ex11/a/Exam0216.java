package com.eomcs.oop.ex11.a;

public class Exam0216 {
  public static void main(String[] args) {
    Exam0215 outer = new Exam0215();
    
    Exam0215.A obj;
    
    obj = outer.new A();
    // obj = new A(outer);
    // invokespecial com.eomcs.oop.ex11.a.Exam0215$A(com.eomcs.oop.ex11.a.Exam0215)
    
    obj = outer.new A(100);
    // obj = new A(outer, 100);
    // invokespecial com.eomcs.oop.ex11.a.Exam0215$A(com.eomcs.oop.ex11.a.Exam0215, int) [28]
  }

}
