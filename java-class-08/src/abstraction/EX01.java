package abstraction;

abstract class Hybrid{
	
	public int speed;
	public String color;
	
	void upSpeed(int speed) {
		this.speed += speed;
		
	}
	abstract void run();	//추상메소드는 선언부만 있다 --(중괄호){}이 없음
	// 추상메소드, 실제구현은 자식클래스에서 한다.
	// 만약, 클래스 내부에 추상메소드가 하나라도 있으면 그 클래스는 추상클래스가 된다

	// 추상클래스가 되면, 객체를 직접 생성하지 못한다.
	// 자식의 클래스로 객체를 만들던가, 혹은 익명중첩클래스로 객체를 만들어야 한다.
}
public class EX01 {

	public static void main(String[] args) {
		
		//Hybrid hybrid = new Hybrid() {
		//추상클래스는 객체생성 불가	
			
		}

	}


