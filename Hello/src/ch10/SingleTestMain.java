package ch10;

public class SingleTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성자가 private이기 때문에 클래스 밖에서 객체생성이 불가능 하다.
		//SingleTest t = new SingleTest();생성자가 private객체생성불가
		SingleTest t = SingleTest.getSingleTest();
//SingleTest.getSingleTest()를 호출해서 SingleTest 클래스 내에서
//생성한 
		System.out.println("x = " + t.getX());
		System.out.println("y = " + t.getY());
	}

}
