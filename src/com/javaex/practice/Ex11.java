package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int sum=0;
		int sum1=0;
		
		for (int i = 1; i<=num; i++) {
			if(i%2==0) {
				sum = sum+i;
			}else if(i%2==1) {
				sum1= sum+i;
			}System.out.println(sum);
			
		sc.close();
	}
	}
}
