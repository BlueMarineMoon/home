package EX1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        float dollar;
	        System.out.print("��ȭ�� �Է��ϼ���(���� ��)>> ");
	        int won = sc.nextInt();
	        dollar = (float)won/1100;
	        
	        System.out.println(won +"���� $" + dollar + "�Դϴ�." );
	        sc.close();
	    }
	}