package com.eomcs.corelib.ex01;

import java.util.HashMap;

public class Exam0152 {
  
  static class MyKey {
    String contents;
    
    public MyKey(String contents) {
      this.contents = contents;
    }
    
    @Override
    public String toString() {
      return "MyKey [contents=" + contents + "]";
    }
  }
  
  public static void main(String[] args) {
    HashMap<MyKey,Student> map = new HashMap<>();
    
    MyKey k1 = new MyKey("ok");
    MyKey k2 = new MyKey("no");
    MyKey k3 = new MyKey("haha");
    MyKey k4 = new MyKey("ohora");
    MyKey k5 = new MyKey("hul");
    
    map.put(k1, new Student("홍길동", 20, false));
    map.put(k2, new Student("임꺽정", 30, false));
    map.put(k3, new Student("유관순", 17, true));
    map.put(k4, new Student("안중근", 24, true));
    map.put(k5, new Student("윤봉길", 22, false));
    
    
    System.out.println(map.get(k3));
    
    MyKey k6 = new MyKey("haha");
    
    System.out.println(map.get(k6));
    
    System.out.println(k3 == k6);
    System.out.printf("k3(%s), k6(%s)\n", k3, k6);
    System.out.println(k3.hashCode());
    System.out.println(k6.hashCode());
    System.out.println(k3.equals(k6));
  }
}
