package com.eomcs.oop.ex08.c2;

public abstract class Car {
  public void start() {
    System.out.println("시동 건다!");
  }
  
  public void shutdown() {
    System.out.println("시동 끈다!");
  }
  
  public void run() {
    System.out.println("달린다.");
  }
}
