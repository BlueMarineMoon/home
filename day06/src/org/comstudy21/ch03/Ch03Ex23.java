package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex23 {

	static Scanner scan = new Scanner(System.in);
	public static void main02(String[] args) {
		int[] score = {95,70,85,90,100,45,35,85,70,75};
		
		// 65를 입력 받아서 65가 있으며 true를 아니면 false 출력
		// 검색 할 점수 >> 65
		// 결과 5는 배열에 없습니다!
		// 1. 점수를 입력 받는다.
		// 2. 입력받은 점수가 배열에 있는가? 검색
		// 3. 있다면 count한다.
		
		int ea = 0;
		int keyNum = 0;
		
		System.out.print("검색 할 점수 >> ");
		keyNum = scan.nextInt();
		for(int i=0; i<score.length; i++) {
			if(keyNum == score[i]) {
				ea++;
			}
		}
		// 4. 검색 종료 후 결과 출력
		if(ea == 0) {
			System.out.printf("결과 : %d는 배열에 없습니다!", keyNum);
		} else {
			System.out.printf("결과 : %d는 배열에 %d개 있습니다!", keyNum, ea);
		}
	}
	
	public static void main03(String[] args) {
		// 배열에 점수를 입력 받아서 제일 큰 점수와 제일 작은 점수 출력
		int[] score = new int[5];
		int max = 0, min = 100;
		
		for(int i=0; i<score.length; i++) {
			System.out.print("점수 입력"+i+" >> ");
		}
		
	}
	
	public static void main(String[] args) {
		int[] score = {65,100,75,80,35,90};
		int[] rank = new int[score.length];
		
		// [5, 1, 4, 3, 6, 2]
	}

}
