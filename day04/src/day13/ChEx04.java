package day13;

import static java.lang.System.out;

import java.util.Scanner;

public class ChEx04 {

	public static void main00(String[] args) {
		// 1. 빨간 글자를 읽기 싫어한다.
		// 2. 테스트를 하지 않는다.
		// 3. 생각을 안하고 습관적으로 코딩한다.
		// 4. 영타가 느리다.
		// 5. 선생님을 이유없이 싫어한다.
		
		
		//2단 ~ 9단까지 출력하는 프로그램 구현.
		
		for(int dan = 2; dan<=9; dan=dan+1) {
			out.printf("***%d단***\n", dan);
		for(int cnt = 1; cnt<=9; cnt=cnt+1) {
			out.printf("%d * %d = %d\n", dan, cnt, dan*cnt);
		}
		}
	}
	
	
	public static void main01(String[] args) {
				
		for(int dan = 2; dan<=9; dan=dan+1) {
			out.printf("\n***%d단***\n", dan);
		for(int cnt = 1; cnt<=9; cnt=cnt+1) {
			out.printf("%d*%d=%d\n", dan, cnt, dan*cnt);
		}
		}
	}
	
	public static void main02(String[] args) {
		
		for(int title = 2; title<=9; title++) {
			out.printf("***%d단***\t", title);
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
		
		out.printf("시작단 입력>> ");
		startDan = scan.nextInt();
		out.printf("종료단 입력>> ");
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
		
		// 시작단이 종료단 보다 큰 숫자여도 정상 출력 되도록 완성하시오.
		startDan = getDan("시작단 입력>> ");
		endDan = getDan("종료단 입력>> ");
		
		if(startDan>endDan) {
			temp = startDan;
			startDan = endDan;
			endDan = temp;
			out.print("치환끝");
		}
			for(int dan=startDan; dan<=9; dan++) {
				out.printf("***%d***\n", dan);
				for(int cnt = 1; cnt <= 9; cnt += 1) {
						out.printf("%d*%d=%d\n", dan, cnt, dan * cnt);
				}
			}
	}
	
	
	
	public static void main(String[] arge) {
		// 과제1 : 3행 3열로 구구단 출력
		// 과제2 : 시작단, 종료단 기능과 합체하세요.
		int startDan = 2;
		int endDan = 9;
		int temp = 0;
		
		startDan = getDan("시작단 입력>> ");
		endDan = getDan("종료단 입력>> ");
		
		if(startDan>endDan) {
			temp = startDan;
			startDan = endDan;
			endDan = temp;
		}
		
		for(int dan=startDan; dan<=endDan; dan += 3) {
			for(int i = 0; i<3; i++) {
				if(!(dan+i > endDan)) {
					out.printf("***%d단***\t", dan+i);
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





