package quiz;

public class EX01 {

	public static void main(String[] args) {
		// 문제 1
		//다음의 글을 String 변수에 담고 출력해보자
		// ( 이스케이프 문자사용 )
		//"이몽룡" 과 "성춘향"은
		// 사랑하는 사이다.
		String str = "\"이몽룡\"과 \"성춘행\"은 \n사랑하는 사이이다" ;
		System.out.println(str);
		
		//문제 2
		// 정수 65를 byte 변수에 담아서 아스키문자로 출력해보자
		int a = 65;
		byte b = (byte)a;
		System.out.println(a);
		char c = (char)b;
		System.out.println(c);
//		
	}

}
