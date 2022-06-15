package loop;

public class EX14 {

	public static void main(String[] args) {
		
		//break 문 알아보기
		
		int a = 0;
		while (a < 10) {
			System.out.println(a);
			if(a == 5) {
				break;
			}
			a++;
			
		}
		
		//continue문 알아보기
		System.out.println();
		
		int b = 0;
		while(b < 10) {
			b++;
			if(b == 5) {
				continue;
			}
			System.out.println(b);
		}

	}

}
