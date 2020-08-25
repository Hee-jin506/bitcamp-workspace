package com.eomcs.basic.ex05;

public class Exam0170 {
  public static void main(String[] args) {
    byte b;
    
    // b = 256;
    
    b = (byte) 256;
    // int (4 byte) => 0000 0000 0000 0000 0000 0001 0000 0000
    // byte (1 byte)=> ---- ---- ---- ---- ---- ---- 0000 0000
    System.out.println(b); 
    
    // 결론
    // 큰 메모리 값을 작은 메모리에 넣으려고 형변환을 사용하기도 하지만
    // 형변환하더라도 값이 잘리지 않을 때만 해라
  }

}
