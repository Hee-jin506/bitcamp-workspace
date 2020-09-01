package com.eomcs.generic.ex01;

public class Exam0112 {
  
  static class ObjectBox {
    Object value;
    
    public void set(Object value) {
      this.value = value;
    }
    
    public Object get() {
      return value;
    }
  }
  
  public static void main(String[] args) {
    ObjectBox box1 = new ObjectBox();
    
    box1.set(new Member("홍길동", 20));
    
    box1.set(new String("Hello"));
    
    
  }
}
