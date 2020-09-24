package com.eomcs.io.ex02;

import java.io.FileInputStream;
import java.io.IOException;

public class Exam0522 {
  
  public static void main(String[] args) throws IOException {
    
    System.out.printf("file.encoding = %s\n", System.getProperty("file.encoding"));
    
    FileInputStream in = new FileInputStream("sample/ms949.txt");
    
    byte[] buf = new byte[1000];
    int count = in.read(buf);
    
    in.close();
    
    String str = new String(buf, 0, count);
    System.out.println(str);
  }

}
