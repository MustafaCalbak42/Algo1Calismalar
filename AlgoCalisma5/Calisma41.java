package AlgoCalisma5;

import java.util.Scanner;

public class Calisma41
{

	public static void main(String[] args)
	{
		int sayi1 = (int) (Math.random() * 10);
		int sayi2 = (int) (Math.random() * 10);
		int cevap;
		do
		{
			
			Scanner input = new Scanner (System.in);
			
			System.out.print(sayi1+" + "+sayi2+" sonucu nedir? ");
			cevap = input.nextInt();
			
			
		}while((sayi1 + sayi2) != cevap); 
			
		System.out.println("Tebrikler bildin");
 		
		
		
		
		
		
		
		
		
		
		
	}

}
