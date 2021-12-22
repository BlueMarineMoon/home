package Ex1;

public class ss9 {

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                int r = (int)(Math.random()*10+1);
                arr[i][j]=r;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
	}

}
