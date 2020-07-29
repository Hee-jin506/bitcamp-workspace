
public class Test0460 {
  public static void main(String[] args) {
    final int CSS = 0x0001;
    final int HTML= 0x0002;
    final int PHP = 0x0004;
    final int PYTHON = 0x0008;
    final int JAVASCRIPT = 0x0010;
    final int JAVA = 0x0020;
    final int CPP = 0x00040;
    final int C = 0x0080;
    
    int lang = C | JAVA | PYTHON | HTML;
    
    System.out.println(Integer.toBinaryString(lang));
  }

}
