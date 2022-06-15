package abstract_ex;

import java.util.Scanner;

abstract class Singer{
	
	String[] music;
	
	public Singer(String[] music) {  //생성자
		this.music =music;
		
	}
	public abstract void sing();	//추상메소드
	public abstract void dance();

}
class Bts extends Singer{

	String memberName;
	
	public Bts(String name, String[] music) {
		super(music);
		this.memberName =name;
	}
	
	@Override
	public void sing() {
		for(int i = 0; i<music.length; i++) {
			System.out.println("BTS멤버 중 " + memberName + "이(가) \"" + music[i] + "\" 곡의 노래를 부릅니다");
		}
	}
	@Override
	public void dance() {
		for(int i = 0; i<music.length; i++) {
			System.out.println("BTS멤버 중 " + memberName + "이(가) \"" + music[i] + "\" 곡의 춤을 춥니다");
		}
	}
	
}
//Singer 클래스를 상속받는 BTS클래스를 만들고
//추상메소드를 오바라이딩하여 채워보자
public class EX03 {

	public static void main(String[] args) {
		
		String[] BTSMusic = null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇 개의 B TS곡을 입력하겠습니까?");
		int musicSu = scan.nextInt();
		
		BTSMusic = new String[musicSu];
		
		for (int i =0 ; i < musicSu; i++) {
			System.out.println("BTS곡을 입력하세요");
			BTSMusic[i] = scan.next();
		}
		
		System.out.println("BTS중 좋아하는 멤버 이름 입력 : ");
		String name = scan.next();
		
		Bts bts = new Bts(name,BTSMusic);
		
		while(true) {
			System.out.println("#####/t" + name + "\t#####");
			System.out.println("1.노래 2.춤 3.그만");
			int choice =scan.nextInt();
			
			if(choice ==1) {
				bts.sing();
			}else if(choice ==2) {
				bts.dance();
			}else if(choice ==3) {
				System.out.println("음악을 끕니다");
				break;
			}else {
				System.out.println("잘못눌렀습니다");
				System.out.println("시스템종료");
				System.exit(0);
			}
			scan.close();
			
		}

	}

}
