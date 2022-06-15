package expression;

import java.util.regex.Pattern;

public class EX03 {

	public static void main(String[] args) {


		String pattern ="\\d{2,3}-\\d{3,4}-\\d{4}";
		String number = "010-2355-6997";
		
		if(Pattern.matches(pattern, number)) {
			System.out.println("올바른 전화번호 형식");
		}else {
			System.out.println("올바르지 않은 전화번호 형식");
		}
	}

}
