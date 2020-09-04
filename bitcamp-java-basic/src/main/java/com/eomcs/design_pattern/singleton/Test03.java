package com.eomcs.design_pattern.singleton;

class Kimbap {
  static Kimbap kimbap;
  
  protected Kimbap() {
    
  }
  
  static Kimbap getInstance() {
    if (kimbap == null) {
      kimbap = new Kimbap();
    }
    return kimbap;
  }
}

public class Test03 {
  public static void main(String[] args) {
    // 다음 코드는 컴파일 오류를 발생시켜야 한다.
    //Kimbap bap1 = new Kimbap();

    Kimbap bap2 = Kimbap.getInstance();
    Kimbap bap3 = Kimbap.getInstance();
    System.out.println(bap2 == bap3); // true
  }
}

