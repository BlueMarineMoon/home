package EX1;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>> ");        
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        
        if((num>=100 && num1>=100) && (num<=200 && num<=200))
            System.out.println("("+num+","+num1+")"+"�� �簢�� �ȿ� �ֽ��ϴ�.");
        else
            System.out.println("("+num+","+num1+")"+"�� �簢�� �ȿ� �����ϴ�.");
        sc.close();
	}

}
