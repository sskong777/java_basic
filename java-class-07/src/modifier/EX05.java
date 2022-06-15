package modifier;

class Person{
	static final String NATION = "korea";
	//정적 불변의 상수(메모리의 메소드영역에 올라가므로 반드시 선언과 동시에 초기화)
	//역할 : 공용데이터
	
	final String SSN;
	//불변의 인스턴스 상수
	//선언과 동시에 초기화를 하거나, 또는 생성자에서 단 한번만 초기화가 이루어진다.
	
	String name;
	int age;
	
	
	public Person(String ssn, String name, int age) {
		this.SSN = ssn;
		this.name = name;
		this.age = age;
	}
	
}
public class EX05 {

	public static void main(String[] args) {

		Person person = new Person("123456-1234567","홍석현",20);
		
		System.out.println(person.NATION);
		System.out.println(person.SSN);
		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println();
		
		//person.NATION ="USA";
		//person.SSN = "1212-1212";
		//상수는 절대로 한번만 초기화 가능하고 수정이 안된다
	
		person.name ="석현";
		person.age= 20;
		
		System.out.println(Person.NATION);	//static방법으로 접근
		System.out.println(person.SSN);
		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println();
		
		//결론
		//1. static final ; 정적 불변의 상수, 메모리 최상단에
		//					하나만 생성이 되고 공유되는 상수이다.
		//2. final : 불면의 인스턴스 상수, 메모리의 힙에 할당된다.
		//			 new연산자를 몇번쓰던 만들어진 인스턴스만큼 생성된다.
		// 보통 프로그래밍에서 상수라는 용어는 static final 이다.
		
		
	}

}
