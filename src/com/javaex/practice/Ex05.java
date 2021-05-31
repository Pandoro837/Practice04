package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요

		Scanner sc = new Scanner(System.in);
		
		double[] dNum = new double[5];
		double dSum = 0;
		
		System.out.println("숫자를 입력하세요.");
		
		for(int i = 0; i < dNum.length; i++) {
			dNum[i] = sc.nextDouble();
			dSum = dSum + dNum[i];
		}

		System.out.println("평균은 " + (dSum / dNum.length) + "입니다.");
		
		sc.close();
	}

}
