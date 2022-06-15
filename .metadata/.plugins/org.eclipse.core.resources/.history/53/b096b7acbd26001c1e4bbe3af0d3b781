package interface1;

import java.util.Scanner;

class Person{
	private String name;
	private int age;
	private String number;
	private String address;
	
	//생성자를 만들어서 매개값으로 필드 초기화
	public Person(String name, int age, String number, String address) {
		this.name = name;
		this.age = age;
		this.number = number;
		this.address = address;
	}
	//필드를 출력해주는 disp 메소드를 만들어주세요
	public void disp() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("번호 : " + number);
		System.out.println("주소 : " + address);
	}
}
interface PersonService{
	
	public abstract void view(Person[] person);
	//person배열을 받아서 disp 메소드 호출
	
	public abstract Person[] insert(int personSu);
	//personSu(사람수)를 받아서 Person 배열을 만들기
	//Scanner로 이름 나이 전화번호 주소를 입력받아
	//person 객체를 만들고 각 배열의 요소에 저장하기
	//Person 배열 리턴
}

class PersonServiceImpl implements PersonService{
	Scanner scan;
	public PersonServiceImpl() {
		scan = new Scanner(System.in);
	}
	
	@Override
	public Person[] insert(int personSu) {
		
		Person[] person = new Person[personSu];
		for(int i =0; i < personSu; i++) {
			System.out.print("이름 입력 : ");
			String name = scan.next();
			System.out.print("나이 입력 : ");
			int age = scan.nextInt();
			System.out.print("번호 입력 : ");
			String number = scan.next();
			System.out.print("주소 입력 : ");
			String address = scan.next();
		
			person[i] = new Person(name,age,number,address);
		}
		return person;
	}
	
	@Override
	public void view(Person[] person) {
		for(int i = 0; i < person.length; i++) {
			person[i].disp();
			System.out.println();
		}
	}
}

public class EX06 {

	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사람 수를 입력 : ");
		int personSu = scan.nextInt();
		
		PersonService ps = new PersonServiceImpl();

		Person[] person = ps.insert(personSu);

		ps.view(person);

		scan.close();
		
			
	}

}
