package com.eomcs.algorithm.data_structure.array;

public class MyArrayListTest5 {
  public static void main(String[] args) {
    MyArrayList<String> list = new MyArrayList<>();
    list.add("aa");
    list.add("bb");
    list.add("cc");
    list.add("dd");
    print(list);
    list.remove(2);
    print(list);
    
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
    System.out.println(arr == arr2);
    for (Object obj : arr) {
      System.out.print(obj + ",");
    }
    System.out.println();
  }
}
