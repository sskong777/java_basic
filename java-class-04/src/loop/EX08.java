package loop;

public class EX08 {

	public static void main(String[] args) {
		
		
		int dan;
		int num;
		
		for(num =1; num < 10; num++) {
			
			for (dan =2; dan < 10; dan++) {
				System.out.printf("%d * %d = %d\t",dan,num,dan*num);
			}
			
			System.out.println();
			 
		}
	}

}
