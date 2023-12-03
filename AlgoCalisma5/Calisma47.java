package AlgoCalisma5;

import java.util.Scanner;

public class Calisma47 
{

	public static void main(String[] args)
	{
		char[] sehir = {'K' , 'O' , 'N' , 'Y' , 'A'};
		System.out.println(sehir);//cevap = KONYA
		System.out.println("---------------------------------");
		double[] benimDizi = new double [5];
		Scanner input = new Scanner (System.in);
		System.out.print("Lutfen "+benimDizi.length+" sayi giriniz:");
		for(int i = 0; i < benimDizi.length ; i++)
		{
			benimDizi [i] = input.nextDouble();
		}
		double toplam = 0;
		for(int i = 0 ; i < benimDizi.length ; i++)
		{
			toplam += benimDizi[i];
		}
		System.out.println("sonuc : "+toplam);
		

	}

}
