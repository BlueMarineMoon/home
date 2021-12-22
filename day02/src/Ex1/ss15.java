package Ex1;

import java.util.Scanner;

public class ss15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("곱하고자 하는 두 수 입력>>");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print(n + "x" + m + "=" + n*m );
        
        sc.close();
	}

}
