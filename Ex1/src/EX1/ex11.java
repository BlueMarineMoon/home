package EX1;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("달을 입력하세요(1~12)>> ");        
        int num = sc.nextInt();
        
        if(num>2 && num <=5)
            System.out.println("봄");
        else if(num>5 && num <=8)
            System.out.println("여름");
        else if(num>8 && num <=11)
            System.out.println("가을");
        else if(num>12 || num <1)
            System.out.println("잘 못 입력된 값입니다.");
        else
            System.out.println("겨울");
 
        sc.close();
	}

}
