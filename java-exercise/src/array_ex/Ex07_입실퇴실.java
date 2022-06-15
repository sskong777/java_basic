package array_ex;

import java.util.Scanner;

public class Ex07_입실퇴실 {

	public static void main(String[] args) {

		
		// 방의 갯수를 만들고 그 방에 대한
		// 입실 퇴실 보기 종료 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("방의 개수를 입력하시오 : ");
		int roomSu = scan.nextInt();
		
		// false일 경우 빈 방, true일 경우 사용 중
		boolean[] room = new boolean[roomSu];
		
		while(true) {
			System.out.println("1.입실 2.퇴실 3.보기 4.종료");
			System.out.println("선택 >> ");
			int select = scan.nextInt();
			
			switch(select) {
			
			case 1 : 
				int inRoom ;
				do {
					System.out.print("몇번방을 선택하시겠습니까? >>");
					inRoom = scan.nextInt();
				}while(inRoom < 1 || inRoom > roomSu);
				
				if(room[inRoom - 1]) {
					System.out.println("사용중인 방입니다.");
				}else {
					System.out.println(inRoom + "호실에 입실했습니다");
					room[inRoom-1] = true;
				}
				break;
				
			case 2: 
				int outRoom;
				do {
					System.out.print("퇴실할 방 번호를 입력해주세요 : ");
					outRoom = scan.nextInt();
				}while(outRoom < 1 || outRoom > roomSu);
				
				if(room[outRoom-1]) {
					System.out.println(outRoom + "호실이 퇴실처리 되었습니다.");
					room[outRoom-1] = false;
				}else {
					System.out.println("빈방입니다.");
				}
				break;
			
			case 3 : 
				for (int i = 0; i  < room.length; i++) {
					if(room[i]) {
						System.out.println(i+1 + "호실은 사용 중");
					}else {
						System.out.println(i+1 + "호실은 빈 방");
					}
				}
				break;
			
			case 4 : 
				System.out.println("프로그램이 종료됩니다");
				System.exit(0);
				break;
				default :
					System.out.println("잘못입력하였습니다");
					break;
			}
			
			
				
		}
		
	}

}
