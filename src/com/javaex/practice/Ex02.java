package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		int x, y; // x는세로축 y는 가로축
		for(x=0; x<4; x++) { //x값은0,x는 4미만이 될때까지반복, 반복시 1씩증가
			for(y=0; y<2; y++)// y값은0,y는 2미만이 될때까지반복, 반복시 1씩증가
			System.out.print("*"); //y값이잇는 for문에서 0,1 2번반복하고 2는 y보다 크기때문에 false라서 실행하지않고 x값이잇는 for문으로 올라가서 반복한다
		}						//	결과는 : ********
		System.out.println("");
	
	}

}

