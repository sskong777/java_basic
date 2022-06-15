package modifier;



public class EX03 {

		int x = 100;
		static int y =200;
		
		//정적 메소드
		
		public static void disp() {
//			System.out.println(x);
			//정적(static)메소드는 내부에 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다.
			//객체가 생성되지 않았기 때문.	
			System.out.println(y);
			
		}
	public static void main(String[] args) {

		EX03 ex = new EX03();
		ex.disp();
		// 정적메소드는 원칙적으로 클래스이름으로 접근
		// 객체로 접근 시 이클립스에서 경고표시
		EX03.disp();
		
	}
	

}
