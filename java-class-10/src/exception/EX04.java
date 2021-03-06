package exception;

public class EX04 {
	
	public void call(int j) throws ArrayIndexOutOfBoundsException {
							// throws는 호출한 곳에서 예외처리
		
		int[] i = {1,2,3};
		System.out.println("call value : " + i[j]);
		
	}
	
	public static void main(String[] args) {

		EX04 ex = new EX04();
		
		try {
			ex.call(5);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("배열 크기에 맞는 값을 입력하세요");
			ae.printStackTrace();//에러내용 출력
		}finally {
			System.out.println("예외발생여부와 상관없이 수행");
		}
	
	}

}
