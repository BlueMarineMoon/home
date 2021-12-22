package Ex1;

public class ss7 {

	public static void main(String[] args) {
        int sum=0;
        System.out.print("·£´ýÇÑ Á¤¼öµé : ");
        
        for(int j=0;j<10;j++) {
            int i = (int)(Math.random()*10+1);
            System.out.print(i+" ");
            sum += i;
        }
        System.out.println();
        System.out.print("Æò±ÕÀº :" + sum/10.);

	}

}
