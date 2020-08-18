package com.eomcs.corelib.ex08;

import java.util.HashMap;

public class Exam0130 {
  static class MyKey {
    String major;
    int no;
    
    public MyKey(String major, int no) {
      this.major = major;
      this.no = no;
    }
    
    @Override
    public String toString() {
      return "MyKey [major= " + major + ", no=" + no +"]";
    }


    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      MyKey other = (MyKey) obj;
      if (major == null) {
        if (other.major != null)
          return false;
      } else if (!major.equals(other.major))
        return false;
      if (no != other.no)
        return false;
      return true;
    }
    
    public static void main(String[] args) {
      Member v1 = new Member("홍길동", 20);
      Member v2 = new Member("임꺽정", 30);
      Member v3 = new Member("유관순", 16);
      Member v4 = new Member("안중근", 30);
      Member v5 = new Member("윤봉길", 25);
      
      MyKey k1 = new MyKey("컴공", 1);
      MyKey k2 = new MyKey("컴공", 2);
      MyKey k3 = new MyKey("컴공", 3);
      MyKey k4 = new MyKey("컴공", 4);
      MyKey k5 = new MyKey("컴공", 5);
      
      HashMap map = new HashMap();
      
      map.put(k1, v2);
      map.put(k2, v2);
      map.put(k3, v3);
      map.put(k4, v4);
      map.put(k5, v5);
      
      System.out.println(map.get(k1));
      System.out.println(map.get(k2));
      System.out.println(map.get(k3));
      System.out.println(map.get(k4));
      System.out.println(map.get(k5));
      
      MyKey k6 = new MyKey("컴공", 3);
      
      System.out.println(k3 == k6);
      System.out.printf("equals(): %b\n", k3.equals(k6));
      System.out.printf("hashCode(): %d, %d\n", k3.hashCode(), k6.hashCode());
      System.out.println("-----------------");
      
      System.out.println(map.get(k6));
    }
  }
}
