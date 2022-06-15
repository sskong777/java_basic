package condition;

import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {

		// 주민등록번호를 입력받아 성별 맞추기
		
		char gender = ' ';	//성별
		String ssn = " "; //주민등록번호
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 주민번호를 입력하세요 : ");
		ssn = scan.nextLine();
		
		gender =ssn.charAt(7);	// 1 or 2
		// 문자중에서 0부터 시작해서 7번째 문자를 뽑는다.
		
		switch(gender) {
		case '1' : 
		case '3' :
			System.out.println("남자");
			break;
	
		case'2' : 
		case'4' : 
			System.out.println("여자");
			break;
		
		default : 
			System.out.println("유효하지않은 주민번호 입니다.");
		}
		
		
		scan.close();
		
	}

}
