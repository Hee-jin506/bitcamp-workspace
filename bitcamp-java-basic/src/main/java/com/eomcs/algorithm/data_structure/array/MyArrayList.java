package com.eomcs.algorithm.data_structure.array;

import java.util.Arrays;

public class MyArrayList {
  private Object[] elementData;
  private static final int DEFAULT_LENGTH = 5;
  private int size;
  
  public MyArrayList() {
    elementData = new Object[DEFAULT_LENGTH];
  }
  
  public MyArrayList(int length) {
    if (length < 5) {
      elementData = new Object[DEFAULT_LENGTH];
    } else {
      elementData = new Object[length];
    }
  }

  public boolean add(Object e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size++] = e;
    return true;
  }

  private void grow() {
    System.out.println("오호라! 배열을 늘리자.");
    Object[] newArray = Arrays.copyOf(elementData, 
        elementData.length + (elementData.length >> 1));
    elementData = newArray;
 
  }


  public void add(int index, Object element) {
    if (size == elementData.length) {
      grow();
    }
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    
    System.arraycopy(elementData, index, elementData, index + 1, size - index);
    
    elementData[index] = element;
    size++;
  }

  public Object get(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    return elementData[index];
  }

  public Object set(int index, Object element) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Object old = elementData[index];
    elementData[index] = element;
    return old;
  }

  public Object remove(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Object old = elementData[index];

    System.arraycopy(elementData, index + 1, elementData, index, size - (index + 1));
    size--;
    elementData[size] = null;
    // 쓰지 않는 인스턴스의 주소를 제거하여
    // 가비지 될 수 있게 한다.

    return old;
  }

  public int size() {
    return this.size;
  }
  
  public Object[] toArray() {
    Object[] arr = Arrays.copyOf(this.elementData, this.size);
    return arr;
  }
}