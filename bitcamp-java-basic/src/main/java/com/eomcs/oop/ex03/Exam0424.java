package com.eomcs.oop.ex03;

  class SmartPhone {
    
    int volume;
    int bright;
    int contrast;
    
    // 파라미터가 다른 생성자를 여러개 정의할 수 있다.
    private SmartPhone() {
      // this(...) 다른 생성자를 호출한다.
      this(50, 50, 50); // 다른 생성자를 호출할 떄는 반드시 첫 문자이어야한다.
      System.out.println("Smartphone() 생성자 호출됨!");
    }
    public SmartPhone(int volume) {
      System.out.println("Smartphone(int) 생성자 호출됨!");
      this.volume = volume;
      this.bright = 50;
      this.contrast = 50;
    }
    public SmartPhone (int volume, int bright) {
      System.out.println("Smartphone(int, int) 생성자 호출됨!");
      this.volume = volume;
      this.bright = bright;
      this.contrast = 50;
    }
    public SmartPhone(int volume, int bright, int contrast) {
      System.out.println("Smartphone(int, int, int) 생성자 호출됨!");
      this.volume = volume;
      this.bright = bright;
      this.contrast = contrast;
    }
  }
  public class Exam0424 {  // 다른 클래스는 몰라도 퍼블릭이 붙은 클래스 만큼은 클래스 파일 이름과 같아야한다.
  public static void main(String[] args) {
    // private으로 접근을 제한한 경우 다른 클래스가 생성자를 지정할 수 없다.
    // 인스턴스를 생성할 떄 생성자에 던지는 값에 따라
    // 자동으로 호출될 생성자가 
   // SmartPhone obj1 = new SmartPhone();
   // 레퍼런스로 생성자를 임의로 호출할 수 없다.
   // 생성자 호출은 new 명령을 통해서만 호출 가
   // obj1.SmartPhone();
   
   SmartPhone obj2 = new SmartPhone(50);
    
    
  }
}
