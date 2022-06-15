package expression;

import java.util.regex.Pattern;

public class EX02 {

	public static void main(String[] args) {

		String pattern = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		// "\"을 하나 더 붙이는거는 이스케이프문자
		String email = "aaa@naver.com";
		
		if(Pattern.matches(pattern, email)) {
			System.out.println("올바른 이메일 형식");
		}else {
			System.out.println("올바른 이메일 형식이 아닙니다");
		}
	}

}
