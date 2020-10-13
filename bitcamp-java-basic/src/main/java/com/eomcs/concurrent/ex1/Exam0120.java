package com.eomcs.concurrent.ex1;

public class Exam0120 {
  
  static class MyThread extends Thread {
    @Override
    public void run() {
      for (int i = 0; i < 1000; i++) {
        System.out.println("==> " + i);
      }
    }
  }
  
  public static void main(String[] args) {
    new MyThread().start();
    
    for (int i = 0; i < 1000; i++) {
      System.out.println(">>> " + i);
    }
  }

}
