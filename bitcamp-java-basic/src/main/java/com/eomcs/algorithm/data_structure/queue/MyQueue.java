package com.eomcs.algorithm.data_structure.queue;

import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

// 1) Queue 를 구현하기위해 기존에 작성한 MyLinkedList를 상속받는다.
// 2) Queue에 값을 정의하는 off(Object)를 정의한다.
// 3) Queue에서 값을 꺼내는 poll()를 정의한다.
// 4) Queue에서 제일 앞에 있는 값을 조회하는 peek()을 정의한다.
public class MyQueue<E> extends MyLinkedList<E> implements Cloneable {
  public boolean offer(E e) {
    return this.add(e);
  }
  
  public E poll() {
    if (size() == 0) {
      return null;
    }
    return remove(0);
  }
  public E peek() {
    if (size() == 0) {
      return null;
    }
    return get(0);
  }
  
  @SuppressWarnings("unchecked")
  @Override
  public MyQueue<E> clone() throws CloneNotSupportedException {
    MyQueue<E> newQue =  new MyQueue<>();
    Object[] values = this.toArray();
    for (Object value : values) {
      newQue.offer((E) value);
    }
    return newQue;
  }
}
