package expression;

import java.util.Scanner;
import java.util.regex.Pattern;

class Profile{
	String name;
	int age;
	String number;
	String email;
	
	public Profile(String name, int age, String number, String email) {	
		this.name =name;
		this.age = age;
		this.number =number;
		this.email = email;	
	}
	public void disp() {
		System.out.println(name + "님의 프로필 정보");
		System.out.println("나이 : " + age);
		System.out.println("전화번호  : " + number + "번");
		System.out.println("이메일 : " + email);
	}
}

public class EX05 {

	public static void main(String[] args) {

		//Scanner 를 사용해서 이름 나이 전화번호 이메일을 입력받아보자
		// 이름 전화번호 이메일은 정규표현식을 사요해서 올바르게 입력받았는지 알아보자
		// 나이는 입력받고 if문으로 20살부터 100살까지 유효성검사를 해보자
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		System.out.print("번호 : ");
		String number = scan.next();
		System.out.print("이메일 : ");
		String email = scan.next();
		//
		String patternName = "([가-힣]){2,4}";
//		String patternAge = "\\d{1,3}";
		String patternNumber = "\\d{2,3}-\\d{3,4}-\\d{4}";
		String patternEmail = "\\w+@\\w+.\\w+(\\.\\w+ )?";
		//
		boolean nameCheck = Pattern.matches(patternName, name);
		
		boolean ageCheck;
		if(age < 20 || age > 100) {
			ageCheck = false;
		}else {
			ageCheck = true;
		}
		boolean numberCheck = Pattern.matches(patternNumber, number);
		
		boolean emailCheck = Pattern.matches(patternEmail, email);	
		//
		if(nameCheck == false) {
			System.out.println("이름 잘못 입력");
		}
		if(ageCheck == false) {
			System.out.println("나이 잘못 입력");
		}
		if(numberCheck == false) {
			System.out.println("번호 잘못 입력");
		}
		if(emailCheck == false) {
			System.out.println("이메일 잘못 입력");
		}		
		//
		if(nameCheck ==true && ageCheck==true  
				&& numberCheck ==true && emailCheck ==true) {
			Profile profile = new Profile(name,age,number,email);
			
			System.out.println("프로필이 정상적으로 등록되었습니다");
			
			profile.disp();
		}else {
			System.out.println("프로필이 등록되지않았습니다");
		}
		scan.close();
	}

}
