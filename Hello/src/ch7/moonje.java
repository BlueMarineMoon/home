package ch7;

public class moonje { // ���� ���԰� 2g, 3g, 5g �̰� 10���� �����Ѵ�. �̰����� 81g�� ����� �ڵ��� �Ͻÿ�.(�ݺ��� 3�� ���)

	public static void main(String[] args) {
		for(int five=0;five<11;five++) { 		// ��ü�� ���� 11�̸��� �ɶ����� �ݺ�
			for(int three=0;three<11;three++) {	// ��ü�� ���� 11�̸��� �ɶ����� �ݺ�
				for(int two=0;two<11;two++) {	// ��ü�� ���� 11�̸��� �ɶ����� �ݺ�
					if(5*five+3*three+2*two==81) {	
					// ���� if���� ������ ���� ���Կ� ��ü�� ���� �ٲ���� ���ϰ� �� ���� ��ģ���� 81�� ���ƾ� �ϴ� ���ǽ�
					//String s="5g "+five+"�� 3g"+three+"�� 2g "+two+"��";
					//System.out.println(s);
					String str=String.format("5g: %d��, 3g: %d��, 2g: %d��%n",five,three,two);
					//���ʿ� �����ִ� five,three,two�� �տ� ���� %d��, %d��n�� �ڵ����� ��ġ�� ���缭 ������� ���� ��
					System.out.printf(str);
					}
			}
		}
		}
	}
}

