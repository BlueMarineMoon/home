package EX1;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("원의 중심과 반지름 입력>> ");
        double num =sc.nextDouble();
        double num1 =sc.nextDouble();
        double r = sc.nextDouble();
        
        System.out.print("점 입력>> ");
        double i = sc.nextDouble();
        double j = sc.nextDouble();
        
        double call = Math.sqrt(((i-num)*(i-num)) + ((j-num1)*(j-num1)));
        
        if (call<=r)
            System.out.println("점 (" + i + "," + j + ")는 원 안에 있다.");
        else
            System.out.println("점 (" + i + "," + j + ")는 원 안에 없다.");
        sc.close();
	}

}
