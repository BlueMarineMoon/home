package ch10;

public class SingleTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����ڰ� private�̱� ������ Ŭ���� �ۿ��� ��ü������ �Ұ��� �ϴ�.
		//SingleTest t = new SingleTest();�����ڰ� private��ü�����Ұ�
		SingleTest t = SingleTest.getSingleTest();
//SingleTest.getSingleTest()�� ȣ���ؼ� SingleTest Ŭ���� ������
//������ 
		System.out.println("x = " + t.getX());
		System.out.println("y = " + t.getY());
	}

}
