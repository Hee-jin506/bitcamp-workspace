package com.eomcs.io.ex02;

import java.io.FileOutputStream;
import java.io.IOException;

public class Exam0110 {
  
  public static void main(String[] args) throws IOException {
    // 1) 파일로 데이터를 출력하는 객체를 준비한다.
    // - new FileOutputStream(파일 경로)
    // - 기존에 같은 이름의 파일이 있으면 덮어쓴다.
    // - 주의 기존 파일이 삭제된다. 
    // - 파일 경로가 절대 경로가 아니다.
    //   - 리눅스, 유닉스: / 로 시작하지 않으면,
    //   - 윈도우: c:\, d:\ 등으로 시작하지 않으면
    //   현재 디렉토리가 기준이 된다.
    
    FileOutputStream out = new FileOutputStream("temp/test1.data");
    
    // 2) 1바이트를 출력한다.
    // - int 값을 아규먼트로 넘기더라도 맨 마지막 1바이트만 출력한다.
    out.write(0x7a6b5c4d);
    
    // 3) 출력 도구를 닫는다.
    // - OS에서 관리하는 자원 중에서 한정된 개수를 갖는 자원에 대해
    // 여러 프로그램이 공유하는 경우, 항상 사용 후 OS에 반납해야한다.
    // - 그래야 다른 프로그램이 해당 자원을 사용할 수 있다.
    // - 예) 파일, 메모리, 네트워크 연결 등
    // - 이런 자원을 사용하는 클래스는 자원을 해제시키는 close() 라는 메서드가 있다.
    // - 보통 java.lang.AutoCloseable 인터페이스를 구현하고 있다.
    // - 이번 예제에서 다루는 FileOutputStream 클래스에도 close()가 있다.
    // - 따라서 FileOutputStream 객체를 사용한 후에는 close()를 호출하여
    // 사용한 자원을 해제시켜야한다.
    // - close()를 호출하면 FileOutputStream이 작업하는 동안 사용했던 버터(임시메모리)를 비운다.
    // OS에서 제공한 파일과의 연결을 끊는다.
    
    out.close();

  }

}
