package com.eomcs.util;

import java.util.Arrays;

public class LinkedList<E> {
  
  private Node<E> first;
  
  private Node<E> last;
  
  private int size;

  static class Node<E> {
    E value;
    Node<E> next;
    
    public Node() {}
    
    public Node(E value) {
      this.value = value;
    }
  }
  
  public boolean add(E e) {
    Node<E> node = new Node<>();
    node.value = e;
    
    if (first == null) {
      first = node;
    } else {
      last.next = node;
    }
    last = node;
    size++;
    return true;
  }
  
  public void add(int index, E element) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    
    Node<E> node = new Node<>(element);
    
    size++;
    
    if (index == 0) {
      node.next = first;
      first = node;
      return ;
    }
    Node<E> cursor = this.first;
    for (int i = 1; i <= index - 1; i++ ) {
      cursor = cursor.next;
    }
    node.next = cursor.next;
    cursor.next = node;
    if (node.next == null) {
      last = node;
    }
  }
  public E get(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Node<E> cursor = this.first;
    for (int i = 1; i <= index; i++ ) {
      cursor = cursor.next;
    }
    return cursor.value;
  }
  
  public E remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    
    size--;
    
    if (index == 0) {
      Node<E> old = first;
      first = first.next;
      old.next = null;
      return old.value;
    }
    Node<E> cursor = this.first;
    for (int i = 1; i <= index - 1; i++ ) {
      cursor = cursor.next;
    }
    
    if (cursor.next == null) {
      last = cursor;
    }
   
    Node<E> old = cursor.next;
    cursor.next = old.next;
    old.next = null; // 가비지가 다른 인스턴스를 가리키지 않게한다.
    
    return old.value;
  }
  
  public E set(int index, E element) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Node<E> cursor = this.first;
    for (int i = 1; i <= index; i++ ) {
      cursor = cursor.next;
    }
    E old = cursor.value;
    cursor.value = element;
    return old;
  }
  public Object[] toArray() {
    Object[] arr = new Object[this.size];
    
    int i = 0;
    Node<E> cursor = first;
    while (cursor != null) {
      arr[i++] = cursor.value;
      cursor = cursor.next;
    }
    return arr;
  }
  
  public int size() {
    return this.size;
  }
  
  public E[] toArray(Class<? extends E[]> classType) {
    Object[] arr = this.toArray();
    return Arrays.copyOf(arr, this.size(), classType);
  }
}
