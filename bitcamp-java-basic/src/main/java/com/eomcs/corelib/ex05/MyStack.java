package com.eomcs.corelib.ex05;

import java.util.EmptyStackException;
import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

public class MyStack extends MyLinkedList {
  
  public Object push(Object e) {
    this.add(e);
    return e;
  }
  
  public Object pop() {
    if (this.size() == 0) {
      throw new EmptyStackException();
    }
    return this.remove(this.size() - 1);
  }
  
  public Object peek() {
    if (this.size() == 0) {
      throw new EmptyStackException();
    }
    return this.get(this.size() - 1);
  }
}
