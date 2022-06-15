package array;

import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) {
		// 동전 교환하기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("동전으로 교환할 금액을 입력하세요");
		System.out.print("금액 입력 >> ");
		int money =scan.nextInt();
		
		int[] coin = {500,100,50,10,1};
		
		System.out.println("교환할 돈 : " + money +  "원");

		//반복문으로 동전 교환
		for(int i = 0; i < coin.length; i++) {
			System.out.println(coin[i] + "원은 : " + money / coin[i] + "개" );
			money %= coin[i];
			
		}
		System.out.println("잔돈은 " + money + "원");
		
		scan.close();
	}

}
