package EX1;

import java.util.Scanner;

public class ex6 {
	public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("1~99 ������ ������ �Է��Ͻÿ�>> ");        
        int num = sc.nextInt();
        
        if(num<1 || num>99)
            System.out.println("������ ���� ���Դϴ�.");
        
        if((num/10==3 || num/10==6 || num/10==9) && (num%10==3 || num%10==6 ||num%10==9))
            System.out.println("�ڼ�¦¦");            
        else if((num/10==3 || num/10==6 || num/10==9) || (num%10==3 || num%10==6 ||num%10==9))
            System.out.println("�ڼ�¦");
 
        sc.close();
	}
}