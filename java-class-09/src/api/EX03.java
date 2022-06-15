package api;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {

		long time1 = System.currentTimeMillis();
		//현재시간을 읽어서 밀리세컨드값을 long으로 준다
		System.out.println(time1);

		long time2 = System.nanoTime();
		//현재 시간을 읽어서 나노세컨드값을 long으로 준다
		System.out.println(time2);
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("시스템을 종료 할까요? 1.yes  2.no" );
			
			int choice = scan.nextInt();
			
			if(choice ==1 ) {
				System.exit(0);
			}else {
				System.out.println("시스템은 계속 돌아갑니다");
			}
		}
		
		
	}

}