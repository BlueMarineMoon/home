package org.comstudy21.exam02;

import java.util.Scanner;
import java.util.Random;

public class RandomCard {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			Random rd = new Random();
			int kd = rd.nextInt(100);
			System.out.println("ī���� ���� �����߽��ϴ�. ���纸����. 0 ~ 99");
			int i = 1;
			while(true) {
				System.out.println(i+ " >> ");
				int input = sc.nextInt();
				while(input != kd) {
					if(input<kd)
						System.out.println("�� ������");
					else if(input>kd)
						System.out.println("�� ������");
					i++;
					break;
				}
				if(input==kd) {
					System.out.println("�����Դϴ�.");
					System.out.println("�ٽ� �Ͻðڽ��ϱ�? (Y/N) >>");
					
					if(sc.next().equals("N")) {
						System.out.println("ī�� ���� ���߱⸦ �����մϴ�.");
						System.exit(0);
					}
				}
				
			}
			
		}
		

	}

}