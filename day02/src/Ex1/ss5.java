package Ex1;

import java.util.Scanner;

public class ss5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
        int arr[] = new int[10];
        
        for(int i=0;i<10;i++)
            arr[i] = sc.nextInt();
        
        System.out.print("3�� ����� ");
        for(int i=0;i<10;i++)
            if(arr[i]%3==0)
                System.out.print(arr[i] + " ");
	}

}
