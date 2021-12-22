package ch7;

public class StudentMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		
		s1.name = "김태희";
		s1.kor = 90;
		s1.eng = 95;
		s1.math = 100;
		s1.sum = s1.kor + s1.eng + s1.math;
		s1.avg = (float) s1.sum / 3;
		
		System.out.println("객체 s1의 정보");
		System.out.println("이름 : " + s1.name);
		System.out.println("국어 : " + s1.kor);
		System.out.println("영어 : " + s1.eng);
		System.out.println("수학 : " + s1.math);
		System.out.println("총점 : " + s1.sum);
		System.out.println("평균 : " + s1.avg);
		
		s2.name = "원빈";
		s2.kor = 80;
		s2.eng = 90;
		s2.math = 70;
		s2.sum = s2.kor + s2.eng + s2.math;
		s2.avg = (float) s2.sum / 3;
		
		System.out.println("객체 s2의 정보");
		System.out.println("이름 : " + s2.name);
		System.out.println("국어 : " + s2.kor);
		System.out.println("영어 : " + s2.eng);
		System.out.println("수학 : " + s2.math);
		System.out.println("총점 : " + s2.sum);
		System.out.println("평균 : " + s2.avg);
		
		s3.name = "태연";
		s3.kor = 95;
		s3.eng = 90;
		s3.math = 85;
		s3.sum = s3.kor + s3.eng + s3.math;
		s3.avg = (float) s3.sum / 3;
		
		System.out.println("객체 s3의 정보");
		System.out.println("이름 : " + s3.name);
		System.out.println("국어 : " + s3.kor);
		System.out.println("영어 : " + s3.eng);
		System.out.println("수학 : " + s3.math);
		System.out.println("총점 : " + s3.sum);
		System.out.println("평균 : " + s3.avg);
		
		s4.name = "써니";
		s4.kor = 85;
		s4.eng = 100;
		s4.math = 90;
		s4.sum = s4.kor + s4.eng + s4.math;
		s4.avg = (float) s4.sum / 3;
		
		System.out.println("객체 s4의 정보");
		System.out.println("이름 : " + s4.name);
		System.out.println("국어 : " + s4.kor);
		System.out.println("영어 : " + s4.eng);
		System.out.println("수학 : " + s4.math);
		System.out.println("총점 : " + s4.sum);
		System.out.println("평균 : " + s4.avg);
	}

}
