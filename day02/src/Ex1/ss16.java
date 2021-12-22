package Ex1;

import java.util.*;

public class ss16 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = {"가위", "바위", "보"};
        
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
 
        while (true){
            System.out.print("가위 바위 보!>>");
            String text = sc.nextLine();
            
            int n = (int)(Math.random()*3);
            
            if(text.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
                }
            else if(str[n].equals("가위"))
                if(text.equals("가위"))
                    System.out.printf("사용자 = %s , 컴퓨터 = %s, 비겼습니다.\n", text, str[n]);
                else if(text.equals("바위"))
                    System.out.printf("사용자 = %s , 컴퓨터 = %s, 이겼습니다.\n", text, str[n]);
                else
                    System.out.printf("사용자 = %s , 컴퓨터 = %s, 졌습니다.\n", text, str[n]);
            else if(str[n].equals("바위"))
                if(text.equals("바위"))
                    System.out.printf("사용자 = %s , 컴퓨터 = %s, 비겼습니다.\n", text, str[n]);
                else if(text.equals("보"))
                    System.out.printf("사용자 = %s , 컴퓨터 = %s, 이겼습니다.\n", text, str[n]);
                else
                    System.out.printf("사용자 = %s , 컴퓨터 = %s, 졌습니다.\n", text, str[n]);
            else
                if(text.equals("보"))
                    System.out.printf("사용자 = %s , 컴퓨터 = %s, 비겼습니다.\n", text, str[n]);
                else if(text.equals("가위"))
                    System.out.printf("사용자 = %s , 컴퓨터 = %s, 이겼습니다.\n", text, str[n]);
                else
                    System.out.printf("사용자 = %s , 컴퓨터 = %s, 졌습니다.\n", text, str[n]);
        }        
        while(true) {
            try {
                System.out.print("곱하고자 하는 두 수 입력>>");
                int n = sc.nextInt();
                int m = sc.nextInt();
                System.out.print(n + "x" + m + "=" + n*m );
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("실수는 입력하면 안됩니다.");
            }
        }
        sc.close();
    }
}


