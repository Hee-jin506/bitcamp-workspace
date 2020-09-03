package com.eomcs.oop.ex09.a.after;

public class Exam01 {
  public static void main(String[] args) {
    Worker w1 = new BlueWorker();
    Worker w2 = new WhiteWorker();
    Worker w3 = new JubuWorker();
    
//    Worker w4 = new HulWorker();
//    Worker w5 = new String();
    
    w1.execute();
    w2.execute();
    w3.execute();
    
    // 사용 규칙 : Worker
    // caller : Exam01
    // callee : BlueWorker, WhiteWorker, JubuWorker
    
    Worker w;
    // 해당 인터페이스에 따라 작성된(사용규칙을 준수하는) 클래스
    
    
  }

}
