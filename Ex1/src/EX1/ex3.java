package EX1;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int a,b,c,d,e,f,g;
        
        System.out.print("금액을 입력하시요>> ");        
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
        
        System.out.println("오만원권 "+a+"매");
        System.out.println("만원권 "+b+"매");
        System.out.println("천원권 "+c+"매");
        System.out.println("백원 "+d+"매");
        System.out.println("오십원 "+e+"매");
        System.out.println("십원 "+f+"매");
        System.out.println("일원 "+g+"매");
 
        sc.close();
	}
}
