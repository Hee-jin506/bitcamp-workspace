package com.eomcs.corelib.ex04;

//import com.eomcs.corelib.ex04.MyLinkedList.Node;

public class MyLinkedListTest {
  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    print(list);
    System.out.println(list.get(2));
    list.add(3, "ddd");
    list.add("eee");
    print(list);
    System.out.println(list.remove(0));
    print(list);
    list.add("fff");
    print(list);
    System.out.println(list.set(0, "ggg"));
 
    
    print2(list.toArray());
  }
  static void print(MyLinkedList list) {
    MyLinkedList.Node cursor = list.first;
    for (int i = 0; i < list.size ; i++) {
      System.out.print(cursor.value + ",");
      cursor = cursor.next;
    }
    System.out.println();
  }
  static void print2(Object[] list) {
    for (Object obj : list) {
      System.out.print(obj + ",");
    }
    System.out.println();
  }
}
