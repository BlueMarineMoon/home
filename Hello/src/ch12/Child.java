package ch12;

public class Child extends Parent {
	private String hobby;
	
	@Override //������ �̳����̼����� �����Ϸ��� ��ӹ��� �޼��带 ���������� �˷���
	public void printInfo() {
		System.out.println("name : " + name);
		System.out.println("hobby : " + hobby);
	}
	
	public String gotHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}