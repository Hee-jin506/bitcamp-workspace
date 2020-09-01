package com.eomcs.generic.ex03;

import java.lang.reflect.Array;

public class Exam0110 {
  static class ArrayList<T> {
    T[] arr;
    int index = 0;
    
    public ArrayList(Class<?> clazz) {
      // this.arr = new T[10];
      
      this.arr = (T[]) Array.newInstance(clazz, 10);
    }
    
    public void add(T v) {
      arr[index++] = v;
    }
    
    public T get(int index) {
      return arr[index];
    }
  }
  
  public static void main(String[] args) {
    ArrayList<Member> obj = new ArrayList<>(Member.class);
    obj.add(new Member());
    obj.add(new Student());
    obj.add(new Teacher());
    obj.add(new Manager());
    obj.add(new Administrator());
    
    System.out.println(obj.get(0));
    System.out.println(obj.get(1));
    System.out.println(obj.get(2));
    System.out.println(obj.get(3));
    
    ArrayList<Manager> obj2 = new ArrayList<>(Manager.class);
    ArrayList<Teacher> obj3 = new ArrayList<>(Teacher.class);
    ArrayList<Student> obj4 = new ArrayList<>(Student.class);
    ArrayList<Administrator> obj5 = new ArrayList<>(Administrator.class);
    ArrayList<Manager> obj6 = new ArrayList<>(Manager.class);
    ArrayList<String> obj7 = new ArrayList<>(String.class);
  }
}
