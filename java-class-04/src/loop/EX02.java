package loop;

public class EX02 {

	public static void main(String[] args) {
		
		int i;
		for(i = 1 ; i <= 5; i++) {
			System.out.println("for 문 안 입니다. i = " + i);
		}

	
		System.out.println("for문 밖 i = "+ i);
	
		int j;
		for(j = 2; j<=10; j += 2) {
			System.out.println("j : " + j);
		}
	
	}
	
}
