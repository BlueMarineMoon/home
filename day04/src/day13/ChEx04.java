package day13;

import static java.lang.System.out;

import java.util.Scanner;

public class ChEx04 {

	public static void main00(String[] args) {
		// 1. ���� ���ڸ� �б� �Ⱦ��Ѵ�.
		// 2. �׽�Ʈ�� ���� �ʴ´�.
		// 3. ������ ���ϰ� ���������� �ڵ��Ѵ�.
		// 4. ��Ÿ�� ������.
		// 5. �������� �������� �Ⱦ��Ѵ�.
		
		
		//2�� ~ 9�ܱ��� ����ϴ� ���α׷� ����.
		
		for(int dan = 2; dan<=9; dan=dan+1) {
			out.printf("***%d��***\n", dan);
		for(int cnt = 1; cnt<=9; cnt=cnt+1) {
			out.printf("%d * %d = %d\n", dan, cnt, dan*cnt);
		}
		}
	}
	
	
	public static void main01(String[] args) {
				
		for(int dan = 2; dan<=9; dan=dan+1) {
			out.printf("\n***%d��***\n", dan);
		for(int cnt = 1; cnt<=9; cnt=cnt+1) {
			out.printf("%d*%d=%d\n", dan, cnt, dan*cnt);
		}
		}
	}
	
	public static void main02(String[] args) {
		
		for(int title = 2; title<=9; title++) {
			out.printf("***%d��***\t", title);
		}
		for(int cnt = 1; cnt<=9; cnt=cnt+1) {
			out.println();
			for(int dan = 2; dan<=9; dan=dan+1) {
				out.printf("%d*%d=%d\t\t", dan, cnt, dan*cnt);	
			}
			out.println();
		}
	}
	
	static Scanner scan = new Scanner(System.in);

	public static void main03(String[] args) {
		int startDan = 2;
		int endDan = 9;
		
		out.printf("���۴� �Է�>> ");
		startDan = scan.nextInt();
		out.printf("����� �Է�>> ");
		endDan = scan.nextInt();
		
		for(int dan=startDan; dan<=9; dan++) {
			out.printf("***%d***\n", dan);
			for(int cnt = 1; cnt <= 9; cnt += 1) {
				out.printf("%d*%d=%d\n", dan, cnt, dan * cnt);	
		
			}
		
		}
	}
	

	static int getDan(String message) {
		out.printf(message);
		int dan = scan.nextInt();
		return dan;
	}
	
	public static void main04(String[] args) {
		int startDan = 2;
		int endDan = 9;
		int temp = 0;
		
		// ���۴��� ����� ���� ū ���ڿ��� ���� ��� �ǵ��� �ϼ��Ͻÿ�.
		startDan = getDan("���۴� �Է�>> ");
		endDan = getDan("����� �Է�>> ");
		
		if(startDan>endDan) {
			temp = startDan;
			startDan = endDan;
			endDan = temp;
			out.print("ġȯ��");
		}
			for(int dan=startDan; dan<=9; dan++) {
				out.printf("***%d***\n", dan);
				for(int cnt = 1; cnt <= 9; cnt += 1) {
						out.printf("%d*%d=%d\n", dan, cnt, dan * cnt);
				}
			}
	}
	
	
	
	public static void main(String[] arge) {
		// ����1 : 3�� 3���� ������ ���
		// ����2 : ���۴�, ����� ��ɰ� ��ü�ϼ���.
		int startDan = 2;
		int endDan = 9;
		int temp = 0;
		
		startDan = getDan("���۴� �Է�>> ");
		endDan = getDan("����� �Է�>> ");
		
		if(startDan>endDan) {
			temp = startDan;
			startDan = endDan;
			endDan = temp;
		}
		
		for(int dan=startDan; dan<=endDan; dan += 3) {
			for(int i = 0; i<3; i++) {
				if(!(dan+i > endDan)) {
					out.printf("***%d��***\t", dan+i);
				}
			}
			out.println();
		
			for(int cnt=1; cnt<10; cnt++) {
				for(int i=0; i<3; i++) {
					if(!(dan+i > endDan)) {
						out.printf("%d*%d=%d\t\t", (dan+i), cnt, (dan+i)*cnt);
				
			}
			}
				out.println();
			}
		}
	}
}




