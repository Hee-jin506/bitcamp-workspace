package com.eomcs.basic.ex04;

public class Exam0413 {
  public static void main(String[] args) {
    long l = 100;
    int i = 100;
    short s = 100;
    byte b = 100;
    char c = 100;
    
    long l2;
    int i2;
    short s2;
    byte b2;
    char c2;
    
    l2 = l;
    // i2  = l;
    // s2 = l;
    // b2 = l;
    // c2 = l;
    
    l2 = i;
    i2 = i;
    // s2 = i;
    // b2 = i;
    // c2 = i;
    
    l2 = s;
    i2 = s;
    s2 = s;
    // b2 = s;
    // c2 = s; // char(0~65535) | int(-32768~32767)
    
    l2 = b;
    i2 = b;
    s2 = b;
    b2 = b;
    // c2 = b;
        
  }

}