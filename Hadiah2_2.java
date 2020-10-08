import java.util.Scanner;

public class Hadiah2_2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double phi = 3.14;
		int r;
		double L;
	
		System.out.print("Jari-jari= ");
		r = input.nextInt();
		System.out.println();
		
		L = phi * r * r;
		System.out.println("Luas= "+phi+" x "+r+" x "+r+" = "+L);
	}
}