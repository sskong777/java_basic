package condition;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {

		// 정수를 입력받아 3의 배수인지 5의 배수인지 알아보기
		
		Scanner scan = new Scanner(System.in);
		
		int a ;
		
		System.out.print("정수를 입력하세요 : ");
		a = scan.nextInt();
		
		if (a % 3 == 0 && a % 5 == 0) {
			System.out.println("3,5의 배수이다");
		} else if (a % 5 == 0) {
			System.out.println("5의 배수이다");
		} else if (a % 3 == 0) {
			System.out.println("3의 배수이다");
		} else {
			System.out.println("3과 5의 배수가 아니다");
		}
			
		scan.close();
		
		
		
	}

}
