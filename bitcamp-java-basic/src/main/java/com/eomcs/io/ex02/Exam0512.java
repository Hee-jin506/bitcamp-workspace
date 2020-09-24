package com.eomcs.io.ex02;

import java.io.FileOutputStream;
import java.io.IOException;

public class Exam0512 {
  
  public static void main(String[] args) throws IOException {
    
    String str = new String("AB가각");
    
    System.out.printf("file.encoing = %s\n", System.getProperty("file.encoding"));
    
    byte[] bytes = str.getBytes("UTF-16BE");
    
    for (byte b : bytes)
      System.out.printf("%x ", b);
    
    FileOutputStream out = new FileOutputStream("temp/utf16be.txt");
    out.write(bytes);
    out.close();
    System.out.println("데이터 출력 완료!");
  }
}
