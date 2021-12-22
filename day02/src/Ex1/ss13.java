package Ex1;

public class ss13 {

	public static void main(String[] args) {
		int count=1;
        
        for(int i=1;i<100;i++) {
            
            if(count%10==3 && count/10==3 || count%10==6 && count/10==6 ||
                    count%10==9 && count/10==9){
                System.out.printf("%d ¹Ú¼ö Â¦Â¦\n", i);
            }else if( count%10==3 || count%10==6 || count%10==9 ){
                System.out.printf("%d ¹Ú¼ö Â¦\n",i);
            }
            count++;
        }
	}

}
