package com.eomcs.corelib.ex01;

import java.util.HashMap;

public class Exam0155 {
  public static void main(String[] args) {
    HashMap<String, Student> map = new HashMap<>();
    
    String k1 = new String("ok");
    String k2 = new String("no");
    String k3 = new String("haha");
    String k4 = new String("ohora");
    String k5 = new String("hul");
    
    map.put("ok", new Student("홍길동", 20, false));
    map.put("no", new Student("임꺽정", 30, true));
    map.put("haha", new Student("유관순", 17, true));
    map.put("ohora", new Student("안중근", 24, true));
    map.put("hul", new Student("윤봉길", 22, false));
    
    System.out.println(map.get(k3));
    
    String k6 = new String("haha");
    
    System.out.println(k3 == k6);
    
    System.out.println(k3.hashCode());
    System.out.println(k6.hashCode());
    
    System.out.println(k3.equals(k6));
    
    System.out.println(map.get(k6));
    
    String k7 = new String("Haha");
    System.out.println(map.get(k7));
    
  }
}
