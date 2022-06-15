package io;

import java.io.*;

public class EX12{

	public static void main(String[] args) throws Exception {
		// OX퀴즈
		// 1000개 정도 OX들이 있다
		// O는 1점 X는 점수가 없다
		// 만약에 연속으로 O가 등장할 경우 점수는 2배
		
		//OX의 점수의 합을 구하세요
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir,"ox.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		int hap = 0;
		//점수의 합을 구할 변수	
		while(true) {
			
			String msg = br.readLine();
			
			if(msg == null) {
				break;
			}
			System.out.println(msg);
			char[] charArr = msg.toCharArray();
			
			int x = 1;
			//점수를 제어할 제어변수
			for(int i = 0; i < charArr.length; i++) {
				if(charArr[i] =='O') {
					hap += x;
					x = x * 2;
				}else {
					x = 1;
				}
			}
		
		}
		System.out.println(hap);
		
		br.close();
		fr.close();
		
	}

}
