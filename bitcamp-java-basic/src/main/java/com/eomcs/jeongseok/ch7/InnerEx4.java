package com.eomcs.jeongseok.ch7;

class Outer {
  class InstanceInner {
    int iv = 100;
  }
  
  static class StaticInner {
    int iv = 200;
    static int cv = 300;
  }
  
  void myMethod() {
    class LocalInner {
      int iv = 400;
    }
  }
}

public class InnerEx4 {
  public static void main(String[] args) {
    // 인스턴스 클래스의 객체를 생성하려면
    // 외부클래스의 객체를 먼저 생성해야한다.
    Outer oc = new Outer();
    Outer.InstanceInner ii = oc.new InstanceInner();
    
    System.out.println("ii.iv : " + ii.iv);
    // 스태틱 클래스의 스태틱 멤버를 사용할때는
    // 외부 클래스의 객체도,스태틱 클래스의 객체도 필요없다.
    // 두 클래스의 이름만으로 호출이 가능하다
    System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);
    
    // 스태틱 클래스의 인스턴스 멤버를 사용할때는
    // 외부 클래스의 객체는 필요없으나
    // 스태틱 클래스의 객체는 필요하다
    Outer.StaticInner si = new Outer.StaticInner();
    System.out.println("si.iv : " + si.iv);
  }
}
