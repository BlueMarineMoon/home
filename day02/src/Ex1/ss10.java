package Ex1;

public class ss10 {
	public static void main(String[] args) {
        int arr[][] = new int[4][4];
        int rN=0;
        
        while(rN<10) {
            int x = (int)(Math.random()*4);
            int y = (int)(Math.random()*4);
            
            if(arr[x][y]==0) {
                arr[x][y] = (int)(Math.random()*10+1);
                rN +=1;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr.length;j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
