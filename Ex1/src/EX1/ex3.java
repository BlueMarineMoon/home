package EX1;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int a,b,c,d,e,f,g;
        
        System.out.print("�ݾ��� �Է��Ͻÿ�>> ");        
        int num = sc.nextInt();
        
        a = num/50000;
        num%=50000;
        b = num/10000;
        num%=10000;
        c = num/1000;
        num%=1000;
        d = num/100;
        num%=100;
        e = num/50;
        num%=50;
        f = num/10;
        num%=10;
        g=num/1;
        
        System.out.println("�������� "+a+"��");
        System.out.println("������ "+b+"��");
        System.out.println("õ���� "+c+"��");
        System.out.println("��� "+d+"��");
        System.out.println("���ʿ� "+e+"��");
        System.out.println("�ʿ� "+f+"��");
        System.out.println("�Ͽ� "+g+"��");
 
        sc.close();
	}
}
