package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		int i =1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5)
				flag = false;
		} // 1>=5 는 false라 실행되지않는다.
		System.out.println(i);
		i=i+1;
	}

}
