package orrg.comstudy21.homework;

import java.util.Scanner;

public class Homework01 {
	public static void println(String s) {
		System.out.println(s);
	}
	
	public static void main00(String[] args) {
		int price = 240;
		int money = 10000;
		int carry = money - price;
		
		System.out.println("�Ž��� �� => " + carry);
		//-------------------------------------------
		int ea5000 = carry / 5000;
		println("5õ��¥�� " + ea5000 + "��");
		carry = carry % 5000;
		println("���� �� => " + carry);
		//-------------------------------------------
		int ea1000 = carry / 1000;
		println("1õ��¥�� " + ea1000 + "��");
		carry = carry % 1000;
		println("���� �� => " + carry);
		//-------------------------------------------
		int ea500 = carry / 500;
		println("500��¥�� " + ea500 + "��");
		carry = carry % 500;
		println("���� �� => " + carry);
		//-------------------------------------------
		int ea100 = carry / 100;
		println("100��¥�� " + ea100 + "��");
		carry = carry % 100;
		println("���� �� => " + carry);
		//-------------------------------------------
		int ea50 = carry / 50;
		println("50��¥�� " + ea50 + "��");
		carry = carry % 50;
		println("���� �� => " + carry);
		//-------------------------------------------
		int ea10 = carry / 10;
		println("10��¥�� " + ea10 + "��");
		carry = carry % 10;
		println("���� �� => " + carry);
		//-------------------------------------------
		int ea5 = carry / 5;
		println("5��¥�� " + ea5 + "��");
		carry = carry % 5;
		println("���� �� => " + carry);
		//-------------------------------------------
		int ea1 = carry / 1;
		println("1��¥�� " + ea1 + "��");
		carry = carry % 1;
		println("���� �� => " + carry);
		//-------------------------------------------
	}
	
	public static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		println("���ǰ� �Է� >> ");
		int price = scan.nextInt();
		println("������ �Է� >> ");
		int money = scan.nextInt();
		while(!(money>=price && (money==50000 || money==10000 || money==5000 || money==1000 || money==500 || money==100 || money==50))) {
			println("�߸��� �Է��Դϴ�!");
			println("���� �� �ٽ� �Է� >>> ");
			money = scan.nextInt();
		}
		int carry = money - price;
		
		println("������ �� => " + money);
		println("�Ž��� �� => " + carry);
		//-------------------------------------------
		int num = 2;
		switch(money) {
		case 50000: case 5000: case 500: case 50: num=5;
		}
		for(;money>10;) {
			money /= num;
			println(money + "��¥�� " + (carry/money) + "��");
			carry = carry%money;
			num = num == 2 ? 5 : 2;
		}
		
	}

}