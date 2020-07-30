package com.eomcs.basic.ex06;

import java.util.ArrayList;

public class Exam0460 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("홍길동");
    list.add(3.14f);
    list.add(true);
    list.add(365);

    for (int i = 0; i < list.size(); i++)
      System.out.println(list.get(i));
  }
}
