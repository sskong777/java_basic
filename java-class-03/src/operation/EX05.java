package operation;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		//두 정수를 입력받아 사칙연산 계산하기
		
		int a,b;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력 : ");
		a = scan.nextInt();

		System.out.print("두 번째 숫자를 입력 : ");
		b = scan.nextInt();
	
		
		System.out.printf("두 수의 합은 : %d + %d = %d", a, b, a+b);
		
		System.out.printf("두 수의 곱은 : %d * %d = %d", a, b, a*b);
		
		System.out.printf("두 수의 나눗셈은 : %d / %d = %d", a, b, a/b);
		
		scan.close();
		
	}

}
