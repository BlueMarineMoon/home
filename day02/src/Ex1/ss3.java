package Ex1;

import java.util.Scanner;

public class ss3 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("������ �Է��Ͻÿ�>>");
	        
	        int num = sc.nextInt();
	        
	        for(int i=1;i<=num;i++) {
	            for(int j=num;j>=i;j--) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}

}
