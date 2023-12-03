package AlgoCalisma2;

import java.util.Scanner;

public class Calisma10
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Bir sayi giriniz:");
		int sayi = input.nextInt();
		int toplam = 0 ;
		int i = 1;
		while (i <= sayi)
		{
			toplam += i;
			i++;
		}
		System.out.println("Toplam : "+toplam);

	}

}
