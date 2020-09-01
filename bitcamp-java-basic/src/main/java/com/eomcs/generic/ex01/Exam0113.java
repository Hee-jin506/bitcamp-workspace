package com.eomcs.generic.ex01;

public class Exam0113 {
  
  static class Box<T> {
    T value;
    
    public void set(T value) {
      this.value = value;
    }
    
    public T get() {
      return value;
    }
  }
  
  public static void main(String[] args) {
    Box<Member> box1;
    
    box1 = new Box<Member>();
    
    box1 = new Box<>();
    
    box1 = new Box();
    // 이렇게 하면 경고가 드며 내부적으로 Object 타입으로 지정한다.
    
    Box box3 = new Box<Member>();
    box3.get();
    
    Box<?> box4 = new Box<Member>();
    box4.get();
    
    Box<Member> box5 = new Box();
    box5.get();
    
    box1.set(new Member("홍길동", 20));
    
    Member m = box1.get();
    System.out.println(m);
    
//    box1.set(new String("Hello"));
  }

}
