package interface1;

import java.util.Scanner;

class IronMan{
	IronSuit ironSuit;	//필드 선언
	public IronMan() { //생성자
		ironSuit = new NormalIronSuit();
	}
	public void fight(IronSuit ironSuit) { //메소드
		if(ironSuit instanceof NewIronSuit) {
			NewIronSuit newIronSuit = new NewIronSuit();
			newIronSuit.laserBeanAttack();
		}
		ironSuit.attack();
		//마크43이 들어오면 laserBeamAttack() 메소드 호출
	}
}

interface IronSuit{
	public abstract void flying();
	public abstract void attack();
}
// 생성자 만들어서 슈트이름을 마크1으로 초기화
// 추상메소드 오버라이딩해서 재정의
class NormalIronSuit implements IronSuit{
	
	String suitName;
	public NormalIronSuit() {
		suitName = "Mark1";
	}
	@Override
	public void flying() {
		System.out.println(this.suitName + "이 날라간다.");
	}
	@Override
	public void attack() {
		System.out.println(this.suitName + "이 공격을 한다.");
	}
}
//생성자 만들어서 슈트이름을 마크43으로 초기화//추상메소드 오버라이딩해서 재정의
//laserBeanAttack()메소드 만들기
class NewIronSuit implements IronSuit{
	
	String newSuitName;
	public NewIronSuit() {
		newSuitName = "Mark43";
	}
	@Override
	public void flying() {
		System.out.println(this.newSuitName+"이 날라간다");
	}
	@Override
	public void attack() {
		System.out.println(this.newSuitName+ "이 공격을 한다");
	}
	public void laserBeanAttack() {
		System.out.println("laserBean을 장착한 " + newSuitName + "이 레이저 공격을 한다");
	}
}



public class EX05_중요 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		System.out.println("당신은 아이언맨 입니까? 1.yes  2.no ");
		int choice = scan.nextInt();
		
		if(choice != 1) {
			System.out.println("당신은 일반인이니 도망치세요");
			System.exit(0);
		}
		IronMan ironMan = new IronMan();
		System.out.println("아이언맨 반갑습니다 지구를 구해주세여");
		System.out.println("어떤 슈트로 입을까요? 1.마크1  2.마크43");

		int choice2 = scan.nextInt();
		
		if(choice2 == 1) {
			
			ironMan.ironSuit = new NormalIronSuit();	//필드의 다형성
			ironMan.ironSuit.flying();
			System.out.println("괴물을 물리치겠습니까? 1.yes 2.no");
			int choice3 = scan.nextInt();
			
			if(choice3 != 1) {
				System.out.println("괴물이 지구를 파괴했습니다");
				System.out.println("시스템 종료");
				System.exit(0);
			}
			
			NormalIronSuit ironSuit1 = new NormalIronSuit();
			ironMan.fight(ironSuit1); 	//매개변수의 다형성
			
		}else if (choice2 ==2) {
			
			ironMan.ironSuit = new NewIronSuit();	//필드의 다형성
			ironMan.ironSuit.flying();
			System.out.println("괴물을 물리치겠습니까? 1.yes 2.no");
			int choice3 = scan.nextInt();
			
			if(choice3 != 1) {
				System.out.println("괴물이 지구를 파괴했습니다");
				System.out.println("시스템 종료");
				System.exit(0);
			}
			
			NewIronSuit ironSuit1 = new NewIronSuit();
			ironMan.fight(ironSuit1);	//매개변수의 다형성	
			}else {
				System.out.println("잘못 입력했습니다. 시스템을 종료합니다");
				System.exit(0);
			}
		System.out.println("승리했습니다");
		scan.close();
	}

}
