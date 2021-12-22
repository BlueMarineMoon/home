package ch10;

public class SingleTest {//singleTest�� ��ü�� static���� ����.
	private static SingleTest s = new SingleTest();
	private int x;
	private int y;
	
	private SingleTest() {//�����ڸ� private���� ����, 4�� ��ó��
		x = 10;				//Ŭ���� ���ο����� �����,
		y = 20;				//Ŭ���� �ۿ����� �� �����.
	}
	
	public static SingleTest getSingleTest() {//4�� �ٿ��� ������
		return s;	//��ü�� ��ȯ, �� private ������� s�� getter.
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {//��������� ������ �Ķ���Ͱ� �� �־�ߵ�.
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}