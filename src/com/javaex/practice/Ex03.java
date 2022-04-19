package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		int x, y;
		for(x=0; x<4; x++) {
			for(y=2; y>=0; y--) { // y-- y값을 1씩 감소, 결과값 2,1,0실행후 위의 for문으로 올라가 반복실행
				System.out.print("*"); // 결과는 ************
			}  
		}System.out.println("");
	}

}
