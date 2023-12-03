package AlgoFinalCalisma;

import java.util.Scanner;

public class Soru4 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner (System.in);
		System.out.print("Bir dosya adi tam giriniz:");
		String dosyaAd = input.next();
		int nokta = dosyaAd.lastIndexOf(".");
		System.out.println("Dosya adi :"+dosyaAd.substring(0 , nokta));
		System.out.println("Dosya uzantisi :"+dosyaAd.substring((nokta + 1)));
		
		
		
		
		

	}

}
