package quiz_ex;

public class Ex02_동전나누기 {

	public static void main(String[] args) {

		//홍길동 통장에는 돈이 1754305원이 있다/
		//은행에 가서 통장의 돈을 50원의 동전마으로 출금을 했다(잔돈은 출금안함)
		//총 동전의 갯수를 500개씩 묶어서 저금통에 담았다.
		//저금통에 안들어간 동전의 갯수를 구한다음 그 갯수의 아스키문자를 구하자
		int money = 1754305;
		int c50 = money /50;
		System.out.println("money를 50원으로 출금한 개수 : " +c50 + "개");
		
		int jandon = c50 % 500;
		System.out.println("저금통에 안들어간 동전의 갯수의 아스키문자 : "+ (char)jandon);
	}

}
