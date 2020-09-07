package com.eomcs.jeongseok.ch7;

public class DefaultMethodTest {
  public static void main(String[] args) {
    Child c = new Child();
    c.method1();
    c.method2();
    MyInterface.staticMethod();
    MyInterface.staticMethod();
  }

}

class Child extends Parent implements MyInterface, MyInterface2 {
  @Override
  public void method1() {
    System.out.println("Method1() int Child");
  }
}

class Parent {
  public void method2() {
    System.out.println("method2() int Parent");
  }
}

interface MyInterface {
  default void method1() {
    System.out.println("method() in MyInterface");
  }
  
  default void method2() {
    System.out.println("method2() in MyInteface");
  }
  
  static void staticMethod() {
    System.out.println("staticMethod() in MyInterface");
  }
}

interface MyInterface2 {
  default void method1() {
    System.out.println("method1() in MyInterface");
  }
  
  static void staticMethod() {
    System.out.println("staticMethod() in MyInterface");
  }
}
