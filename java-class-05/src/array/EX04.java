package array;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		//배열과 for문을 이용해서 3명의 이름을 입력받고 출력
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3];
		
		for(int i = 0; i < name.length; i++) {
			System.out.print((i+1) + "번째 이름을 입력하시오 : ");
			name[i] = scan.nextLine();
			
		}
		for(int i = 0; i < name.length; i++) {
			
			System.out.println(name[i]);
		}
		
		scan.close();
		
	}

}
