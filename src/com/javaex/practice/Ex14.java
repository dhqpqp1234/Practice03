package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int i =1; i<=num; i++) {
			for(int j = 1; j<=i; j++) {
				
			}
		int sum = 0;
		int total = 0;
		
		sum = sum +i;
		total = total +sum;
			System.out.println(total);
		}
		sc.close();
	}

}
