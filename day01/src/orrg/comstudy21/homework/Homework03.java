package orrg.comstudy21.homework;

import java.util.Scanner;

public class Homework03 {
	public static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// ���� �߽ɰ� ������ �׸��� ��(x,y)�Է�
		double x=0, y=0, radius=0; // ���� �߽���(x,y)�� ������(radius)
		double x2=0, y2=0; //���� ��ǥ �Է�
		
		System.out.print("���� �߽ɰ� ������ �Է�>> ");
		x = scan.nextDouble();
		y = scan.nextDouble();
		radius = scan.nextDouble();
		System.out.println("�� �Է�>> ");
		x2 = scan.nextDouble();
		x2 = scan.nextDouble();
		scan.close();
		
		System.out.printf("%.1f, %.1f, %.1f\n", x, y, radius);
		System.out.printf("%.1f, %.1f\n", x2, y2);
		
		double d = Math.sqrt((x-x2)*(x-x2) + (y-y2)*(y-y2));
		if(d < radius) {
			System.out.println("�� �ȿ� �ִ�.");
		} else {
			System.out.println("�� �ۿ� �ִ�.");
		}
	}
	
	public static void mainTest(String[] args) {
		System.out.println(Math.sqrt(9));
	}
}
