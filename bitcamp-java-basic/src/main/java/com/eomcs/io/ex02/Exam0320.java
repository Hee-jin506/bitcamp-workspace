package com.eomcs.io.ex02;

import java.io.FileInputStream;
import java.io.IOException;

public class Exam0320 {
  
  public static void main(String[] args) throws IOException {
    FileInputStream in = new FileInputStream("temp/test1.data");
    
    byte[] buf = new byte[100];
    
    int count = in.read(buf, 10, 40);
    
    in.close();
    
    System.out.printf("%d\n", count);
    
    for (int i = 0; i < 20; i++)
      System.out.printf("%x ", buf[i]);
  }

}
