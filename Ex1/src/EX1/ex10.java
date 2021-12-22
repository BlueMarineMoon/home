package EX1;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("첫번째 원의 중심과 반지름 입력>> ");
        double num = sc.nextDouble();
        double num1 = sc.nextDouble();
        double r = sc.nextDouble();
        
        System.out.print("두번째 원의 중심과 반지름 입력>> ");
        double i = sc.nextDouble();
        double j = sc.nextDouble();
        double r1 = sc.nextDouble();
      
        double call = Math.sqrt(((num-i)*(num-i)) + ((num1-j)*(num1-j)));
      
        if(call <= r+r1)
           System.out.print("두 원은 서로 겹친다.");
        else
           System.out.print("두 원은 서로 겹치지 않는다.");
        sc.close();
	}

}
