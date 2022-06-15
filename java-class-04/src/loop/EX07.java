package loop;

public class EX07 {

	public static void main(String[] args) {
		
		//중첩(이중)for문에 대해 알아보자.
		
		// + 구구단.
		
		for (int i =1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d",j, i, i*j);
				System.out.printf("\t");
//				System.out.printf("%d * %d = %d",i+1, j+1, (i+1)*(j+1));
//				System.out.printf("\t");
//				System.out.printf("%d * %d = %d",i+2, j+2, (i+2)*(j+2));
//				System.out.printf("\t");
				
//		
			
			}
			System.out.println();
		}
	}

}
