package ch4;

public class IfThen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20;
		boolean flag=true;
		
		if(a==10) {
			System.out.println("a가 10이면 참"); //이문장은 a값과 b값이 같아서 출력
		}
		
		if(a==b) {
			System.out.println("a가 b가 같으면 참"); //이문장은 a값과 b값이 같지 않기 때문에 출력을 안함
		}
		
		if(flag) {
			System.out.println("flag 값이 true이면 참"); //이문장은 flag값에 true값을 넣었기 떄문에 출력
		}
		
		System.out.println("이 문장은 if문과 상관없이 실행"); //이문장은 if문과 상관없이 모니터에 출력하게 만든 문장
	}

}
