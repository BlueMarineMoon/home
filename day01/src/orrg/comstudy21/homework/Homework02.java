package orrg.comstudy21.homework;

import java.util.Scanner;

public class Homework02 {
	public static final Scanner scan = new Scanner(System.in);
	
	static boolean inRect(int x, int y, int rectx1, int rexty1, int rectx2, int rexty2) {
		if((x>=rectx1 && x<=rectx2) && (y>=rexty1 && y<=rexty2)) {
			return true;
		}
		return false;
}

	public static void main(String[] args) {
		// 2�� �������� 8��
		int x1=100, x2=200, y1=100, y2=200;
		System.out.print("��(x1,y1)�� ��ǥ�� �Է��Ͻÿ�>>");
		int nx1 = scan.nextInt();
		int ny1 = scan.nextInt();
		System.out.print("��(x2,y2)�� ��ǥ�� �Է��Ͻÿ�>>");
		int nx2 = scan.nextInt();
		int ny2 = scan.nextInt();
		scan.close();
		
		
		if(inRect(nx1,ny1,x1,x2,y1,y2) || inRect(nx2,ny2,x1,x2,y1,y2)) {
			System.out.println("�浹 ����!");
		} else {
			System.out.println("�浹 ����!");
		}
		
		
		// x�� x1�� x2���̿� �ְ� y�� y1�� y2���̿� �ִ°�?
		//if((x>=x1&&x<=x2) && (y>y1&&y<=y2)) {
		//	System.out.println("�簢�� �ȿ� �ֽ��ϴ�!");
		//} else {
		//	System.out.println("�簢�� �ȿ� �����ϴ�.");
		//}
		
	}

}