package array;

import java.util.Scanner;

public class EX16_중요 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 방의 갯수를 만들고 그 방에 대한
		// 입실 퇴실 보기 종료
		System.out.print("방의 갯수를 입력 : ");
		int roomSu = scan.nextInt();
		//방의 갯수 입력받고 roomSu에 저장
		
		boolean[] room = new boolean[roomSu];
		// false일 경우 빈 방, true일 경우 사용중
		
		while(true) { 
			
			System.out.println("1.입실 2.퇴실 3.보기 4.종료");
			System.out.print("선택 >> ");
			int select = scan.nextInt();
			
			switch (select) {
			
			case 1 :
				int inRoom;
				do {
					System.out.print("입실할 방의 번호를 입력 : ");
					inRoom = scan.nextInt();
				}while(inRoom < 1 || inRoom > roomSu);
				//방의 번호가 1보다 작거나 방의 갯수보다 크다면 다시 받는다
				//
				if(room[inRoom -1]) {	//index는 0부터 시작하기때문에 -1
					System.out.println(inRoom + "호실은 사용중입니다");
				}else {
					System.out.println(inRoom + "호실에 입실했습니다");
					room[inRoom -1] = true;
					//입실 했으면 true로 바꾸어 빈방이 아니게 해준다.
				}
				break;
				
			case 2 :
				int outRoom;
				do {
					System.out.print("퇴실하실 방의 번호를 입력 : ");
					outRoom = scan.nextInt();
				}while(outRoom < 1 || outRoom > roomSu);
				
				if(!room[outRoom - 1]) {	// !는 논리부정연산자. 논리값을 반대로한다.
					System.out.println(outRoom + "호실은 빈방입니다.");
				}else {
					System.out.println(outRoom + "호실에서 퇴실하셨습니다");
					room[outRoom -1] = false;
					//퇴실한 다음 빈방으로 만들어준다.
				}
				
				break;
				
			case 3 :
				for (int i = 0; i < roomSu; i++) {
					if(room[i]) {
						System.out.println(i+1 + "호실은 사용중입니다");
					}else {
						System.out.println(i+1 + "호실은 빈방입니다.");
					}
				}
				break;
				
			case 4 :
				System.out.println("프로그램을 종료");
				System.exit(0); 	//프로그램 강제종료
				default :
					System.out.println("잘못 입력 하였습니다.");
		
			}
		}
	
	
	}
}
