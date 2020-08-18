package com.eomcs.corelib.ex08;

import java.util.HashMap;

public class Exam0111 {
  public static void main(String[] args) {
    Member v1 = new Member("홍길동", 20);
    Member v2 = new Member("임꺽정", 30);
    Member v3 = new Member("유관순", 16);
    Member v4 = new Member("안중근", 20);
    Member v5 = new Member("유관순", 16);
    
    HashMap map = new HashMap();
    
    map.put(new Integer(100), v1);
    map.put(Integer.valueOf(200), v2);
    map.put(300, v3);
    map.put(400, v4);
    
    map.put(400, v5);
    
    System.out.println(map.get(100));
    System.out.println(map.get(200));
    System.out.println(map.get(300));
    System.out.println(map.get(400));
    
    System.out.println(map.get(500));
  }
  
  
}
