package com.eomcs.io.ex02;

import java.io.FileInputStream;
import java.io.IOException;

public class Exam0120 {
  
  public static void main(String[] args) throws IOException {
    FileInputStream in = new FileInputStream("temp/test1.data");
    
    int b = in.read();
    
    in.close();
    
    System.out.printf("%x\n", b);
    
  }

}
