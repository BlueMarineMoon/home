package day12;

public class Day12Ex03 {

	public static void main04(String[] args) {
		final int MAX = 21;
		final int MIN = 1;
		// �Ǻ���ġ ���� ����
		// 1+ 1 - 2 + 3 - 5 + 8 - 13 + 21 = 14
		int prev = 0; // ������
		int curr = 1; // ������
		int next = 0;
		int sum = 0;
		
		int i=1;
		while(curr<=MAX) {
			System.out.print(curr);
			if(i%2==1) {
				sum = i ==1?curr:sum-curr;
				System.out.print("+");
			} else {
				sum += curr;
				System.out.print(curr==MAX?"=":"-");
			}
			
			next = prev + curr;
			prev = curr;
			curr = next;
			
			i = i + 1;
		}
		System.out.println(sum);

	}
	
	
	
	public static void main(String[] args) {
		final int MAX = 21;
		final int MIN = 1;
		// �Ǻ���ġ ���� ����
		// 1+ 1 - 2 + 3 - 5 + 8 - 13 + 21 = 14
		int prev = 0; // ������
		int curr = 1; // ������
		int next = 0;
		int sum = 0;
		
		// ���� ��
		// ���� �������� ������ ���Ѵ�.
		
		
		// flag�˰�����
		boolean flag = true;
		while(curr<=21) {
			System.out.print(curr);
			if(flag) {
				sum = curr==1 ? curr:sum-curr;
				System.out.print("+");
				flag = false;
			} else {
				sum += curr;
				System.out.print(curr==MAX?"=":"-");
				flag = true;
			}
			
			next = prev + curr;
			prev = curr;
			curr = next;
			
		}
		
		System.out.println(sum);
		
		
		
		
	}

}