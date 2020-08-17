package com.eomcs.corelib.ex04;

public class MyLinkedList {
  
  Node first;
  Node last;
  int size = 0;

  public class Node {
    Object value;
    Node next;
    
    private Node(Object value) {
      this.value = value;
    }
  }
  
  public boolean add(Object value) {
    Node node = new Node(value);
    if (size == 0) {
      first = node;

    } else {
      last.next = node;
    }
    last = node;
    size++;
    return true;
  }
  
  public Object get(int index) { 
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Node cursor = this.first;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }
  
  public void add(int index, Object value) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    size++;
    Node node = new Node(value);
    
    if (index == 0) {
      node.next = first;
      first = node;
      return ;
    } 
    
    Node cursor = this.first;
    for (int i = 0; i < index -1; i++) {
      cursor = cursor.next;
    }
    node.next = cursor.next;
    cursor.next = node;
    
    if (node.next == null) {
      last = node;
    }
  }
  
  public Object remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    
    size--;
    if (index == 0) {
      Node old = first;
      first = old.next;
      old.next = null;
      return old.value;
    }
    
    Node cursor = this.first;
    for (int i = 0; i < index -1; i++) {
      cursor = cursor.next;
    }
    
    Node old = cursor.next;
    cursor.next = old.next;
    old.next = null;
    
    if (cursor.next == null) {
      last = cursor; 
    }
    
    return old.value;
  }
  
  public Object set(int index, Object value) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Node cursor = this.first;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    Object old = cursor.value;
    cursor.value = value;
    return old;
  }
  
  public Object[] toArray() {
    Object[] arr = new Object[size];
    Node cursor = this.first;
    int count = 0;
    while (cursor != null) {
      arr[count++] = cursor.value;
      cursor = cursor.next;
    }
    return arr;
  }
}
