package ch4;
import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu;
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �Է��϶�");
		jumsu=sc.nextInt();
		if(jumsu>=90) {
			System.out.println("A");	//90�̻�
		}else if(jumsu>=80) {
			System.out.println("B");	//80�̻� 90�̸�
		}else if(jumsu>=70) {
			System.out.println("C");	//70�̻� 80�̸�
		}else if(jumsu>=60) {
			System.out.println("D");	//1���̻� 70�̸�
		}else if(jumsu>=1) {			
			System.out.println("F");
		}else {							//0��
			System.out.println("FF(0��)");
		}
	}

}
