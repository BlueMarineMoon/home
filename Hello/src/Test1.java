import java.util.Scanner;

public class Test1 {
	public static double Circum(Double LowBase, Double Height, Double Hypo)
	{
		return LowBase + Height + Hypo;
	}
	
	public static double Area(Double LowBase, Double Height)
	{
		return (LowBase * Height) / 2;
	}
	
	public static void main(String []args)
	{
		Double Low, Height;
		Scanner lw = new Scanner(System.in);
		System.out.println("�غ��� �Է��ϼ���.");
		Low=lw.nextDouble();
		
		Scanner hg = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���.");
		Height=hg.nextDouble();
		
		double Hypo = Math.sqrt((Low*Low) + (Height*Height));
		
		System.out.print("�ѷ� :");
		System.out.println(Circum(Low, Height, Hypo));
		
		System.out.print("���� :");
		System.out.println(Area(Low, Height));
	}
}
