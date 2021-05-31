package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		// 아래코드의 출력값을 예상하고 코드로 확인해 보세요.
		
		int[] intA = { 3, 6, 9};
		
		int[] intB;
		intB = intA;
		intB[0] = 20; //intA를 복사한 intB의 0번방이 20으로 바뀐다	- 오답
		intB[2] = 10; //intA를 복사한 intB의 2번방이 10으로 바뀐다	- 오답
		
		//intB의 주소값을 intA로 연결, intA에 저장된 0, 2번방의 값이 바뀌었다
		
		for(int i = 0; i < intA.length; i++) {
			System.out.println(intA[i]);
		}
		//intA의 [0], [1], [2] 값인 3, 6, 9 가 출력된다 - 오답
	}

}
