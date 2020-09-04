package com.eomcs.oop.ex09.h;

public abstract class Car implements CarCheckInfo {
  int gas;
  int brakeOil;
  int engineOil;
  
  String maker;
  String model;
  int cc;
  
  @Override
  public int getGas() {
    return gas;
  }
  
  @Override
  public int getBrakeOil() {
    return brakeOil;
  }
  
  @Override
  public int getEngineOil() {
    return engineOil;
  }
  
  
  public void start() {
    System.out.println("시동 건다!");
  }
  
  public void shutdown() {
    System.out.println("시동 끈다!");
  }

  public abstract void run();
}
