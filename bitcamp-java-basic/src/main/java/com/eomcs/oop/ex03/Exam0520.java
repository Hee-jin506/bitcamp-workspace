package com.eomcs.oop.ex03;

import java.sql.Date;

public class Exam0520 {
  static class A {
    byte b2;
    short s2;
    int i2;
    long l2;
    char c2;
    float f2;
    double d2;
    boolean bool2;
    String str2;
    Date date2;
  }
  
  public static void main(String[] args) {
    A obj = new A();
    
    System.out.printf("%d, %d, %d, %d, %c, %.1f, %.1f, %b, %s, %s\n",
        obj.b2, obj.s2, obj.i2, obj.l2, obj.c2, obj.f2, obj.d2, obj.bool2, obj.str2, obj.date2);
  }
}
