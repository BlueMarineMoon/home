package ch12;

public class SuperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperParent sp = new SuperChild();//��ĳ�����Ͽ� ��ü�� ����
		sp.print();//print()�� ȣ���ϸ� �����ǵ� ����Ŭ������ print()ȣ��
	}//���� Ŭ������ SuperChild�� print()�� SuperCall�� ȣ����
	//���� Ŭ������ ��������� ����ϰ� �޼��带 ȣ��.
}
