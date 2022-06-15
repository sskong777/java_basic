package loop;

public class EX11 {

	public static void main(String[] args) {

		// while문을 이용해서 1 ~ 10까지 합을 구하기
		int i = 1;
		int sum = 0;
		
		while (i <= 10) {
			sum += i;
			i ++;
		}
	System.out.println("1에서10까지 합은 : " + sum);	
	}

}
