package com.eomcs.generic.ex01;

import java.util.ArrayList;

public class Exam0212 {
  public static void main(String[] args) {
    ArrayList<Object> list1;
    
    list1 = new ArrayList(); // 이렇게 사용하지 말고, 명확히 제네릭의 타입을 지정해줘라.
    list1 = new ArrayList<>();
    list1 = new ArrayList<Object>();
    
    list1.add(new String());
    list1.add(new java.util.Date());
    list1.add(new Integer(100));
    list1.add(new StringBuffer());
    
//    list1 = new ArrayList<String>();
//    list1 = new ArrayList<Integer>();
  }

}