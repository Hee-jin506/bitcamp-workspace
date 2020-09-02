package com.eomcs.util;

import java.util.EmptyStackException;

// 1) Stack을 구현하기 위해 기존에 작성한 MyLinkedList를 상속받는다.
// 2) 스택에 값을 추가하는 push() 메서드를 정의한다.
// 3) 스택에서 제일 마지막에 추가한 값을 꺼내는 pop() 메서드를 정의한다.
// 4) 스택에서 제일 마지막에 입력한 값을 조회하는 peek() 메서드를 정의한다.
public class Stack<E> extends LinkedList<E> implements Cloneable {
  
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
    if (this.size() == 0) {
      return true;
    }
    return false;
  }
  
  @SuppressWarnings("unchecked")
  @Override
  public Stack<E> clone() throws CloneNotSupportedException {
    Stack<E> newStack = new Stack<>();
    
    Object[] values = this.toArray();
    for (Object value : values) {
      newStack.push((E) value);
    }
    return newStack;
  }
}
