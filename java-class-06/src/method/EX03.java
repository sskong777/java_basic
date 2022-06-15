package method;

import java.util.Scanner;

public class EX03 {
	
	// 이름과 나이의 데이터를 매개변수로 받아서
	// 출력하는 profilePrint 메소드를 만들어보자
	
	public static void profilePrint(String name,int age) {
		
		System.out.printf("이름은 %s, 나이는 %d살 입니다.\n",name,age);
	}
	
	
	
	public static void main(String[] args) {
		profilePrint("홍석현", 26);

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름이 뭐에요?");
		String name = scan.next();
		
		System.out.println("나이가 몇살이에여?");
		int age = scan.nextInt();
		
		profilePrint(name,age);
		// 매개변수값을 변수로 주어도됨.
		scan.close();
	}

}
