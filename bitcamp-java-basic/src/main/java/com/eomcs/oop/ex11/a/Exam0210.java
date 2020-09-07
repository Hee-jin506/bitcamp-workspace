package com.eomcs.oop.ex11.a;

public class Exam0210 {
  
  static int sValue;
  static void sm() {
    
  }
  
  int iValue;
  void im() {
    System.out.println("아우터 클래스의 메서드");
  }
  
  class A {
    
    void im() {
      System.out.println("이너 클래스의 메서드");
    }
    
    void m1() {
      sValue = 100;
      sm();
      
      Exam0210.this.iValue = 100;
      Exam0210.this.im();
      
      iValue = 100;
      im();
      
      // this.iValue = 100;
      // this.im();
    }
  }
  
  public static void main(String[] args) {
    Exam0210.A obj = new Exam0210().new A();
    
    obj.im();
  }
  

}
