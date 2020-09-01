package com.eomcs.algorithm.data_structure.array;

public class MyArrayListTest {
  public static void main(String[] args) {
    MyArrayList<String> list = new MyArrayList<>(2);
    list.add("aa");
    list.add("bb");
    list.add("cc");
    list.add("dd");
    print2(list);
    list.remove(2);
    print2(list);
    
    list.add(2, "ee");
    print2(list);
  }
  static void print(MyArrayList<String> list) {
    Object[] arr = list.toArray();
    for (Object obj : arr) {
      System.out.print(obj + ",");
    }
    System.out.println();
  }
  
  static void print2(MyArrayList<String> list) {
    String[] arr = new String[list.size()];
    String[] arr2 = list.toArray(arr);
    for (String str : arr2) {
      System.out.print(str + ",");
    }
    System.out.println();
  }
}
