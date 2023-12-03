package AlgoCalisma5;

import java.util.Scanner;

public class Calisma42 
{

	public static void main(String[] args)
	{
		int sayi = (int) (Math.random() * 101);
		int tahmin;
		Scanner input = new Scanner (System.in);
		do 
		{
			System.out.print("Tahmin ediniz : ");
			tahmin = input.nextInt();
			if(tahmin < sayi)
			{
				System.out.println("Tahmininiz cok dusuk");
			}
			else if(tahmin > sayi)
			{
				System.out.println("Tahmininiz cok yuksek");
			}
			
			
		}while(tahmin != sayi);
		System.out.println("Tebrikler sayi : "+sayi+" di");
		
		
		
		

	}

}
