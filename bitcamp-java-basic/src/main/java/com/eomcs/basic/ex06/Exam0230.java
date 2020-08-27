package com.eomcs.basic.ex06;

public class Exam0230 {
  public static void main(String[] args) {
    byte b = 2;
    switch (b) {
      case 1:
      case 2:
      default:
    }
    
    short s = 2;
    switch (s) {
      case 1:
      case 2:
      default:
    }
    
    int i = 2;
    switch (i) {
      case 1:
      case 2:
      default:
    }
    
    char c = 'A';
    switch (c) {
      case 'A':
      case 66:
      case 0x43:
      default:
    }
    
    String str = "hello";
    switch (str) {
      case "hello":
      case "ohora":
      case "hul":
      default:
    }
  }

}
