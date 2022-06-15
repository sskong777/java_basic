package program2;

import java.util.*;

public class MemberServiceImpl implements MemberService {

	private HashSet<Member> set;
	private Scanner scan;
	
	public MemberServiceImpl() {
		set = new HashSet<Member>();
		scan  = new Scanner(System.in);
	}
	@Override
	public void viewAll() {
		//전체회원목록 출력
		Iterator<Member> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			Member viewAll = setIter.next();
			viewAll.disp();
		}
	}
	@Override
	public void view() {
		//이름을 입력받아 회원의 나이와 전화번호 출력
		System.out.print("회원이름 : " );
		String name = scan.next();
		
		Iterator<Member> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			Member view = setIter.next();
			if(name.equals(view.getName())) {
				System.out.println(name + "님의 나이는 : " + view.getAge());
				System.out.println(name + "님의 전화번호는 : " + view.getPhoneNum());
				return;
			}
			System.out.println(name + "님은 저희 회원이 아닙니다");
		}
	}
	@Override
	public void insert() {
		//이름 나이 전화번호를 입력받아 회원등록
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		System.out.print("전화번호 : ");
		String phoneNum = scan.next();
		
		Member member = new Member(name,age,phoneNum);
		set.add(member);
	}
	@Override
	public void edit() {
		//이름을 입력받아 회원의 나이와 전화번호 수정
		System.out.print("이름 : ");
		String name = scan.next();
	
		Iterator<Member> setIter = set.iterator();
		while(setIter.hasNext()) {
			Member edit = setIter.next();
			if(name.equals(edit.getName())) {
				
				System.out.print("수정할 나이 : ");
				int changeAge = scan.nextInt();
				System.out.print("수정할 전화번호 : ");
				String changePhoneNum = scan.next();

				edit.setAge(changeAge);
				edit.setPhoneNum(changePhoneNum);
				
				System.out.println(name+"님의 나이와 전화번호를 수정했습니다");
				return;
			}
		}
		System.out.println(name + "님은 저희 회원이 아닙니다");
	}
	@Override
	public void delete() {
		//이름을 입력받아 회원을 삭제
		System.out.print("이름 : ");
		String name = scan.next();
		
		Iterator<Member> setIter = set.iterator();

		while(setIter.hasNext()) {
			
			Member delete = setIter.next();
			
			if(name.equals(delete.getName())) {
				set.remove(delete);
				System.out.println(name + "회원을 삭제했습니다");
				return;
			}
		}
		System.out.println(name + "님은 저희 회원이 아닙니다");

	}
		
	
}

