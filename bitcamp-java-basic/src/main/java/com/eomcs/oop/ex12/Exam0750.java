// 메서드 레퍼런스 - 생상자 레퍼런스 활용
package com.eomcs.oop.ex12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Supplier;

public class Exam0750 {

  static <T> Collection<T> prepareNames(Supplier<Collection<T>> factory, T... names) {
    Collection<T> list = factory.get();
    for (T name : names) {
      list.add(name);
    }
    return list;
  }

  static <T> void print(Iterator<T> i) {
    while (i.hasNext()) {
      System.out.print(i.next() + ",");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    // '람다'는 새로 메서드를 구현해야 하지만,
    // '메서드 레퍼런스'는 기존 클래스의 메서드를 재활용 할 수 있다.
    //

    // 생성자 레퍼런스
    // 문법:
    // => 클래스명::new
    //
    Collection<String> c1 = prepareNames(ArrayList<String>::new, "홍길동", "임꺽정", "유관순", "임꺽정");
    print(c1.iterator());

    System.out.println("------------------------");

    Collection<String> c2 = prepareNames(HashSet<String>::new, "홍길동", "임꺽정", "유관순", "임꺽정");
    print(c2.iterator());
  }

}


