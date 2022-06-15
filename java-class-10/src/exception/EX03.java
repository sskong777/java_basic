package exception;

public class EX03 {

	public static void main(String[] args) {

		try {
			System.out.println(1 / 0);
			System.out.println("에외발생시 실행 안함");
		
		}catch(ArithmeticException ae) {
			
			ae.printStackTrace();	//에러 내용 출력
			System.out.println("메시지 : " + ae.getMessage());
			
		}
		System.out.println();
		
		//에러메시지 
		try {
			Exception e = new Exception("예외발생!!!");
		
			throw e ;
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("메시지 : " + e.getMessage());
		}
	
	}

}
