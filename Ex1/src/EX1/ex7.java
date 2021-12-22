package EX1;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("점 (x,y)의 좌표를 입력하시오>> ");        
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        
        if((num>=100 && num1>=100) && (num<=200 && num<=200))
            System.out.println("("+num+","+num1+")"+"는 사각형 안에 있습니다.");
        else
            System.out.println("("+num+","+num1+")"+"는 사각형 안에 없습니다.");
        sc.close();
	}

}
