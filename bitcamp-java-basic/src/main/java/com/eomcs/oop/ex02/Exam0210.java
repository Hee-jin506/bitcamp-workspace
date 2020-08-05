package com.eomcs.oop.ex02;

import com.eomcs.util.Calculator;

public class Exam0210 {  
  public static void main(String[] args) {
    
    Calculator c1 = new Calculator();
    c1.plus(2);
    c1.plus(3);
    c1.plus(4);
    c1.minus(5);
    c1.multiple(6);
    c1.divide(7);
    
    printResult(c1.result);
  }
  
  static void printResult(int value) {
    System.out.println(value);
  }
}