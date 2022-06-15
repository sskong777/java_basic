package array;

import java.util.Scanner;

public class EX13 {

	public static void main(String[] args) {

		// 정수 5개를 입력받아
		// 입력받은 정수 중에서 3의 배수만 출력해보기

		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for (int i = 0 ; i < num.length; i++) {
			System.out.print(i+1 + "번 째 정수 입력 : ");
			num[i] = scan.nextInt();
			}
		
		for (int i = 0 ; i < num.length; i++) {
			if (num[i] %3 == 0 ) {
				System.out.print(num[i] + " ");
			}
		}
		
		scan.close();
		
		
	}

}
