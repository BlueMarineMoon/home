package EX1;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int middle=0;
        
        System.out.print("정수 3개 입력>> ");        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        if(num1 >num2 && num1 <num3)
            middle =num1;
        else if(num2>num1 && num2<num3)
            middle =num2;
        else
            middle = num3;
        
        System.out.println("중간 값은 " + middle);
 
        sc.close();
	}

}
