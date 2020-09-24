package com.eomcs.io.ex01;

import java.io.File;

public class Exam0720 {
  
  public static void main(String[] args) {
    File file = new File("temp");
    
    deleteFile(file);
    
    System.out.println("파일을 모두 삭제했습니다.");
  }
  
  static void deleteFile(File file) {
    if (file.isDirectory()) {
      File[] subfiles = file.listFiles();
    
      for (File subfile : subfiles) {
        deleteFile(subfile);
      }
    }
    file.delete();
  }
}
