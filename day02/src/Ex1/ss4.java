package Ex1;

import java.util.Scanner;

public class ss4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
        
        String s = sc.next();
        char c = s.charAt(0);
        
        for(int i=0;i<=c-'a';i++) {
            for(char j='a';j<=c-i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
	}

}
