package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Project;

public class ProjectList {
  
  static final int DEFAULT_SIZE = 100;  // PLENGTH 를 LENGTH 로 변경한다.
  Project[] list; // projects 를 list 로 변경한다.
  int size = 0; // psize 를 size 로 변경한다.
  
  public ProjectList() {
    this(DEFAULT_SIZE);
  }
  
  public ProjectList(int size) {
    if (size < DEFAULT_SIZE) {
      list = new Project[DEFAULT_SIZE];
    } else {
      list = new Project[size];
    }
  }
  
  public void add(Project project) {
    list[size++] = project;
  }
  
  public Project[] toArray() {
    Project[] arr = new Project[size];
    for (int i = 0; i < size; i++) {
      arr[i] = list[i];
    }
    return arr;
  }

}
