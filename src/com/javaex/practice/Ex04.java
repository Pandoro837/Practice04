package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		// Ex04 다음 주어진 배열 데이터를 이용하여 
		//3의 배수의 개수와 배수의 합을 아래와 같이 출력하는 프로그램을 작성하세요.
		
		int[] iData = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		int iCount = 0;
		int iSum = 0;
		
		for(int i = 0; i < iData.length; i++) {
			if(iData[i] % 3 == 0) {
				iCount++;
				iSum = iSum + iData[i];
			}
		}
		
		System.out.println("주어진 배열에서 3의 배수의 개수 = > " + iCount);
		System.out.println("주어진 배열에서 3의 배수의 합 = > " + iSum);
	}

}
