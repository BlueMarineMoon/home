package ch4;
import java.util.Scanner;
public class moonje3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������: ");
		int n = stdIn.nextInt();
		
		if (n > 0)
			System.out.println("���� ����Դϴ�.");
		else if (n < 0)
			System.out.println("���� �����Դϴ�.");
		else
			System.out.println("���� 0�Դϴ�.");
	}

}
