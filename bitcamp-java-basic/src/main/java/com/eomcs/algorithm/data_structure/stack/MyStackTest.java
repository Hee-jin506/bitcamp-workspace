package com.eomcs.algorithm.data_structure.stack;

public class MyStackTest {
  public static void main(String[] args) throws Exception {
    MyStack<String> stack = new MyStack<>();
    stack.push("aaa");
    stack.push("bbb");
    System.out.println("==> " + stack.peek());
    stack.push("ccc");
    stack.push("ddd");
    System.out.println("==> " + stack.peek());
    stack.push("eee");
    print(stack);

    
    MyStack<String> stack2 = stack.clone();
    stack.pop();
    stack.pop();
    stack.pop();
    print(stack2);
    print(stack);
    
  }
  static void print(MyStack<?> stack) {
    for (int i = 0; i < stack.size(); i++) {
      System.out.print(stack.get(i) + ",");
    }
    System.out.println();
  }
}
