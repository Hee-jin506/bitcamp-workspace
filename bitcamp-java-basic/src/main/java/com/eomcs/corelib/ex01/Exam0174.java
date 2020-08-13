package com.eomcs.corelib.ex01;

public class Exam0174 {
  static class Engine implements Cloneable {
    int cc;
    int valve;
    
    public Engine(int cc, int valve) {
      this.cc = cc;
      this.valve = valve;
    }
    
    @Override
    public String toString() {
      return "Engine [cc=" + cc+ ", valve=" + valve + "]";
    }
    
    @Override
    public Engine clone() throws CloneNotSupportedException {
      return (Engine) super.clone();
    }
  }
  
  static class Car implements Cloneable {
    String maker;
    String name;
    Engine engine;
    
    public Car(String maker, String name, Engine engine) {
      this.maker = maker;
      this.name = name;
      this.engine = engine;
    }
    
    @Override
    public String toString() {
      return "car [maker=" + maker + ", name=" + name + ", engine=" + engine + "]";
    }
    
    @Override 
    public Car clone() throws CloneNotSupportedException {
      Car copy = (Car) super.clone();
      copy.engine = this.engine.clone();
      return copy;
    }
    public static void main(String[] args) throws Exception {
      Engine engine = new Engine(3000, 16);
      Car car = new Car("비트자동차", "비트비트", engine);
      
      // 자동차 복제
      Car car2 = car.clone();
      
      System.out.println(car == car2);
      System.out.println(car);
      System.out.println(car2);
      System.out.println(car.engine == car2.engine);
      
      // car의 엔진과 car2의 엔진이 다른 엔진인지 확인해보자!
      car.engine.cc = 2000;
      System.out.println(car2.engine.cc);
      
    }
  }
}
