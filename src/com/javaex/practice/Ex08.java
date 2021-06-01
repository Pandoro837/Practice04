package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요
		// 중복 체크
		
		int[] iRotto = new int[6];
		
		iRotto[0] = (int)(Math.random()*44)+1;

		//중복 체크
		for(int i = 1; i < iRotto.length; i++) {
			iRotto[i] = (int)(Math.random()*44)+1;
			
			for(int x = 0; x < i; x++) {
				
				if (iRotto[i] == iRotto[x]) {
					iRotto[i] = (int)(Math.random()*44)+1;
					i--;
					
				}
			}
		}
		
		// 출력
		for(int i = 0; i < iRotto.length; i++)
		{
			System.out.print(iRotto[i] + "\t");	
		}
		
	}

}
