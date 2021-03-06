package map;

import java.util.*;

// Student 클래스를 만들고
// 필드를 int studentID; String name;으로 한다.
// 생성자를 통해 초기화를하고 
// eqauls(), hashCode() 오버라이딩해서 재정의 한다

class Student{
	int studentID; 
	String name;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			boolean bool = this.studentID == student.studentID
					&& this.name.equals(student.name);
			return bool;
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return (studentID + name).hashCode();
	}
	
	
}
public class EX06 {

	public static void main(String[] args) {

		//HashMap을 사용해서 key에는 Student , Value(점수)에는 Integer를 넣는다
		//keySet 메소드로 Set에 key값을 넣어준 뒤 반복자(Iterator)를 이용해서
		//key와 value를 출력해보자
		
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1,"홍길동"), 50);
		map.put(new Student(2,"성춘향"), 70);
		map.put(new Student(3,"이몽룡"), 85);
		map.put(new Student(4,"장보고"), 80);
		map.put(new Student(5,"이순신"), 100);
		
		System.out.println("총 Entry 수 : " +map.size());
		
		Set<Student> keySet = map.keySet();
		Iterator<Student> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			Student key = keyIter.next();
			int value = map.get(key);
			System.out.println("학번 : " + key.studentID + "번, 이름 : " + key.name + ", 점수 : " + value);
		}
		
		
		
		
	}

}
