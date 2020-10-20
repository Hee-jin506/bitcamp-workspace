package com.eomcs.concurrent.ex6;

public class test {
  public static void main(String[] args) {

    String[] arr = {"권구현", "김성태", "김유아","김찬구","김태희","김하연","류승희","신소미",
        "오세준","유아람","유지연","이건목","이성권","이승혁","이용민",
        "이재현","이종엽","정지은","조은채","최민섭","최진영","최희진"};



    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < arr.length; j++) {
        if(j % 3 == 0) {
          if (i + j >= arr.length)
            break;
          String returned = arr[j + i];
          System.out.println(returned);
        }
      }
    }
  }

}
