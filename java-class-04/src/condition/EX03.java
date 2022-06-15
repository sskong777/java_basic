package condition;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		// if -else 문을 사용해서 2개의 수를 입력받고
		// 몇번쨰 입력받은 수가 큰 수인지 확인하기
		
		int a, b ;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a : ");
		a = scan.nextInt();
		
		System.out.print("b : ");
		b = scan.nextInt();
		
		if (a > b) {
			System.out.println("a가 더 큰 수이다");
		} else if (a == b) {
			System.out.println("a와 b는 같다");
		} else {
			System.out.println("b가 더 큰 수이다");
		}
		
		scan.close();
	
	}

}
