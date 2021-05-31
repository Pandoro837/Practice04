package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		//double 형 배열 을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고 
		//아래와 같이 출력되도록 for문을 작성하세요.
		
//		double[] dList; 
//		dList = new double[3];
//		dList[0] = 1.2;
//		dList[1] = 3.3;
//		dList[2] = 6.7;
//		double[] dList = new double[3];
//		dList = new double[] {1.2, 3.3, 6.7};
//		double[] dList = {1.2, 3.3, 6.7};
		double[] dList = new double[] {1.2, 3.3, 6.7};
		
		int iNum = dList.length - 1;
		
		for(int i = 0; i < dList.length; i++) {
			System.out.println(dList[iNum]);
			iNum--;
		}
		

	}

}
