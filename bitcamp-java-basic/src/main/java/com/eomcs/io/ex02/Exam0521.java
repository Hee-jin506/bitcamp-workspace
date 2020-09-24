package com.eomcs.io.ex02;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Exam0521 {
  
  public static void main(String[] args) throws IOException {
    
    System.out.printf("file.encoding = %s\n", System.getProperty("file.encoding"));
    
    FileInputStream in = new FileInputStream("sample/utf8.txt");
    
    byte[] buf = new byte[1000];
    int count = in.read(buf);
    
    in.close();
    
    String str = new String(buf, 0, count);
    System.out.println(str);
    
    
    FileReader in2 = new FileReader("sample/ms949.txt", Charset.forName("MS949")); 
  }
}
