package com.eomcs.corelib.ex06;

public class MyQueueTest {
  public static void main(String[] args) {
    MyQueue queue = new MyQueue();
    queue.offer("aaa");
    queue.offer("bbb");
    queue.offer("ccc");
    print(queue);
    
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    print(queue);
    System.out.println(queue.peek());
    System.out.println(queue.poll());
    System.out.println(queue.peek());
  }
  static void print(MyQueue queue) {
    for (int i = 0; i < queue.size(); i++) {
      System.out.print(queue.get(i) + ",");
    }
    System.out.println();
  }
}
