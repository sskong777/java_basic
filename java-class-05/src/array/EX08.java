package array;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {

		int[] array = {10,20,30,40,50};
	
		// 값을 입력받아 인덱스 구하기 
		
		Scanner scan = new Scanner(System.in);
		int value;
		System.out.print("값을 입력하시오(10,20,30,40,50) : ");
		value = scan.nextInt();
		
		int i = 0;
		while(i < array.length) {
			if (array[i] == value) {
				System.out.println("값이 " + value + "인 인덱스 번호는 " + i +"이다");
			}else {
				System.out.println("배열에 값이 존재하지않는다.");
				break;
			}
			i ++;
		}
		scan.close();
	}

}
