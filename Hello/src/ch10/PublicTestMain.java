package ch10;

public class PublicTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicTest t = new PublicTest(10, 10);
		t.x = 20; // public ����� Ŭ���� �ۿ��� ���� ����
		// t.y=20; y�� private ����̱� ������ Ŭ���� �ۿ����� ���� �Ұ�
		// t.setValue() private ���. ���� �Ұ�
		t.print(); // public ���. ���� ����
	}

}