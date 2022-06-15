package input;

import java.io.IOException;

public class EX01 {

	public static void main(String[] args) throws IOException {
										//throws IOException은
										//sysyem.in.read()에 대한
										//예외처리 코드이다.
	
		System.out.print("키코드 입력하고 엔터 : ");
		
		int keyCode;	//변수 선언
		keyCode = System.in.read();		//엔터값 처리
		System.out.println(keyCode);
		// 한글은 1바이트로 표현할 수 없기 때문에
		// 숫자와 영문 그리고 특수문자만 입력할 수 있다.
		
		keyCode = System.in.read();		//엔터값 처리
		System.out.println(keyCode);
		
		keyCode = System.in.read();		//엔터값 처리
		System.out.println(keyCode);
		
		
	}

}
