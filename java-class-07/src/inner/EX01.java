package inner;

// Inner 클래스에서 Outer클래스 멤버 접근예제

class Outer1{
	
	private int x = 100;
	private static int y =200;
	
	public void outerMethod1() {
		System.out.println("public 바깥클래스 메소드");
	}
	
	private void outerMethod2() {
		System.out.println("private 바깥클래스 메소드");
	}

	class Inner1{
		
		private int y = 300;
		//static iny z = 100;	
		//인스턴스 멤버클래스에서 정적(static)멤버는 만들 수 없다.
		
		public void disp() {
			System.out.println("Outer x : " + x);
			System.out.println("Inner y :"  + y);
			System.out.println("Inner y :"  + this.y);
			System.out.println("Outer y : " + Outer1.y);
			outerMethod1();
			outerMethod2();
			
		}
	}
}

public class EX01 {

	public static void main(String[] args) {
		//disp()함수 호출하려면,
		
		Outer1 outer = new Outer1();
		//우선 Outer1 클래스 객체를 생성한다.
		
		Outer1.Inner1 inner = outer.new Inner1();
		//생성된 객채로 Inner1클래스 객체 생성
		
		inner.disp();
	}

}
