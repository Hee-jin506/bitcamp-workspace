package com.eomcs.oop.ex03;

public class Exam0930 {
  static class Monitor {
    int bright;
    int contrast;
    int widthRes;
    int heightRes;
    
    {
      this.bright = 50;
      if (this.bright < 50)
        this.contrast = 70;
      else
        this.contrast = 40;
      
      this.widthRes = 1920;
      this.heightRes = 1080;
    }
    void display() {
      System.out.println("----------------------------------");
      System.out.printf("밝기(%d)\n", this.bright);
      System.out.printf("명암(%d)\n", this.contrast);
      System.out.printf("해상도(%d x %d)\n", this.widthRes, this.heightRes);
      System.out.println("----------------------------------");
    }
  }
  public static void main(String[] args) {
    Monitor m1 = new Monitor();
    m1.display();
    m1.bright = 40;
    m1.display();
  }
}
