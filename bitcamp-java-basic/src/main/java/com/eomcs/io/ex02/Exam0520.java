package com.eomcs.io.ex02;

import java.io.FileInputStream;
import java.io.IOException;

public class Exam0520 {
  
  public static void main(String[] args) throws IOException {
    StringBuffer strbuf = new StringBuffer();
    
    FileInputStream in = new FileInputStream("sample/ms949.txt");
    
    int b = in.read();
    System.out.printf("%x\n", b);
    
    b = in.read();
    System.out.printf("%x\n", b);
    
    b = in.read() << 8 | in.read();
    System.out.printf("%x\n", b);
    
    b = in.read() << 8 | in.read();
    System.out.printf("%x\n", b);
    
    in.close();
    
    System.out.println(strbuf.toString());
    
    
  }

}
