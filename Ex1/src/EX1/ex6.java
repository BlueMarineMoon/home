package EX1;

import java.util.Scanner;

public class ex6 {
	public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("1~99 사이의 정수를 입력하시오>> ");        
        int num = sc.nextInt();
        
        if(num<1 || num>99)
            System.out.println("범위에 없는 값입니다.");
        
        if((num/10==3 || num/10==6 || num/10==9) && (num%10==3 || num%10==6 ||num%10==9))
            System.out.println("박수짝짝");            
        else if((num/10==3 || num/10==6 || num/10==9) || (num%10==3 || num%10==6 ||num%10==9))
            System.out.println("박수짝");
 
        sc.close();
	}
}
