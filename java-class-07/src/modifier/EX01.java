package modifier;

public class EX01 {

		static int count1 = 0;
		//static : 메모리상의 정적이다. 
		//프로그램 시작 시 메모리의 메소드영역(최상단)****에 할당된다.
		//공유***되는 전역변수이다.
		
		int count2 = 0;
		//인스턴스 멤버변수
		//인스턴스 변수는 객체마다** 가지고있다.
		//heap 영역의 객체마다 저장***
		
		public void increase() {
			count1++;
			count2++;	//객체가 생성될때 올라간다.
			System.out.println("count1 : " + count1);
			System.out.println("count2 : " + count2);
		
		}
	
		public static void main(String[] args) {
			EX01 ex1 = new EX01();
			ex1.increase();
			System.out.println();
			
			EX01 ex2 = new EX01();
			ex2.increase();
			System.out.println();
			
			EX01 ex3 =new EX01();
			ex3.increase();
		}
	

}
