package io;

import java.io.*;

public class EX03 {

	public static void main(String[] args) throws Exception{
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir,"aaa.txt");
	
		FileOutputStream fos = new FileOutputStream(file, true);
		//파일이 없으면 만든다.
		//객체 생성시 true면 이어쓰기, false면 다시쓰기, 기본값(디폴트)가 false
//		
//		fos.write(65);	//아스키 코드로 넣어진다
//		// C:\\aaa\aaa.txt에 "A"라는 내용이 생성
//		fos.write('B');
	
		String msg = "Hello Java!";
		//write메소드에 바로 문자열을 넣어주면 안된다.
	
		byte[] by = msg.getBytes();
		
		fos.write(by, 6, 4);
		//문자열을 바이트 배열로 바꾼 뒤 write메소드에 넣어줌
		
		fos.close();
		
	}
	

}
