package EX1;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      
	      String sign;
	      System.out.print("����>>");
	      double num = sc.nextDouble();
	      sign = sc.next();
	      double num1 = sc.nextDouble();
	      
	      if(sign.equals("+"))
	         System.out.print(num+sign+num1+"�� ��� ����� "+(num + num1));
	      else if(sign.equals("-"))
	          System.out.print(num+sign+num1+"�� ��� ����� "+(num - num1));
	      else if(sign.equals("*"))
	         System.out.print(num+sign+num1+"�� ��� ����� "+(num*num1));
	      else if(sign.equals("/"))
	      {  
	         if(num1==0)
	            System.out.print("0���� ���� �� �����ϴ�.");
	         else
	            System.out.print(num+sign+num1+"�� ��� ����� "+(num/num1));
	      }
	      sc.close();
	   }
	}
