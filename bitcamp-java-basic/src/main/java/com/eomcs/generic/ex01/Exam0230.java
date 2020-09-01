package com.eomcs.generic.ex01;

import java.util.ArrayList;

public class Exam0230 {
  public static void main(String[] args) {
    ArrayList<Object> list1;
    list1 = new ArrayList<Object>();
    
    list1.add(new Object());
    list1.add(new String());
    list1.add(new Integer(100));
    list1.add(new Member("홍길동", 20));
    
    Object obj = list1.get(0);
    String str = (String) list1.get(1);
    Integer i = (Integer) list1.get(2);
    Member m = (Member) list1.get(3);
    
    System.out.println("종료!");
  }

}
