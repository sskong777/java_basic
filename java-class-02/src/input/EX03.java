package input;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("나이는 : ");
		int age = scan.nextInt();
		
		System.out.print("이름은 :");
		String name = scan.next();

		System.out.print("키는 :");
		double height = scan.nextDouble();
		
		System.out.print("몸무게는 : ");
		double weight = scan.nextDouble();

		System.out.println(age);
		System.out.println(name);
		System.out.println(height);
		System.out.println(weight);
		
		scan.close();
	}

}
