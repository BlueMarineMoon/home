package Ex1;

import java.util.Scanner;



public class ss14 {
	public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
    String course [] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
    int score [] = {95, 88, 76, 62, 55};
    
    while(true) {    
        System.out.print("���� �̸�>>");
        String name = sc.next();
        
        if(name.equals("�׸�"))
            break;
        
        
        for(int i=0; i<course.length;i++) {
            if(course[i].equals(name)){
                int n = score[i];
                System.out.printf("%s�� ������ %d\n", course[i], n);
                break;
            }
            if(i==course.length-1)
                System.out.println("���� �����Դϴ�.");
        }
    }
	}

}
