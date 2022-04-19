package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("while문");
		int index = 0;
		while( index < 3) { //index (0)<3 = 3미만까지 반복
			System.out.println("index=" + index); //index 에 반복숫자출력
			index++; //반복될때마다 1씩증가
		}
		// index=0,index=1,index=2 출력
		
		
		System.out.println("for문");
		for(int order=0; order<3; order++) { //order=0, dorder이 3미만까지 반복 반복시 1씩증가
			System.out.println("order=" + order); // order= 0,order= 1,order= 2
		}
	}

}
