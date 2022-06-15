package input;

import java.util.Scanner;
// Scanner라는 클래스는 java.until 패키지 안에 있는데
// 이것을 가져와서 이 프로그램에서 사용하겠다 라는 뜻
// import 단축키 : ctrl + shift + 영문자 o


public class EX02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 : ");
		
		String str = scan.next(); //문자열 : next()
		// next()는 공백 전까지 문자열을 읽어온다.
		// 읽어온 문자열을 String 변수에 담는다.
		System.out.println(str);
		
		System.out.println("정수를 입력하세요 : ");
		int a  = scan.nextInt();
		System.out.println(a);
		
		System.out.println("실수를 입력하세요 : ");
		double b = scan.nextDouble();
		//실수 : nextDouble() // nextFloat()
		//공백 전 까지 실수를 읽어온다.
		System.out.println(b);
		
		System.out.println("문자열을 입력하세요 : ");
		String str2 = scan.nextLine();
		// 문자열 : nextLine()
		// 라인전체(공백포함) 데이터를 읽어온다.
//		// 주의 : next()나 nextInt()등을 쓰고 nextLine()을 쓸 경우
		// 남아있는 엔터(버퍼에)를 처리하기 떄문에 남아있는 엔터를 처리해주어야 한다.
		System.out.println(str2);	// 남아있는 엔터값 처리
		System.out.println(str2);	//
		
		scan.close();
		// I/O(입력/출력) 사용시에는 연결을 맺고 끊음을 확실히 해줘야한다.
	}

}
