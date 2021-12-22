package orrg.comstudy21.homework;

import java.util.Scanner;

public class Homework03 {
	public static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 원의 중심과 반지름 그리고 점(x,y)입력
		double x=0, y=0, radius=0; // 원의 중심점(x,y)와 반지름(radius)
		double x2=0, y2=0; //점의 좌표 입력
		
		System.out.print("원의 중심과 반지름 입력>> ");
		x = scan.nextDouble();
		y = scan.nextDouble();
		radius = scan.nextDouble();
		System.out.println("점 입력>> ");
		x2 = scan.nextDouble();
		x2 = scan.nextDouble();
		scan.close();
		
		System.out.printf("%.1f, %.1f, %.1f\n", x, y, radius);
		System.out.printf("%.1f, %.1f\n", x2, y2);
		
		double d = Math.sqrt((x-x2)*(x-x2) + (y-y2)*(y-y2));
		if(d < radius) {
			System.out.println("원 안에 있다.");
		} else {
			System.out.println("원 밖에 있다.");
		}
	}
	
	public static void mainTest(String[] args) {
		System.out.println(Math.sqrt(9));
	}
}
