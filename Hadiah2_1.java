import java.util.Scanner;

public class Hadiah2_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int celci, faren;
		
		System.out.print("Celcius= ");
		celci = input.nextInt();
		
		faren=celci*9/5+32;
		System.out.println("Farenheit= "+faren);
	}
}