package io;

import java.io.*;

public class EX05 {

	public static void main(String[] args) throws Exception{

		//파일 복사하기
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir,"BTS.jpeg");
		
		
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(dir + File.separator + "COPY.jpeg");
		
		byte[] byteArray = new byte[1024];
		
		while(true) {
			//데이터는 byte 배열에 들어간다.
			//이때 int는 몇 개나 새로운 데이터를 읽었는지 count로 나온다.
			int count = fis.read(byteArray);
			
			if(count == -1) {
				break;
			}
		
			fos.write(byteArray, 0 , count);
							   //시작 //끝
			//byte배열에 데이터를 0부터(맨처음부터) 새로읽은 count만큼만 쓴다.	
			System.out.println(count);
		}
		fos.close();
		fis.close();
		
	}
	
}