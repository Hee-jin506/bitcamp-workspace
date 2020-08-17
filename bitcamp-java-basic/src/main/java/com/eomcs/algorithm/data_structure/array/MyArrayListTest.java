package com.eomcs.algorithm.data_structure.array;

public class MyArrayListTest {
  public static void main(String[] args) {
    MyArrayList list = new MyArrayList(2);
    list.add("aa");
    list.add("bb");
    list.add("cc");
    list.add("dd");
    print(list);
    list.remove(2);
    print(list);
    
    list.add(2, "ee");
    print(list);
  }
  static void print(MyArrayList list) {
    Object[] arr = list.toArray();
    for (Object obj : arr) {
      System.out.print(obj + ",");
    }
    System.out.println();
  }
}
