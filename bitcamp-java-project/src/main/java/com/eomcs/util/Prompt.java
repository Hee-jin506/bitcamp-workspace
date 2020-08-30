package com.eomcs.util;

import java.sql.Date;
import java.util.Scanner;

public class Prompt {
  
  private static Scanner keyboardScan = new Scanner(System.in);
  
  public static String promptString(String str) {
    System.out.print(str);
    return keyboardScan.nextLine();
  }
  
  public static int promptInt(String str) {
    return Integer.parseInt(promptString(str));
  }
  
  public static Date promptDate(String str) {
    return Date.valueOf(promptString(str));
  }
  
  public static Scanner getScanner() {
    return keyboardScan;
  }
}
