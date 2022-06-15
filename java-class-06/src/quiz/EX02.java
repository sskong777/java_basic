package quiz;

public class EX02 {

	public static void main(String[] args) {

		//홍길동 통장에는 돈이 1754305원이 있다/
		//은행에 가서 통장의 돈을 50원의 동전마으로 출금을 했다(잔돈은 출금안함)
		//총 동전의 갯수를 500개씩 묶어서 저금통에 담았다.
		//저금통에 안들어간 동전의 갯수를 구한다음 그 갯수의 아스키문자를 구하자
		int money = 1754305;
		int c50 = money / 50;
		System.out.println(c50);
//		int pig = c50 / 500;
		int jan = c50 % 500;
		
		System.out.println((char)jan);
		
		//------------------------------
		
		int x = 0;
		int add = 0;
		
		while(x < 10) {
			add += ++x;			
		}
		//다음 while문에서 한줄코드만 작성해서 1~10까지 숫자를 더하는식을 완성해보자
		System.out.println(add);
		
	}


}
