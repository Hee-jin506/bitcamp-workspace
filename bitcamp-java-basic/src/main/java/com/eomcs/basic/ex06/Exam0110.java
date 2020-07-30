package com.eomcs.basic.ex06;

public class Exam0110 {
  public static void main(String[] args) {
    int age = 64;

    if (age > 19) {
      System.out.println("성인입니다.");
      System.out.println("-------------------------------");
    }

    if (age >= 65) {
      System.out.println("노인 연금 수령 대상자입니다.");
      System.out.println("-------------------------------");
    }

    int gender = 1;

    if (gender == 1) {
      System.out.println("여성");
      System.out.println("------");
    } else {
      System.out.println("남성");
      System.out.println("------");
    }


    System.out.println("-----------------------");
    int age2 = 17;

     if (age2 >= 19)
       if (age2 >= 65)
         System.out.println("지하철 무임승차 가능합니다.");
     else
       System.out.println("미성년입니다.");  //-> 이 else 가 가장 가까운 두번째 if에 붙는다.
     else
       System.out.println("ok");
    // if와 else는 한 문장으로 취급받기에 블록처리 안해도 가능하다
    // 두번째 else도 마찬가지로 두번쨰 if 와 첫번째 else 가 한문장으로 퉁쳐지기에
    // 블록처리 없이 마지막 else와 첫번째 if가 묶인다.


      int age3 = 15;

      if (age3 < 8)
        System.out.println("아동!");
      else
        if (age3 < 14)
          System.out.println("어린이!");
        else
          if (age3 < 19)
            System.out.println("청소년!");
          else
            if (age3 < 65)
              System.out.println("성인!");
            else
              System.out.println("노인!");

      System.out.println("----------------------");

      age3 = 55;

      if (age3 < 8)
        System.out.println("아동!");
      else if (age3 < 14)
        System.out.println("어린이!");
      else if (age3 < 19)
        System.out.println("청소년!");
      else if (age3 < 65)
        System.out.println("성인!");
      else
        System.out.println("노인!");

 System.out.println("----------------------");

      age3 = 22;

      if (age3 < 8) {
        System.out.println("아동!");
      } else {
        System.out.println("--------------");
        if (age3 < 14) {

        System.out.println("어린이!");
      } else if (age3 < 19) {
        System.out.println("청소년!");
      } else if (age3 < 65) {
        System.out.println("성인!");
      } else {
        System.out.println("노인!");
      }
      }


  }
}
