package AlgoCalisma2;

import java.util.Scanner;

public class Calisma15 
{

	public static void main(String[] args) 
	{
		int sayi1 = (int) (Math.random() * 10);
		int sayi2 = (int) (Math.random() * 10);
		if(sayi1 < sayi2)
		{
			int temp = sayi1;
			sayi1 = sayi2;
			sayi2 = temp;
		}
		Scanner input = new Scanner (System.in);
		System.out.println(sayi1+" - "+sayi2+ " sonucu nedir?");
		int cevap = input.nextInt();
		if(sayi1 - sayi2 == cevap)
		{
			System.out.println("Sonuc Dogru Tebrikler.");
		}
		else
		{
			System.out.println("Cevabin Yanlis!");
			System.out.println("Dogru Cevap = "+(sayi1 - sayi2)+" olacakti.");
		}
		
		
		
	}

}
