package com.eomcs.io.ex01;

import java.io.File;

public class Exam0710 {
  
  public static void main(String[] args) {
    
    File dir = new File(".");
    
    printFiles(dir, 0);
  }
  
  static void printFiles(File file, int level) {
    File[] files = file.listFiles();
    
    for (File subfile : files) {
      printIndent(level);
      System.out.println(subfile.getName());
      if (subfile.isDirectory()) {
        printFiles(subfile, level + 1);
      }
    }
  }
  
  static void printIndent(int level) {
    for(int i = 0; i < level; i++)
      System.out.print("  ");
  }

}
