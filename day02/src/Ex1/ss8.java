package Ex1;

import java.util.Scanner;

public class ss8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("정수 몇개?");
        
        int num = sc.nextInt();
        int arr[] = new int[num];
        
        for(int i=0;i<arr.length;i++) {
            int r = (int)(Math.random()*100+1);
            int overlap = 0;
            
            for(int j=0;j<i;j++) {
                if(arr[i]==r){
                    overlap +=1;
                    break;
                }
            if (overlap !=0)
                continue;
            }
            arr[i] = r;
        }
        for(int i =0;i<arr.length;i++) {
            if(i%10==0 && i!=0)
                System.out.println();
            System.out.print(arr[i] + " ");
        }
	}

}
