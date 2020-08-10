package com.eomcs.oop.ex04;

import java.util.Calendar;

public class Exam0250 {
  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    
    System.out.println(c.get(1));
    System.out.println(c.get(2) + 1);
    System.out.println(c.get(5));
    System.out.println(c.get(7));
    System.out.println(c.get(4));
    System.out.println(c.get(10));
    System.out.println(c.get(11));
    System.out.println(c.get(12));
    System.out.println(c.get(13));
    
    System.out.println("----------------------");
    
    System.out.println(c.get(Calendar.YEAR));
    System.out.println(c.get(Calendar.MONTH) + 1);
    System.out.println(c.get(Calendar.DATE));
    System.out.println(c.get(Calendar.DAY_OF_WEEK));
    System.out.println(c.get(Calendar.WEEK_OF_MONTH));
    System.out.println(c.get(Calendar.HOUR));
    System.out.println(c.get(Calendar.HOUR_OF_DAY));
    System.out.println(c.get(Calendar.MINUTE));
    System.out.println(c.get(Calendar.SECOND));
  }

}
