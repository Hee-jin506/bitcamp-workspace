package com.eomcs.corelib.ex03;

public class MyArrayListTest {
  public static void main(String[] args) {
    MyArrayList list = new MyArrayList();
    
    list.add("a");
    print(list);
    list.add("a");
    print(list);
    list.add("a");
    print(list);
    list.add("a");
    
    list.remove(3);

    print(list);
    
 
  }
  
  static void print(MyArrayList list) {
    for (int i = 0; i < list.size(); i++) {
      String str = (String) list.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }
}
