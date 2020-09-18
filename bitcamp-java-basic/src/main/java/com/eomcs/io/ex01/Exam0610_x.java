package com.eomcs.io.ex01;

import java.io.File;

public class Exam0610_x {
  
  public static void main(String[] args) {
    
    File here = new File(".");
    
    File[] files = here.listFiles((File f) -> f.getName().endsWith(".java") && f.isFile());
    
    for (File file : files) {
      System.out.printf("%s %10s %s\n",
          file.isDirectory() ? "d" : "-",
          file.length()== 0 ? "" : file.length(),
          file.getName());
      
    }
  }
}
