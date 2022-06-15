package string;

// 자바 api 문서
// https://docs.oracle.com/javase/8/docs/api

public class EX01 {

	public static void main(String[] args) {

		//String은 클래스이다**
		//문자열은 굉장히 많이 쓰이기 때문에 자바에서는
		//String 클래스를 기본형과 같은 형식으로 쓸 수 있도록 해주었다.
		
		String str1 = "hello";
		String str2 = "hi";
		String str3 = "hello";
		
		//동일한 문자를 리터럴로 만들었을때는 동일한 객체를 바라본다.
		System.out.println(str1 == str2);	//false
		System.out.println(str1 == str3);	//true
		
		// 다른 객체가 생성
		String str4 = new String("java");
		String str5 = new String("java");
		
		System.out.println(str4 == str5);	//false
		System.out.println(str4.equals(str5));	//true
		//equals() :  내부의 문자열을 비교
		
		
	}

}
