package ch10;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member();
		
		m.setName("�躴��"); // m.name="�躴��";
		m.setTel("5555"); // m.tel="5555";
		m.setAddress("�����"); // m.address="�����";
//8~10�� ���� �� ����� setter�� ȣ���ؼ� private ��������� �� �Ҵ�.
		
		String name = m.getName();
		String tel = m.getTel();
		String address = m.getAddress();
//13~15�� ���� ����� getter�� ȣ���ؼ� private ��������� ���� �д´�.
		
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}

}
