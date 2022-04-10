package com.paris;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1712번 (손익분기점)

public class test2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nums = br.readLine();
		StringTokenizer st = new StringTokenizer(nums);

		
		int n1 = Integer.parseInt(st.nextToken()); // 연간고정비
		int n2 = Integer.parseInt(st.nextToken()); // 대당 생산비
		int n3 = Integer.parseInt(st.nextToken()); // 노트북 가격

		if(n2>=n3){
			System.out.println("-1");
		} else { 
			System.out.println(n1/(n3-n2) +1);	
		}
	
	}

}
