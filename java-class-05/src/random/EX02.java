package random;

public class EX02 {

	public static void main(String[] args) {

		// 배열과 random() 메소드로 로또 추첨하기
		
		int[] lotto = new int[6];
		System.out.println("로또 추첨을 시작합니다.");
		
		// 1 ~ 45 사이의 임의의 정수를 배열의 각 요소에 넣기( for문 ) 
		for (int i = 0; i < lotto.length; i++) {
			
			lotto[i] = (int)(Math.random()*45) + 1;

			for (int j = 0; j  < i; j++) {	// j 는 i의 아랫수까지 반복
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			
		}
		
		// 출력하기
		for (int i : lotto) {
			System.out.print(i + " ");
		}
	}

}
