
public class Test0470 {
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
    
    System.out.printf("CSS          : %b\n", (lang & CSS) == CSS);
    System.out.printf("HTML         : %b\n", (lang & HTML) == HTML);
    System.out.printf("PHP          : %b\n", (lang & PHP) == PHP);
    System.out.printf("Python       : %b\n", (lang & PYTHON) == PYTHON);
    System.out.printf("JAVASCRIPT   : %b\n", (lang & JAVASCRIPT) == JAVASCRIPT);
    System.out.printf("JAVA         : %b\n", (lang & JAVA) == JAVA);
    System.out.printf("CPP          : %b\n", (lang & CPP) == CPP);
    System.out.printf("C            : %b\n", (lang & C) == C);
    
    System.out.println("---------------------------------------");
    System.out.printf("CSS          : %b\n", (lang & CSS) > 0);
    System.out.printf("HTML         : %b\n", (lang & HTML) > 0);
    System.out.printf("PHP          : %b\n", (lang & PHP) > 0);
    System.out.printf("Python       : %b\n", (lang & PYTHON) > 0);
    System.out.printf("JAVASCRIPT   : %b\n", (lang & JAVASCRIPT) > 0);
    System.out.printf("JAVA         : %b\n", (lang & JAVA) > 0);
    System.out.printf("CPP          : %b\n", (lang & CPP) > 0);
    System.out.printf("C            : %b\n", (lang & C) > 0);
  }
}
