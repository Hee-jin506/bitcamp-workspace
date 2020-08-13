package com.eomcs.corelib.ex01;

import java.util.HashMap;

public class Exam0154 {
  public static void main(String[] args) {
    HashMap<Integer, Student> map = new HashMap<>();
    
    Integer k1 = new Integer(101);
    Integer k2 = new Integer(102);
    Integer k3 = new Integer(103);
    
    map.put(k1, new Student("홍길동", 20, false));
    map.put(k2, new Student("임꺽정", 30, false));
    map.put(k3, new Student("유관순", 17, true));
    
    map.put(104, new Student("안중근", 24, true));
    map.put(105, new Student("윤봉길", 22, false));
    
    System.out.println(map.get(k2));
    
    Integer k6 = new Integer(102);
    
    System.out.println(map.get(k6));
    
    System.out.println(k2 == k6);
    
    System.out.println(k2.hashCode());
    
    System.out.println(k6.hashCode());
    
    System.out.println(k2.equals(k6));
  }

}
