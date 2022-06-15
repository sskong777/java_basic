package inheritance;


class Sedan{	
	String color;
	
	public Sedan() {
		System.out.println("sedan 클래스 생성자 호출(매개변수 없음)");
	}
	
	public Sedan(String str) {
		System.out.println("Sedan클래스 생성자 호출  : " + str);
	}
}

class Sonata extends Sedan{
	
	public Sonata(String str) {
		//super(); //부모클래스의 기본생성자가 호출이 된다
		super(str);	//부모생성자가 매개변수를 가지고 있을경우
		// 부모생성자 호출시 매개변수를 명시해주면 명시된 부모생성자가 호출이 된다.
		System.out.println("sonata 클래스 생성자호출 : " + str);
	}
	public void setColor(String color) {
		this.color = color;
		//super.color로 부모필드에 접근해야한다/.
		//하지만 필드를 물려받았기 때문에 this.color로 부모필드 가능
	}
	public void disp() {
		System.out.println("소나타 색상은 : " + this.color);
	}
}
public class EX02 {

	public static void main(String[] args) {
		Sonata sonata = new Sonata("소나타 객체생성");
		
		sonata.setColor("black");
		sonata.disp();
	}

}
