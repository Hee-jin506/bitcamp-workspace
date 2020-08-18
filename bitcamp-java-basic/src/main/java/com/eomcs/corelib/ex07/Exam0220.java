package com.eomcs.corelib.ex07;

import java.util.Iterator;
import java.util.LinkedList;

public class Exam0220 {
  public static void main(String[] args) {
    String s1 = new String("aaa");
    String s2 = new String("bbb");
    String s3 = new String("ccc");
    String s4 = new String("ddd");
    String s5 = new String("eee");
    
    LinkedList list = new LinkedList();
    list.add(s1);
    list.add(s2);
    list.add(s3);
    list.add(s4);
    list.add(s5);
    
    Iterator iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + ", ");
    }
    System.out.println();
  }
}
