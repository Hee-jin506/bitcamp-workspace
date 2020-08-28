package com.eomcs.oop.ex03;

public class Exam0220 {
  
  static class A {
    int value;
    
    static void m1() {
      // this.value = 100;
    }
    
    void m2() {
      this.value = 100;
    }
    
    void m3() {
      value = 200;
    }
    
    void m4(int value) {
      value = 200;
      
      // 호컬 변수의 이름이 인스턴스 이름과 같은 경우
      // this를 붙이지 않으면 로컬 변수를 가리키게 된다.
      
      this.value = 300;
    }
  }
  
  public static void main(String[] args) {
    A.m1();
    
    A obj1 = new A();
    
    obj1.m2();
    
    // 레퍼런스를 갖고 호출은 가능하지만
    // 그렇다고 인스턴스 주소가 메서드에 전달되지 않는다.
    // 그래서 클래스 메서드는 내장 변수가 없다.
    obj1.m1();
    
    A obj2 = new A();
    
    obj2.m2();
  }

}
