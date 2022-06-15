package loop;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		//for문을 사용해서 숫자를 5번 입력받고,
		// 입력받을 때 마다 더해지는 프로그램 만들기.
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("정수 5개를 입력 : ");
			num = scan.nextInt();
			sum += num;
			System.out.println(i +"번째 합계 : " + sum);
		}
		
		scan.close();
	}

}
