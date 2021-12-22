package ch7;

public class moonje { // 추의 무게가 2g, 3g, 5g 이고 10개씩 존재한다. 이것으로 81g을 만드는 코딩을 하시오.(반복문 3개 사용)

	public static void main(String[] args) {
		for(int five=0;five<11;five++) { 		// 객체의 값이 11미만이 될때까지 반복
			for(int three=0;three<11;three++) {	// 객체의 값이 11미만이 될때까지 반복
				for(int two=0;two<11;two++) {	// 객체의 값이 11미만이 될때까지 반복
					if(5*five+3*three+2*two==81) {	
					// 위의 if문은 고정된 추의 무게에 객체의 값이 바뀐것을 곱하고 그 값을 합친값이 81과 같아야 하는 조건식
					//String s="5g "+five+"개 3g"+three+"개 2g "+two+"개";
					//System.out.println(s);
					String str=String.format("5g: %d개, 3g: %d개, 2g: %d개%n",five,three,two);
					//뒤쪽에 적혀있는 five,three,two는 앞에 적힌 %d개, %d개n에 자동으로 위치에 맞춰서 순서대로 값이 들어감
					System.out.printf(str);
					}
			}
		}
		}
	}
}

