
public class Test0142 {
  public static void main(String[] args) {
    int x = Integer.MAX_VALUE;
    int y = Integer.MAX_VALUE;
    // -> 0111 1111 1111 1111 1111 1111 1111 1111
    
    int r1 = x + y;
    
    System.out.println(r1);
    
    long r2 = x + y;
    System.out.println(r2);
    
    r2 = (long)x + (long)y;
    System.out.println(r2);
  }

}
