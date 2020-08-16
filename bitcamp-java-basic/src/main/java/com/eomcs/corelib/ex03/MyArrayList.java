package com.eomcs.corelib.ex03;

public class MyArrayList {
  private Object[] list = new Object[5];
  private int size;
  
  void add(Object obj) {
    if (size == list.length) {
      grow();
    }
    list[size] = obj;
    size++;
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
    for (int i = index; i < size - 1; i++) {
      list[index] = list[index + 1];
    }
    size--;
    list[size] = null;
    return old;
  }
  
  void grow() {
    Object[] newList = new Object[list.length + (list.length >> 2)];
    for (int i = 0; i < list.length; i++) {
      newList[i] = list[i];
    }
    list = newList;
  }
  
  int size() {
    return size;
  }
}
