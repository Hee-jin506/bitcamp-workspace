package com.eomcs.oop.ex09.e;

import com.eomcs.oop.ex09.e.project1.FirstComputer;
import com.eomcs.oop.ex09.e.project2.SecondComputer;
import com.eomcs.oop.ex09.e.project3.ThirdComputer;

public class User {
  public static void main(String[] args) {
    Computer c1 = new FirstComputer();
    c1.compute();
    
    c1 = new SecondComputer();
    c1.compute();
    
    c1 = new ThirdComputer();
    c1.compute();
  }

}
