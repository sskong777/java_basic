package program1;

import java.util.*;
public class MusicPlayerServiceImpl implements MusicPlayerService {
	Scanner scan;
	ArrayList<MusicPlayer> list;
	
	public MusicPlayerServiceImpl() {
		scan = new Scanner(System.in);
		list = new ArrayList<MusicPlayer>();
	}
	@Override
	public void play() {
		//뮤직 전체 재생
		for(MusicPlayer music : list) {
			music.disp();
			
			}
		if(list.isEmpty()) {
				System.out.println("재생목록이 비었습니다");
		}
	}

	@Override
	public void insert() {
		// 가수 이름과 곡 이름을 입력받아 뮤직 넣기
		System.out.print("가수 이름을 입력하시오(뮤직 넣기) : ");
		String singerName = scan.next();
		System.out.println("곡 이름 : ");
		String music = scan.next();
		
		list.add(new MusicPlayer(singerName,music));
	}

	@Override
	public void choicePlay() {
		// 가수 이름을 입력받아 해당뮤직 재생
		System.out.print("가수 이름을 입력하시오(재생) : ");
		String singerName = scan.next();

		for(int i = 0 ;i <list.size(); i++) {
			MusicPlayer play = list.get(i);
			if(play.getSinger().equals(singerName)) {
				play.disp();
				return;
				
			}
		}
		System.out.println("해당 가수가 목록에 없습니다");
	}

	@Override
	public void choiceDelete() {
		// 가수 이름을 입력받아 해당 뮤직 삭제
		System.out.print("가수 이름을 입력하시오(삭제) : ");
		String singerName = scan.next();

		for(int i = 0; i < list.size(); i++) {
			MusicPlayer del = list.get(i);
			if(del.getSinger().equals(singerName)) {
				list.remove(i);
				System.out.println(singerName + " 이 삭제되었습니다");
			}
		}
		System.out.println("해당 가수가 목록에 없습니다");
	}

	@Override
	public void delete() {
		// 전체 재생뮤직 삭제
		Iterator<MusicPlayer> iter = list.iterator();
		while(iter.hasNext()) {
			iter.next();
			iter.remove();
		}
		//list.clear();
	}
	
}
