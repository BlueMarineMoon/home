package day14;

import java.util.Scanner;

public class LevelUpEx01 {

	public static void main01(String[] args) {
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		for (int i = 0; i < 5; i++) {
			// 공백 출력
			for (int j = 0; j < 4 - i + i * 2 + 1; j++) {
				System.out.print(j < 4 - i ? " " : "*");
			}
			System.out.println();
		}
	}

	public static void main09(String[] args) {
		// *********
		//  *******
		//   *****
		//    ***
		//     *
		for (int i = 6; i > 3 - 2; i--) {
			for (int j = 6; j > -i + 2 + 1; j--) {
				System.out.print(j + 1 > 1 + i ? " " : "*");
			}
			System.out.println();
		}
	}

	public static void main09_2(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9 - i; j++) {
				System.out.print(j < i ? " " : "*");
			}
			System.out.println();
		}
	}

	public static void main10(String[] args) {
		// 별 출력 프로그램
		// - 별 또는 공백이 반복 한번에 한개씩 출력
		//
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		//  *******
		//   *****
		//    ***
		//     *
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4 - i + i * 2 + 1; j++) {
				System.out.print(j - 1 < 5 - i - 2 ? " " : "*");
			}
			System.out.println();
		}

		for (int n = 6; n > 1; n--) {
			for (int z = 6; z > -n + 2 + 1; z--) {
				System.out.print(z + 1 > 1 + n ? " " : "*");
			}
			System.out.println();
		}

	}

	public static void main10_1(String[] args) {
		// 별 출력 프로그램
		// - 별 또는 공백이 반복 한번에 한개씩 출력
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		//  *******
		//   *****
		//    ***
		//     *
		int end = 4;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9 - end; j++) {
				System.out.print(j < end ? " " : "*");
			}
			System.out.println();

			end = i < 4 ? end - 1 : end + 1;
		}
	}

	public static void main10_3(String[] args) {
		// 별 출력 프로그램
		// - 별 또는 공백이 반복 한번에 한개씩 출력
		// 세로로 반으로 나눠서 만든 것.
		// *********
		// **** ****
		// ***   ***
		// **     **
		// *       *
		// **     **
		// ***   ***
		// **** ****
		// *********
		int end = 4;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(j < end || j >= 9 - end ? " " : "*");
			}
			System.out.println();

			end = i < 4 ? end - 1 : end + 1;
		}
	}

	public static void main10_2(String[] args) {
		// 별 출력 프로그램
		// - 별 또는 공백이 반복 한번에 한개씩 출력
		//
		// *********
		//  *******
		//   *****
		//    ***
		//     *
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		for (int n = 6; n > 1; n--) {
			for (int z = 6; z > -n + 2 + 1; z--) {
				System.out.print(z + 1 > 1 + n ? " " : "*");
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i + i * 2 + 1; j++) {
				System.out.print(j - 1 < 5 - i - 2 ? " " : "*");
			}
			System.out.println();
		}

	}

	public static void main10_4(String[] args) {
		// 별 출력 프로그램
		// - 별 또는 공백이 반복 한번에 한개씩 출력
		// 위아래로 for문을 합친 것.
		// *********
		// **** ****
		// ***   ***
		// **     **
		// *       *
		// **     **
		// ***   ***
		// **** ****
		// *********
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(j < 5 - i || j > i + 3 ? "*" : " ");
			}
			System.out.println();
		}
		for (int n = 0; n < 5; n++) {
			for (int m = 0; m < 9; m++) {
				System.out.print(m <= n || m >= 8 - n ? "*" : " ");
			}
			System.out.println();
		}

	}
	
	public static void main12(String[] args) {
		int end = 5;
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				//System.out.print(j<end || j>8-end?"*":" ");
				System.out.print(j>=end && j<9-end?" ":"*");
			}
			System.out.println();
			end = i<4 ? end-1:end+1;
		}
	}
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int size;
		int size1;
		int yorno1;
		int yorno2;
		String word = null;
		

		System.out.println("별크기(5~15)의 홀수 값을 입력해주세요!\n-1을 입력하면 프로그램을 종료 할 수 있습니다.");
		System.out.print("별크기 입력 >>> ");
		size = scan.nextInt();
		while(true) {
		while(true) {
			if(size%2==1 || (size>=5 && size<=15))
				break;
			else {
				System.out.printf("-1을 입력했거나 짝수 값을 입력했습니다.\n다시 별크기(5~15)의 홀수 값을 입력해주세요!\n아니라면 -1을 눌러주세요!\n");
				System.out.print("별크기 입력 >>> ");
				yorno1 = scan.nextInt();
				
							
			}
			if(yorno1%2==1 && (yorno1>=5 && yorno1<=15)) {
				size = yorno1;
			} else {
				System.out.print("-1을 입력했거나 짝수 값을 입력했습니다.\n");
				System.out.print("프로그램을 종료합니다!\n");
				break;
			}

		}
		
		if(size%2==1 && (size>=5 && size<=15) || word == "N") {
			
		} else {
			break;
		}	
		
		for (int i=0; i<size; i++) {
			for (int j = 0; j<size; j++) {
				System.out.print((i*j==0) || (i==j) || (i==size-1) || (j==size-1) ? "*":" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int end = size/2+1;
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(j>=end && j<size-end?" ":"*");
			}
			System.out.println();
			end = i<size/2 ? end-1 : end+1;
			
		}
		
		
		
			
			System.out.println("별크기(5~15)의 홀수 값을 입력해주세요!\n-1을 입력하면 프로그램을 종료 할 수 있습니다.");
			System.out.print("크기입력 >>> ");
			size1 = scan.nextInt();
			if(size1%2==1 && (size1>=5 && size1<=15)) {
				size = size1;
			} else {
				if(size1%2==1 && (size1>=5 && size1<=15))
					size = size1;
				else {
					System.out.printf("-1을 입력했거나 짝수 값을 입력했습니다.\n다시 별크기(5~15)의 홀수 값을 입력해주세요!\n아니라면 -1을 눌러주세요!\n");
					System.out.print("별크기 입력 >>> ");
					yorno2 = scan.nextInt();
					
					if(yorno2%2==1 && (yorno2>=5 && yorno2<=15)) {
						size = yorno2;
					} else {
						System.out.print("-1을 입력했거나 짝수 값을 입력했습니다.\n");
						System.out.print("프로그램을 종료합니다!\n");
						break;
					}			
				}
				
			
			}
			
		}
		
		
		
		}
		
	}

		
	//위에 식에 사용하는 것.
	//while (true) {
	//	try {
	//		System.out.print("크기입력(홀수만) >>> ");
	//		size = scan.nextInt();
	//	} catch (Exception e) {
	//		System.out.println("숫자만 입력 하세요!");
	//		scan.next();
	//		continue;
	//	}
	//}
	//	
	//while(size%2==0 || (size <=5 || size >=15)) {
	//	try {
	//		if(size <=5 || size >=15){
	//			System.out.println("5이상 15이하 값만 입력하세요!");
	//			System.out.print("크기입력(홀수만) >>>");
	//			size = scan.nextInt();
	//			continue;
	//		}
	//		System.out.println("홀수만 입력 하세요!");
	//		System.out.print("크기입력(홀수만) >>>");
	//		size = scan.nextInt();
	//	} catch (Exception e) {
	//		System.out.println("숫자만 입력 하세요!");
	//		scan.next();
	//		size = 0;
	//		continue;
	//	}
	//}
//	
	