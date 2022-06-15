package array_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		// 동전 교환하기
		int[] coin = {500,100,50,10};
		
		Scanner scan = new Scanner(System.in);
		
		int money;
		System.out.print("동전으로 교환할 금액 입력 : ");
		money = scan.nextInt();
		
		for(int i = 0 ; i < coin.length; i++) {
			System.out.printf("%d원 짜리 %d개 ",coin[i], money / coin[i]);

			money %= coin[i];
		}
		System.out.println("잔돈은 " + money + "원");
		
		
		
		scan.close();
	}

}
