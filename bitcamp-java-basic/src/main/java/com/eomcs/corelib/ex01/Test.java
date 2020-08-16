package com.eomcs.corelib.ex01;

public class Test {
  static class A {
    int aa;
    
    B clonee() {
      B newB = new B();
      newB.aa = this.aa;
      newB.bb = ((B)this).bb;
      return newB;
    }
  }
  
  static class B extends A{
    int bb;
    
    @Override
    B clonee() {
      B newB = super.clonee();
      return newB;
    }
  }
  
  public static void main(String[] args) {
    B bike = new B();
    bike.aa = 1;
    bike.bb = 2;
    B newB = bike.clonee();
    System.out.printf("%d, %d", newB.aa, newB.bb);
  }
}
