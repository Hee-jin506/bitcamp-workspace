package com.eomcs.generic.ex01;

import java.util.ArrayList;

public class Exam0231 {
  
  static class A {}
  static class B1 extends A {}
  static class B2 extends A {}
  static class C extends B1 {}
  
  public static void main(String[] args) {
    ArrayList<B1> list1 = new ArrayList<>();
    
//    list1.add(new Object());
//    list1.add(new String());
//    list1.add(new Integer(100));
//    list1.add(new Member("홍길동", 20));
//    list1.add(new A());
    list1.add(new B1());
//    list1.add(new B2());
    list1.add(new C());
    System.out.println("종료!");
  }
}
