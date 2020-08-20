package com.eomcs.corelib.ex08;

import java.util.HashMap;
import java.util.Hashtable;

public class Exam0310 {
  public static void main(String[] args) {
    HashMap map = new HashMap();
    map.put(null, "홍길동");
    map.put("s01", null);
    
    System.out.println(map.get(null));
    System.out.println(map.get("s01"));
    System.out.println("--------------------");
    
    Hashtable table = new Hashtable();
    // table.put(null, "홍길동");
    // table.put("s02",null);
  }
  
}
