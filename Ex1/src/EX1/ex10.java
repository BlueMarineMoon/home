package EX1;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("ù��° ���� �߽ɰ� ������ �Է�>> ");
        double num = sc.nextDouble();
        double num1 = sc.nextDouble();
        double r = sc.nextDouble();
        
        System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>> ");
        double i = sc.nextDouble();
        double j = sc.nextDouble();
        double r1 = sc.nextDouble();
      
        double call = Math.sqrt(((num-i)*(num-i)) + ((num1-j)*(num1-j)));
      
        if(call <= r+r1)
           System.out.print("�� ���� ���� ��ģ��.");
        else
           System.out.print("�� ���� ���� ��ġ�� �ʴ´�.");
        sc.close();
	}

}
