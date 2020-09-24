package com.eomcs.io.ex02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exam0524 {
  
  public static void main(String[] args) throws FileNotFoundException  {
    System.out.printf("file.encoding = %s\n", System.getProperty("file.encoding"));
    
    FileInputStream in = new FileInputStream("sample/utf16be.txt");
    
    byte[] buf = new byte[1000];
    int count = in.read(buf);
    
    in.close();
    
    String str = new String(buf, 0, count, "UTF-16");
    System.out.println(str);
    
  }

}
