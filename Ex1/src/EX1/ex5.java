package EX1;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("���� 3�� �Է��Ͻÿ�>> ");        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        if((num1+num2==num3)|| (num2+num3 ==num1) || (num1+num3 ==num2))
            System.out.println("�ﰢ���� �ȵ˴ϴ�.");
        else
            System.out.println("�ﰢ���� �˴ϴ�.");
        sc.close();
	}

}
