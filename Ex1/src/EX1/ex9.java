package EX1;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("���� �߽ɰ� ������ �Է�>> ");
        double num =sc.nextDouble();
        double num1 =sc.nextDouble();
        double r = sc.nextDouble();
        
        System.out.print("�� �Է�>> ");
        double i = sc.nextDouble();
        double j = sc.nextDouble();
        
        double call = Math.sqrt(((i-num)*(i-num)) + ((j-num1)*(j-num1)));
        
        if (call<=r)
            System.out.println("�� (" + i + "," + j + ")�� �� �ȿ� �ִ�.");
        else
            System.out.println("�� (" + i + "," + j + ")�� �� �ȿ� ����.");
        sc.close();
	}

}
