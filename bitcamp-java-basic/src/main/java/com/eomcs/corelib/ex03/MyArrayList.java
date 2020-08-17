package com.eomcs.corelib.ex03;

import java.util.Arrays;

public class MyArrayList {
  Object[] list;
  private int size;
  final int DEFAULT_CAPACITY = 5;
  
  public MyArrayList() {
    list = new Object[DEFAULT_CAPACITY];
  }
  
  public MyArrayList(int initialCapacity) {
    if (initialCapacity < DEFAULT_CAPACITY) {
      list = new Object[DEFAULT_CAPACITY];
    } else {
      list = new Object[initialCapacity];       
    }
  }
  boolean add(Object obj) {
    if (size == list.length) {
      grow();
    }
    list[size++] = obj;
    return true;
  }
  
  void add(int index, Object obj) {
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    if (size == list.length) {
      grow();
    }
    for (int i = size - 1; i >= index; i--) {
      list[i+1] = list[i];
    }
    list[index] = obj;
    size++;
  }
  
  Object get(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    return list[index];
  }
  
  Object set(int index, Object obj) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Object old = list[index];
    list[index] = obj;
    return old;
  }
  
  Object remove(int index) {
    Object old = list[index];
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    
    System.arraycopy(
        list, // 복사 대상 
        index + 1, // 복사할 항목의 시작 인덱스
        list, // 목적지
        index, // 복사 목적지 인덱스
        this.size - (index + 1)); // 복사할 인덱스 길이
//    for (int i = index; i < size - 1; i++) {
//      list[index] = list[index + 1];
//    }
    size--;
    list[size] = null;
    return old;
  }
  
  private void grow() {
    int newCapacity = list.length + (list.length >> 1);
    list = Arrays.copyOf(list, newCapacity);
//    Object[] newList = new Object[list.length + (list.length >> 1)];
//    for (int i = 0; i < list.length; i++) {
//      newList[i] = list[i];
//    }
//    list = newList;
  }
  
  int size() {
    return size;
  }
  
  public Object[] toArray() {
    Object[] arr = Arrays.copyOf(list, this.size);
    // System.out.println(list == arr);
    return arr;
//    Object[] arr = new Object[this.size];
//    for (int i = 0; i < arr.length; i++) {
//      arr[i] = list[i];
//    }
//    return arr;
  }
}
