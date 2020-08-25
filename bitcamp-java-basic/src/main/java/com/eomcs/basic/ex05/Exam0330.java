package com.eomcs.basic.ex05;

public class Exam0330 {
  public static void main(String[] args) {
    boolean a = false;
    boolean b = false;
    boolean r = a && (b = true);
    
    System.out.printf("a = %b, b = %b, r = %b\n", a, b, r);
    
    a = false;
    b = false;
    r = a & (b = true);
    System.out.printf("a = %b, b = %b, r = %b\n", a, b, r);
    
  }

}
