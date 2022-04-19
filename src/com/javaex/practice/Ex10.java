package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		int a = sc.nextInt();
		System.out.print("숫자: ");
		int b = sc.nextInt();		
		System.out.print("숫자: ");
		int c = sc.nextInt();
		System.out.print("숫자: ");
		int d = sc.nextInt();
		System.out.print("숫자: ");
		int e = sc.nextInt();
		
		while(true) {
			if(a>b && a>c) {
				System.out.println("최대값은 "+a+"입니다.");
			}else if(a>d && a>e) {
				System.out.println("최대값은 "+a+"입니다.");
			}else if(b>a && b>c) {
				System.out.println("최대값은 "+b+"입니다.");
			}else if(b>d && b>e) {
				System.out.println("최대값은 "+b+"입니다.");
			}else if(c>a && c>b) {
				System.out.println("최대값은 "+c+"입니다.");
			}else if(c>d && c>e) {
				System.out.println("최대값은 "+c+"입니다.");
			}else if(d>a && d>b) {
				System.out.println("최대값은 "+d+"입니다.");
			}else if(d>c && d>e) {
				System.out.println("최대값은 "+d+"입니다.");
			}else {
				System.out.println("최대값은 "+e+"입니다.");
			}break;
		}
		
		sc.close();
	}

}
