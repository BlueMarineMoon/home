package org.comstudy21.exam01;

import java.util.Scanner;

public class Day11Ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c;
		System.out.println("첫번째 정수를 입력하세요 : ");
		a=input.nextInt();
		System.out.println("두번째 정수를 입력하세요 : ");
		b=input.nextInt();
		System.out.println("세번째 정수를 입력하세요 : ");
		c=input.nextInt();
		
		
		if(a<=100000&&b<=100000&&c<=100000) {
			if(a>b&&a<c||a<b&&a>c)
				System.out.println(a);
			else if(b>a&&b<c||b<a&&b>c)
				System.out.println(b);
			else
				System.out.println(c);
		}
		else
			System.out.println("잘못입력하셨습니다.");
	}

}
