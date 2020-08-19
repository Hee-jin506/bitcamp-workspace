package com.eomcs.corelib.ex06;

import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

public class MyQueue extends MyLinkedList {
  
  public boolean offer(Object e) {
    this.add(e);
    return true;
  }
  
  public Object poll() {
    if (this.size() == 0) {
      return null;
    }
    return this.remove(0);
  }
  
  public Object peek() {
    if (this.size() == 0) {
      return null;
    }
    return this.get(0);
  }
}
