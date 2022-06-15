package random;

public class EX01 {

	public static void main(String[] args) {

		System.out.println(Math.random());
		
		//주사위 번호 뽑기 (1,2,3,4,5,6)
		
		int dice = (int)(Math.random() * 6) + 1;
	
		System.out.println("나의 주사위 번호  : " + dice);
		
		//1 ~ 10까지 임의의 정수 뽑기
		int zeroToTen = (int)(Math.random()*10);
		
		System.out.println("1-10 중 하나 : " + zeroToTen);
		
		if(zeroToTen ==1 || zeroToTen ==3 || zeroToTen ==7) {
			System.out.println("행운의 숫자에 당첨되었습니다");
			System.out.println("행운의 숫자 : " + zeroToTen);
		}else {
			System.out.println("나의 숫자는 : " + zeroToTen);
		}
	}

}
