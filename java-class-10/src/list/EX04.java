package list;

import java.util.*;
// Student 클래스를 만든다
// 필드는 int studentID; String name; String dapartment; 이다
// 생성자로 필드초기화를 하고 disp메소드로 학번 이름 학과를 출력해보자.

class Student{
	
	int studentID; 
	String name; 
	String department;
	
	public Student(int studentID, String name, String department) {
		this.studentID = studentID;
		this.name = name;
		this.department = department;
	}

	public void disp() {
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + department);

	
	}
}
public class EX04 {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student(20152356,"홍석현","컴퓨터공학과"));
		list.add(new Student(20112556,"김준식","물리치료과"));
		list.add(new Student(20213312,"이준영","기계공학과"));
		
		//일반 for문 향상된 for문 그리고 Iterator를 사용해서 출력
		for(Student student : list) {
			student.disp();
			System.out.println();
		}
		
		//향상된 for문
		for(int i = 0; i < list.size(); i++) {
			Student student = list.get(i);
			student.disp();
			System.out.println();
		}
		
		//Iterator를 사용
		Iterator<Student> iter = list.iterator();	//반복자
		while(iter.hasNext()) {	//요소가 있는지 확인 후 true,false를 리턴
			Student stu = iter.next();	//요소를 하나씩 가져옴
			stu.disp();
		}
		System.out.println();
	}

}
