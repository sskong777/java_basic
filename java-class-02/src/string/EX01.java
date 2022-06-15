package string;

public class EX01 {

	public static void main(String[] args) {
		//문자열 : String
		//String은 기본자료형처럼 다루게 해주는 class
		//문자열 값은 "" 를 사용해서 작성한다.
		String str1 ="홍길동";
		String str2 ="홍석현";
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = "이것은 \"이스케이프\" 문자입니다";
		System.out.println(str3);
		
		String str4 = "이몽룡과 \t홍석현은\n사랑하는 사이이다.";
		System.out.println(str4);
		
	}

}
