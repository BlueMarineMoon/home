package EX1;

import java.util.Scanner;

public class ex8 {


		public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
	        if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty1))
	            return true;
	         else
	            return false;
	    }
	    
	    public static void main(String[]args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("점 (x,y)의 좌표를 입력하세요>> ");
	        int x =sc.nextInt();
	        int y =sc.nextInt();
	        
	        if(inRect(x,y,100,100,200,200) == true)
	            System.out.println("충돌");
	        else
	            System.out.println("비충돌");
	        sc.close();
	}

}
