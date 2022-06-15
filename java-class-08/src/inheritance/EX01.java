package inheritance;


class Parent{	//부모클래스
	
	int parentField;

	public Parent() {
		System.out.println("부모클래스 생성자");
	}
	
	public void parentMethod() {
		System.out.println("부모클래스 메소드");
	}
}

class Child extends Parent{	//자식클래스
	
	int childField;
	
	public Child() {
		super();	//부모생성자가 먼저 호출된다
		//첫줄에만 올 수 있다.
		//명시를 안해주면 자동으로
		System.out.println("자식클래스 생성자");
	}

	public void childMethod() {
		System.out.println("자식클래스 메소드");
	}
}
public class EX01 {

	public static void main(String[] args) {

		Child child = new Child();	//자식클래스 객체생성
		
		
		child.childField = 20;
		System.out.println(child.childField);
		
		child.parentField = 50;
		System.out.println(child.parentField);
		
		child.childMethod();
		child.parentMethod();
		
	
	}

}
