package io;
 
import java.io.*;
public class EX01 {

	public static void main(String[] args) throws Exception{
								//원래는 내가 직접 try-catch문을 사용
			File file1 = new File("C:\\aaa\\aaa.txt");
			// 파일이 없어도 상관이 없다
			
			File file2 = new File("C:\\aaa","aaa.txt");
			// 폴더명과 파일명으로 나타낼 수 있다.
			
			File file3 = new File("C:\\aaa");
			// 폴더까지만 만들 수 있다.
			
			File file4 = new File(file3,"aaa.txt");
			// 파일 경로에 객체를 넣어서 만들 수 있다
			
			// 윈도우 폴더구별자 : \
			// 리눅스 폴더구별자 : /
			// 윈도우 패스구별자 : ;
			// 리눅스 패스구별자 : :
	
			File dir = new File("C:" + File.separator + "aaa");
			//File.separator : 폴더 구별자 (윈도우,리눅스 알아서 폴더를 구별해줌)
			
			File file = new File(dir,"aaa.txt");
			
			
	}

}
