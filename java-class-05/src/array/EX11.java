package array;

import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {

		// 5개 숫자를 입력받아 작은수부터 나열하기
		// 배열, for문 (중첩), if문 ,Scanner 사용
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		//입력받기
		for (int i = 0; i < num.length; i++) {
			System.out.print(i+1 + "번째 숫자 입력 : ");
			num[i] = scan.nextInt();
			}
		
		int temp = 0;
		// 중첩 for 문으로 작은 수 부터 나열하기		
		for (int i = 0; i < num.length; i++) {
			for (int j = i ; j < num.length; j++) {
				
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] =temp;
				}
			}
		}
		
		System.out.printf("%d,%d,%d,%d,%d"
				,num[0],num[1],num[2],num[3],num[4]);
		
		scan.close();
	}
}
