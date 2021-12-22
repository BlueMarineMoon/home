package org.comstudy21.exam02;

import java.util.Scanner;
import java.util.Random;

public class RandomCard {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			Random rd = new Random();
			int kd = rd.nextInt(100);
			System.out.println("카드의 수를 결정했습니다. 맞춰보세요. 0 ~ 99");
			int i = 1;
			while(true) {
				System.out.println(i+ " >> ");
				int input = sc.nextInt();
				while(input != kd) {
					if(input<kd)
						System.out.println("더 높은수");
					else if(input>kd)
						System.out.println("더 낮은수");
					i++;
					break;
				}
				if(input==kd) {
					System.out.println("정답입니다.");
					System.out.println("다시 하시겠습니까? (Y/N) >>");
					
					if(sc.next().equals("N")) {
						System.out.println("카드 숫자 맞추기를 종료합니다.");
						System.exit(0);
					}
				}
				
			}
			
		}
		

	}

}
