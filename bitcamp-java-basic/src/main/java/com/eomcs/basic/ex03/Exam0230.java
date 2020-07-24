// 주제: 메모리 크기에 따른 표기법

package com.eomcs.basic.ex03;


class Exam0230 {
    public static void main(String[] args) {
        System.out.println(2147483647);
        System.out.println(-2147483648);
        
        // System.out.println(2147483648);
        // System.out.println(-2147483649);
        
        
        System.out.println(2147483648L);
        System.out.println(-2147483649L);
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        
        // 다음은 크기가 다른 정수이다.
        System.out.println(100);
        System.out.println(100L);
    }
}