package Ex1;

import java.util.*;

public class ss16 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = {"����", "����", "��"};
        
        System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
 
        while (true){
            System.out.print("���� ���� ��!>>");
            String text = sc.nextLine();
            
            int n = (int)(Math.random()*3);
            
            if(text.equals("�׸�")) {
                System.out.println("������ �����մϴ�...");
                break;
                }
            else if(str[n].equals("����"))
                if(text.equals("����"))
                    System.out.printf("����� = %s , ��ǻ�� = %s, �����ϴ�.\n", text, str[n]);
                else if(text.equals("����"))
                    System.out.printf("����� = %s , ��ǻ�� = %s, �̰���ϴ�.\n", text, str[n]);
                else
                    System.out.printf("����� = %s , ��ǻ�� = %s, �����ϴ�.\n", text, str[n]);
            else if(str[n].equals("����"))
                if(text.equals("����"))
                    System.out.printf("����� = %s , ��ǻ�� = %s, �����ϴ�.\n", text, str[n]);
                else if(text.equals("��"))
                    System.out.printf("����� = %s , ��ǻ�� = %s, �̰���ϴ�.\n", text, str[n]);
                else
                    System.out.printf("����� = %s , ��ǻ�� = %s, �����ϴ�.\n", text, str[n]);
            else
                if(text.equals("��"))
                    System.out.printf("����� = %s , ��ǻ�� = %s, �����ϴ�.\n", text, str[n]);
                else if(text.equals("����"))
                    System.out.printf("����� = %s , ��ǻ�� = %s, �̰���ϴ�.\n", text, str[n]);
                else
                    System.out.printf("����� = %s , ��ǻ�� = %s, �����ϴ�.\n", text, str[n]);
        }        
        while(true) {
            try {
                System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
                int n = sc.nextInt();
                int m = sc.nextInt();
                System.out.print(n + "x" + m + "=" + n*m );
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
            }
        }
        sc.close();
    }
}


