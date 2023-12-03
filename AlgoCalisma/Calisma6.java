package AlgoCalisma;

import java.util.Scanner;

public class Calisma6
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Boyunuzu giriniz (cm) : ");
		double boy = input.nextDouble();
		boy = boy / 100;
		System.out.print("Kilonuzu giriniz (kg) : ");
		double kilo = input.nextDouble();
		System.out.print("Cinsiyet giriniz (E / K ) : ");
		String cinsiyet = input.next();
		double bki = kilo / (boy * boy) ;
		if (cinsiyet.equals("E"))
		{
			if(bki >= 25)
			{
				System.out.println("Kilolusunuz");
			}
			else
			{
				System.out.println("Kilolu Degilsiniz");
			}
		}
		else if (cinsiyet.equals("K"))
		{
			if(bki >= 23)
			{
				System.out.println("Kilolusunuz");
			}
			else
			{
				System.out.println("Kilolu Degilsiniz");
			}
		}
		

	}

}
