package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Task;

public class TaskList {
  
  static final int DEFAULT_SIZE = 100; // TLENGTH 를 LENGTH 로 변경한다.
  Task[] list; // tasks 를 list 로 변경한다.
  int size = 0; // tsize 를 size 로 변경한다.
  
  public TaskList() {
    this(DEFAULT_SIZE);
  }
  
  public TaskList(int size) {
    if (size < DEFAULT_SIZE) {
      list = new Task[DEFAULT_SIZE];
    } else {
      list = new Task[size];
    }
  }
  
  public void add(Task task) {
    list[size++] = task;
  }
  
  public Task[] toArray() {
    Task[] arr = new Task[size];
    for (int i = 0; i < size; i++) {
      arr[i] = list[i];
    }
    return arr;
  }
}
