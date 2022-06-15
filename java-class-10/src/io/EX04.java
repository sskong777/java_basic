package io;

import java.io.*;

public class EX04 {

	public static void main(String[] args) throws Exception{

		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir,"aaa.txt");
		
		FileInputStream fis = new FileInputStream(file);
		
		while(true) {
			
			int data = fis.read();
			//한글자 한글자 아스키코드로 받아서 int로 데이터를 준다.
			
			if(data == -1) {  //바이트 입력에 파일의 끝값은 " -1 "이다.
				break;	
			}
			
			System.out.print((char)data);	//아스키코드를 char로 형 변환 후 출력
		}
		
		fis.close();
		
		
		
		
		
		
	}

}
