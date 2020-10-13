// JVM의 전체 스레드 계층도
package com.eomcs.concurrent.ex2;

public class Exam0180 {

  public static void main(String[] args) {
    Thread main = Thread.currentThread();
    ThreadGroup mainGroup = main.getThreadGroup();
    ThreadGroup systemGroup = mainGroup.getParent();
    
    printThreads(systemGroup, "");
    
  }
  
  static void printThreads(ThreadGroup tg, String indent) {
    System.out.println(indent + tg.getName() + "(TG)");
    
    Thread[] threads = new Thread[10];
    int size = tg.enumerate(threads, false);
    for (int i = 0; i < size; i++) {
      System.out.println(indent + " ==> " + threads[i].getName());
    }
    
    ThreadGroup[] groups = new ThreadGroup[10];
    size = tg.enumerate(groups, false);
    for (int i = 0; i < size; i++) {
      printThreads(groups[i], indent + "  ");
    }
  }
}

// JVM의 스레드 계층도:
// system(TG)
// => Reference Handler(T)
// => Finalizer(T)
// => Signal Dispatcher(T)
// => main(TG)
// ...=> main(T) : main() 메서드를 호출한다.
// => InnocuousThreadGroup(TG)
// ...=> Common-Cleaner(T)
