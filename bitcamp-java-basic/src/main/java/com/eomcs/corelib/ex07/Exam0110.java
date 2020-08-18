package com.eomcs.corelib.ex07;

import java.util.HashSet;

public class Exam0110 {
  public static void main(String[] args) {
    String v1 = new String("aaa");
    String v2 = new String("bbb");
    String v3 = new String("ccc");
    String v4 = new String("ddd");
    String v5 = new String("ccc");
    
    HashSet set = new HashSet();
    set.add(v1);
    set.add(v2);
    set.add(v3);
    set.add(v4);
    set.add(v5);
    
    System.out.println(v3 == v5);
    System.out.println(v3.equals(v5));
    System.out.println(v3.hashCode() + "," + v5.hashCode());
    System.out.println("-----------------");
    
    print(set);
  }
  
  static void print(HashSet set) {
    for (Object value : set) {
      System.out.print(value + ",");
    }
    System.out.println();
  }

}
