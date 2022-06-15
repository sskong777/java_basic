package inner;

// Outer 클래스에서 Inner클래스 멤버 접근예제

class Outer2{
	
	private int x = 100;
	
	public void disp() {
		
		System.out.println("Outer x : " + x);
		//System.out.println("Inner y : " + y);
		// 바깥클래스에서 안쪽클래스로 접근할때는 객체를 먼저 생성해줘야한다.
		
//		Outer2.Inner2 in1 this.new Inner2();
//		System.out.println("Inner y : " + in1.y);
		
		Inner2 in2 = new Inner2();
		System.out.println("Inner y : " + in2.y);
		in2.innerMethod1();
		in2.innerMethod2();
	}
	
	class Inner2 {
		
		private int y = 200;
		
		public void innerMethod1() {
			System.out.println("public 안쪽클래스 메서드");
		}
		
		private void innerMethod2() {
			System.out.println("private 안쪽클래스 메소드");
		}
	}
}

public class EX02 {

	public static void main(String[] args) {

		Outer2 outer = new Outer2();
		outer.disp();
	}

}
