package com.eomcs.basic.ex07;

public class Exam0610 {
  public static void main(String[] args) {
    
 // $java -cp ./bin/main -D이름=값 -D이름=값 -D이름=값 com.eomcs.basic.ex07.Exam0610
    String value1 = System.getProperty("a");
    String value2 = System.getProperty("b");
    String value3 = System.getProperty("c");
    
    System.out.println(value1);
    System.out.println(value2);
    System.out.println(value3);
  }
}
