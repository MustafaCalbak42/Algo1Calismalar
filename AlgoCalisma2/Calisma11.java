package AlgoCalisma2;

import java.util.Scanner;

public class Calisma11
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Bir sayi giriniz: ");
		int sayi = input.nextInt();
		if (sayi < 0 )
		{
			System.out.println("Sayi Negatiftir");
		}
		else if(sayi > 0)
		{
			System.out.println("Sayi Pozitiftir");
		}
		else
		{
			System.out.println("Sayi Notrdur");
		}
		
	}	

}
