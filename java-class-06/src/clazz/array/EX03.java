package clazz.array;

import java.util.Scanner;

// People 클래스를 만들고 
// 필드는 String name; int age;
// 생성자의 매개값으로 필드 초기화

class People{
	String name;
	int age;
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
}


public class EX03 {

	public static void main(String[] args) {
		//Scanner로 사람수(peopleCount)를 입력받아 클래스배열을 만들고
		//이름과 나이를 입력받아 객체를 생성 후 배열의 각 요소에 저장
		//출력해보자
		String name;
		int age;
		int peopleCount;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사람 수를 입력 : " );
		peopleCount = scan.nextInt();
		
		People[] people = new People[peopleCount];
		
		for(int i = 0; i < people.length; i++) {
			System.out.print(i+1 + "번째 사람의 이름을 입력 : ");
			name = scan.next();
			System.out.print(i+1 + "번째 사람의 나이를 입력 : ");
			age = scan.nextInt();
			
			people[i] = new People(name,age);
			//객체를 생성해서 배열의 각 요소에 저장
		}
		for(int i = 0; i < people.length; i++) {
			System.out.println(people[i].name + " : " + people[i].age + "살");
		}
				
		scan.close();
	}

}
