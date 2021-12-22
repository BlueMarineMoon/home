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
		
		System.out.println("거스름 돈 => " + carry);
		//-------------------------------------------
		int ea5000 = carry / 5000;
		println("5천원짜리 " + ea5000 + "개");
		carry = carry % 5000;
		println("남은 돈 => " + carry);
		//-------------------------------------------
		int ea1000 = carry / 1000;
		println("1천원짜리 " + ea1000 + "개");
		carry = carry % 1000;
		println("남은 돈 => " + carry);
		//-------------------------------------------
		int ea500 = carry / 500;
		println("500원짜리 " + ea500 + "개");
		carry = carry % 500;
		println("남은 돈 => " + carry);
		//-------------------------------------------
		int ea100 = carry / 100;
		println("100원짜리 " + ea100 + "개");
		carry = carry % 100;
		println("남은 돈 => " + carry);
		//-------------------------------------------
		int ea50 = carry / 50;
		println("50원짜리 " + ea50 + "개");
		carry = carry % 50;
		println("남은 돈 => " + carry);
		//-------------------------------------------
		int ea10 = carry / 10;
		println("10원짜리 " + ea10 + "개");
		carry = carry % 10;
		println("남은 돈 => " + carry);
		//-------------------------------------------
		int ea5 = carry / 5;
		println("5원짜리 " + ea5 + "개");
		carry = carry % 5;
		println("남은 돈 => " + carry);
		//-------------------------------------------
		int ea1 = carry / 1;
		println("1원짜리 " + ea1 + "개");
		carry = carry % 1;
		println("남은 돈 => " + carry);
		//-------------------------------------------
	}
	
	public static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		println("물건값 입력 >> ");
		int price = scan.nextInt();
		println("받은돈 입력 >> ");
		int money = scan.nextInt();
		while(!(money>=price && (money==50000 || money==10000 || money==5000 || money==1000 || money==500 || money==100 || money==50))) {
			println("잘못된 입력입니다!");
			println("받은 돈 다시 입력 >>> ");
			money = scan.nextInt();
		}
		int carry = money - price;
		
		println("지불한 돈 => " + money);
		println("거스름 돈 => " + carry);
		//-------------------------------------------
		int num = 2;
		switch(money) {
		case 50000: case 5000: case 500: case 50: num=5;
		}
		for(;money>10;) {
			money /= num;
			println(money + "원짜리 " + (carry/money) + "개");
			carry = carry%money;
			num = num == 2 ? 5 : 2;
		}
		
	}

}
