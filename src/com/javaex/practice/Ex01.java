package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		//아래의 코드를 실행하면 출력결과에 오류가 발생한다. 
		//오류 수정 후 출력결과를 예상하고 코드로확인해 보세요.

		int[] intArray = new int[5];	//intArray의 방은 총 5개, 0~4
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		// intArray의 남은 방 3, 4는 기본 값인 0으로 합산
		int result = 0;
							//intArray.length = 5; i의 값은 0~5까지 커진다
							// i <= 5 일때, i의 최대값은 5
		for(int i = 0; i <= intArray.length; i++) {
			result = result + intArray[i];
		}		//intArray에 존재하지 않는 5번째 방을 요구하므로
				//오류가 발생하여 출력되지 않는다
		System.out.println(result);
	}

}
