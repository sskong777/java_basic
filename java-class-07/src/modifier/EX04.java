package modifier;

public class EX04 {
	
	//static블록은 맨 처음 실행하고 다음엔 실행하지 않는다.
	
	static {
		System.out.println("static 블록");
	}
	
	{
		System.out.println("인스턴스 블록");
	}
	//인스턴스 블록은 잘 안씀 
	public EX04() {
		System.out.println("생성자");
	}
	
	
	public static void main(String[] args) {

		System.out.println("메인 메소드 시작!");
		
		EX04 ex1 = new EX04();
		System.out.println();
	
		EX04 ex2 = new EX04();
		System.out.println("메인 메소드 끝!");
	
	}

}
