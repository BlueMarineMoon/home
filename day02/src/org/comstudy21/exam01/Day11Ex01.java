package org.comstudy21.exam01;

import java.io.IOException;
import java.util.Scanner;

public class Day11Ex01 {
	//public static Scanner scan = new Scanner(System.in);
	public static int getNum() {
		int num = 0;
		int ch = 0;
		try {
			while((ch = System.in.read())!='\n') {
				if(ch>='0' && ch<='9') {
					num = num * 10 + ch - '0';	
				}
			}
		} catch (IOException e) {}
		return num;
	}
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 정수 3개를 입력 받아서 큰수, 중간, 작은수를 판별하는 프로그램.
		int a, b, c;
		int max=0, mid=0, min=0;
		
		System.out.print("첫번째 정수 입력 >>> ");
		a = getNum();
		System.out.print("두번째 정수 입력 >>> ");
		b = getNum();
		System.out.print("세번째 정수 입력 >>> ");
		c = getNum();
		
		
		System.out.printf("%d, %d, %d\n", a, b, c);
		
		if(a>b) {
			if(a>c) {
				max = a;
				if(b<c) {
					min = b;
				} else {
					min = c;
				}
			} else {
				max = c;
				if(a<b) {
					min = a;
				} else {
					min = b;
				}
			}
		} else {
			if(b>c) {
				max = b;
				if(a<c) {
					min = a;
				} else {
					min = c;
				}
			} else {
				max = c;
				if(a<b) {
					min = a;
				} else {
					min = b;
				}
			}
		}	
		
		if(a!=max)
		
		System.out.println("제일 큰수는 " + max);
		System.out.println("제일 작은것 " + min);
	}

}
