package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex23 {

	static Scanner scan = new Scanner(System.in);
	public static void main02(String[] args) {
		int[] score = {95,70,85,90,100,45,35,85,70,75};
		
		// 65�� �Է� �޾Ƽ� 65�� ������ true�� �ƴϸ� false ���
		// �˻� �� ���� >> 65
		// ��� 5�� �迭�� �����ϴ�!
		// 1. ������ �Է� �޴´�.
		// 2. �Է¹��� ������ �迭�� �ִ°�? �˻�
		// 3. �ִٸ� count�Ѵ�.
		
		int ea = 0;
		int keyNum = 0;
		
		System.out.print("�˻� �� ���� >> ");
		keyNum = scan.nextInt();
		for(int i=0; i<score.length; i++) {
			if(keyNum == score[i]) {
				ea++;
			}
		}
		// 4. �˻� ���� �� ��� ���
		if(ea == 0) {
			System.out.printf("��� : %d�� �迭�� �����ϴ�!", keyNum);
		} else {
			System.out.printf("��� : %d�� �迭�� %d�� �ֽ��ϴ�!", keyNum, ea);
		}
	}
	
	public static void main03(String[] args) {
		// �迭�� ������ �Է� �޾Ƽ� ���� ū ������ ���� ���� ���� ���
		int[] score = new int[5];
		int max = 0, min = 100;
		
		for(int i=0; i<score.length; i++) {
			System.out.print("���� �Է�"+i+" >> ");
		}
		
	}
	
	public static void main(String[] args) {
		int[] score = {65,100,75,80,35,90};
		int[] rank = new int[score.length];
		
		// [5, 1, 4, 3, 6, 2]
	}

}
