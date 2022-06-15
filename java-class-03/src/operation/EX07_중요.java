package operation;

import java.util.Scanner;

public class EX07_중요 {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int money;
		int[] coin = new int[] {500,100,50,10};
		System.out.print("동전으로 교환할 돈은 : ");
		money = scan.nextInt();
		for(int i : coin) {
			System.out.printf("%d원 짜리 %d개\n",i , money / i);		
			money %= i;
		}
		System.out.println("잔돈은 " + money + "원");
			
//		c500 = money /500;
//		money %= 500;
//		
//		c100 = money/100;
//		money %= 100;
//		
//		c50 = money/50;
//		money %= 50;
//		
//		c10 =money/10;
//		money %=10;
//		
//		System.out.println(c500);  
//		System.out.println(c100);  
//		System.out.println(c50);  
//		System.out.println(c10);  
//		System.out.println(money);  
//				
		scan.close();
		
	}
}
