// Executors 태스크 프레임워크 - 작업 실행 : submit()
package com.eomcs.concurrent.ex7;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam0420 {

  static class MyRunnable implements Runnable {
    int millisec;

    public MyRunnable(int millisec) {
      this.millisec = millisec;
    }

    @Override
    public void run() {
      try {
        System.out.printf("%s 스레드 실행 중...\n",
            Thread.currentThread().getName());

        Thread.sleep(millisec);

        System.out.printf("%s 스레드 종료!\n",
            Thread.currentThread().getName());
      } catch (Exception e) {
        System.out.printf("%s 스레드 실행 중 오류 발생!\n", Thread.currentThread().getName());
      }
    }
  }
  public static void main(String[] args) throws Exception {
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    
    executorService.execute(new MyRunnable(6000));
    executorService.execute(new MyRunnable(2000));
    executorService.execute(new MyRunnable(4000));
    executorService.execute(new MyRunnable(4000));
    executorService.execute(new MyRunnable(4000));
    executorService.execute(new MyRunnable(4000));
    
    List<Runnable> tasks = executorService.shutdownNow();
    for (Runnable task : tasks) {
      System.out.println(((MyRunnable) task).millisec);
    }
    
    executorService.execute(new MyRunnable(4000));
    
    System.out.println("main() 종료!");

  }
}

