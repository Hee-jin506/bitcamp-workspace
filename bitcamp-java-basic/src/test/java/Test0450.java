
public class Test0450 {
  public static void main(String[] args) {
    int lang = 0;
    lang = lang | 0x80;
    lang = lang | 0x20;
    lang = lang | 0x08;
    lang = lang | 0x02;
    
    System.out.println(Integer.toBinaryString(lang));
  }

}
