package com.eomcs.algorithm.data_structure.queue;

import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

// 1) Queue 를 구현하기위해 기존에 작성한 MyLinkedList를 상속받는다.
// 2) Queue에 값을 정의하는 off(Object)를 추가한다.
// 3) Queue에서 값을 꺼내는 poll()를 추가한다.
public class MyQueue03 extends MyLinkedList {
  public boolean offer(Object e) {
    return this.add(e);
  }
  
  public Object poll() {
    if (size() == 0) {
      return null;
    }
    return remove(0);
  }
}
