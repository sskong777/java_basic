package condition;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		
		//if 문을 활용해서 a b c 등급으로 나누어보자
		int a ;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("a : ");
		a = scan.nextInt();
				
		if (a < 80) {
			System.out.println("a는 C등급");	
		} else if (a < 90){
			System.out.println("a는 B등급");
		} else {
			System.out.println("a는 A등급");
		}

		scan.close();
		
	}
}

