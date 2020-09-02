package com.eomcs.algorithm.data_structure.stack;

import java.util.EmptyStackException;
import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

// 1) Stack을 구현하기 위해 기존에 작성한 MyLinkedList를 상속받는다.
// 2) 스택에 값을 추가하는 push() 메서드를 정의한다.
// 3) 스택에서 제일 마지막에 추가한 값을 꺼내는 pop() 메서드를 정의한다.
// 4) 스택에서 제일 마지막에 입력한 값을 조회하는 peek() 메서드를 정의한다.
// 5) 스택이 비어있는지 알려주는 empty()를 정의한다.
// 6) clone()를 정의한다.
// 7) 제네릭을 적용한다.
public class MyStack<E> extends MyLinkedList<E> implements Cloneable {
  
  public E push(E item) { 
    add(item);
    return item;
  }
  
  public E pop() {
    if (size() == 0) {
      throw new EmptyStackException();
    }
    return remove(this.size() - 1);
  }
  
  public E peek() {
    if (size() == 0) {
      throw new EmptyStackException();
    }
    return get(this.size() - 1);
  }
  
  public boolean empty() {
    return this.size() == 0;
  }
  
  @SuppressWarnings("unchecked")
  @Override
  public MyStack<E> clone() throws CloneNotSupportedException {
      MyStack<E> newStack = new MyStack<>();
      
      Object[] values = this.toArray();
      for (Object value : values) {
        newStack.push((E) value);
    }
    return newStack;
  }
}
