package com.eomcs.exception.ex3;

public class Exam0640 {
  
  static class A {
    
  }
  
  static class B {
    public void close() throws Exception {
      System.out.println("B 클래스의 자원을 해제");
    }
  }
  
  static class C implements AutoCloseable {
    @Override
    public void close() throws Exception {
      System.out.println("C 클래스의 자원을 해제");
    }
  }
  
  public static void main(String[] args) throws Exception {
    try (
        
//        A obj = new A();
//        B obj2 = new B();
        C obj3 = new C();
        ) {
      System.out.println("try 블록 실행!");
    }
    
  }

}
