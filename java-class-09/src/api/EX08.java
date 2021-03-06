package api;

import java.util.*;

public class EX08 {

	public static void main(String[] args) {

		//년도와 월을 입력받아 달력만들기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("조회할 년도를 입력 : ");
		int year = scan.nextInt();
		
		System.out.print("조회할 월을 입력 : ");
		int month = scan.nextInt();
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(year, month-1, 1);	//우리가 구하는 월보다 하나를 빼줘야한다.
		//선택한 년도와 월로 그리고 해당월의 1일로 초기화가 된다
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// Calendar.DAY_OF_WEEK는 월 시작을 의미
		// 1~7 까지의 값을 리턴( 일~토요일을 의미)

		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		//해당월에 나타날 수 있는 최대 날짜값을 리턴
		
		System.out.println("week :" + week + ", last Day : " + lastDay);
		
		System.out.println("\t\t" + year + "년" + month + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i = 1 ; i < week; i++) {
			System.out.print("\t");
		}
		
		for(int i = 1; i <= lastDay; i++) {
			System.out.print(i + "\t");
			week++;
			if(week > 7) {
				week = 1;
				System.out.println();
			}
		}
	scan.close();
	
	
	}
	
	
	

}
