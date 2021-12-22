package org.comstudy21.ch03;

import java.util.Arrays;

public class Ch03Ex22 {

	public static void main00(String[] args) {
		String[] names = {"��¡��","�öѱ�","�뱸","����","�ź���"};
		int[] price = {9000, 3000, 5000, 6000, 20000};
		
		for(int i=0; i<names.length; i++){
			System.out.printf("%s�� ������ %d���Դϴ�.\n", names[i], price[i]);
		}
	}
	
	public static void reverse(int[] arr) {
		//int[] arr = {10, 20, 30, 40, 50};
		
		// Arrays�� �̿��ؼ� ������� ����ϱ�
		//System.out.println(Arrays.toString(arr));
		
		// �ݺ����� �̿��ؼ� arr�迭�� ��Ұ��� ��ġ�� reverse �Ѵ�.
		// [50, 40, 30, 20, 10]
		
		for(int i=0, end=arr.length-1; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[end-i];
			arr[end-i] = temp;	
		}
		//System.out.println(Arrays.toString(arr));
		
	}
	
	public static void test_rever(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.println(Arrays.toString(arr));
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void soft(String[] args) {
		int[] arr = {7,3,2,8,1,6,9,4,5};
		// �������� �����ؼ� ����ϼ���. (��������)
		// ��������, ���������� �����ؼ� ���� �� ������.
		// [1,2,3,4,5,6,7,8,9]
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void lotto(String[] args) {
		final int SIZE = 6;
		int[] lotto = new int[SIZE];
		
		for(int i=0; i<SIZE; i++) {
			int num = (int)(1+Math.random()*45);
			// ���� ������ num�� ���� lotto �迭�� ����� ��Ҹ� ���Ѵ�.
			// ---> num�� ���� ���� �̹� �ִٸ� �ٽ� num�� �����Ѵ�.
			// �ٽ� ���� ������ num�� lotto�� ��Ҹ� ���Ѵ�. (��� �ݺ�)
			for(int j=0; j<i; j++) {
				if(num == lotto[j]) {
					num = (int)(1+Math.random()*45);
					j = -1;
				}
			}
			lotto[i] = num;
		}
		// �ζǹ�ȣ�� �ߺ����� �������� �����Ͻÿ�.
		System.out.println(Arrays.toString(lotto));
	}
	
	public static void lotto2(String[] args) {
		final int SIZE = 6;
		int[] lotto = new int[SIZE];
		
		int cnt = 0;
		while(cnt<6) {
			lotto[cnt] = (int)(1+Math.random()*6);
			boolean flag = true;
			for(int i=0; i<cnt; i++) {
				if(lotto[cnt] == lotto[i]){
					flag = false;
					break;
				}
			}
			if(flag) cnt++;
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
	
	public static void main(String[] args) {
		final int MAX = 6;
		int[] lotto = new int[MAX];
		int[] balls = new int[45];
		for(int i=1; i<=45; i++) {
			balls[i-1] = i;
		}
		System.out.println("1~45������ ���� �غ�Ǿ���.");
		// 1. balls�� index�� �����ϰ� �����Ѵ�.
		// 2. �� index ��ġ�� ��ȣ�� 0�� �ƴϸ� lotto �迭�� ����.
		// 3. �̾ƿ� index ��ġ�� ���� 0���� ����.
		// 4. index��ġ�� ���� 0�̸� �ٸ� ������ index ����.
		
		for(int i=0; i<lotto.length;) {
			int index = (int)(Math.random()*45); // 0~44 ������ ���� �߻�
			if(balls[index] !=0) {
				lotto[i] = balls[index];
				balls[index] = 0;
				i++;
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
	
	
}
