package api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EX07 {

	public static void main(String[] args) {

		Date now = new Date();
		//현재 시스템의 시간을 객체를 만듬
		//그 외는 잘 사용하지 않는다
		System.out.println(now);

		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd");
		SimpleDateFormat time = new SimpleDateFormat("a hh:mm:ss");
		
		System.out.println("Date : " + date.format(now));
		System.out.println("Time : " + time.format(now));
		
		//JDK 1.0에서는 Date클래스를 사용하였으나,
		//윤년 : 4년에 한번씩 2월 29일이 있음 (오차가 존재)
		//떄문에 JDK 1.1부터는 향상된 기능을 추가한 Calendar 클래스를 사용한다.

//-------------------------------------------------------------------------------------------//
		
		Calendar cal = Calendar.getInstance();
		//추상클래스로 객체를 직접 생성하지 않는다.
		//getInstance() 메소드는 Calendar 클래스의 인스턴스를 반환한다.
	
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		//컴퓨터의 월은 0부터 시작하기 때문에 +1을 해준다
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("오늘의 날짜 : %d년 %d월 %d일\n",year,month,day);
	
		
		int hour = cal.get(Calendar.HOUR);	//12시간제
		cal.get(Calendar.HOUR_OF_DAY);	//24시간제
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("현재시간 : %d시 %d분 %d초",hour, minute, second);
		
		
	}

}
