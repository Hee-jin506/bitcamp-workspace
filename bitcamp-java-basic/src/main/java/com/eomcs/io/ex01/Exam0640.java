// 익명 클래스로 FileFilter 만들기
package com.eomcs.io.ex01;

import java.io.File;

public class Exam0640 {


  public static void main(String[] args) throws Exception {

    File dir = new File(".");

//    File[] files = dir.listFiles(new FileFilter() {
//      @Override
//      public boolean accept(File file) {
//        if (file.isFile() && file.getName().endsWith(".java"))
//          return true;
//        return false;
//      }
//    });
    
    File[] files = dir.listFiles(file -> file.isFile() && file.getName().endsWith(".java") ? true : false);

    for (File file : files) {
      System.out.printf("%s %12d %s\n", file.isDirectory() ? "d" : "-", file.length(),
          file.getName());
    }

  }

}


