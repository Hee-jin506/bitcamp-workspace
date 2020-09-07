package com.eomcs.jeongseok.ch7;

public class InterfaceTest3 {
  public static void main(String[] args) {
    A a = new A();
    a.methodA();
  }
  static class A {
    void methodA() {
      // 제 3의 클래스의 메서드를 통해서
      // 인터페이스 i를 구현한 클래스의 인스턴스를 얻어온다.
      I i = InstanceManager.getInstance();
      i.methodB();
      System.out.println(i.toString());
    }
  }
  
  static interface I {
    public abstract void methodB();
  }
  
  static class B implements I {
    @Override
    public void methodB() {
      System.out.println("methodB in B class");
    }
    
    @Override
    public String toString() { return "class B";}
  }
  
  static class InstanceManager {
    public static I getInstance() {
      return new B();
    }
  }
}

