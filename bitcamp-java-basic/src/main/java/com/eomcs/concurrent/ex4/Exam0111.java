package com.eomcs.concurrent.ex4;

public class Exam0111 {
  public static void main(String[] args) {
    Thread t = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        System.out.println("===> " + i);
      }
    });
    t.start();
    t.start();
    System.out.println("main() 종료!");
  }

}
