package EX1;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("���� �Է��ϼ���(1~12)>> ");        
        int num = sc.nextInt();
        
        if(num>2 && num <=5)
            System.out.println("��");
        else if(num>5 && num <=8)
            System.out.println("����");
        else if(num>8 && num <=11)
            System.out.println("����");
        else if(num>12 || num <1)
            System.out.println("�� �� �Էµ� ���Դϴ�.");
        else
            System.out.println("�ܿ�");
 
        sc.close();
	}

}
