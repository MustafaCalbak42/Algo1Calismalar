package AlgoCalisma6;

import java.util.Scanner;

public class Calisma51
{

	public static void main(String[] args)
	{
	  Scanner border = new Scanner (System.in);
	  System.out.print("Dizi boyutunu giriniz : ");
	  int n = border.nextInt();
	  double[] sayilar = new double[n];
	  double toplam = 0;
	  for(int i = 0 ; i < n ; i++ )
	  {
		  System.out.println("Sayilari giriniz:");
		  sayilar [i] = border.nextDouble();
		  toplam += sayilar[i];
	  }
	  double ortalama = toplam / n;
	  int sayac = 0 ; //ortalama uzerindeki eleman sayisi
	  for(int i = 0 ; i < n ; i++) 
	  {
		  if(sayilar[i] > ortalama)
		  {
			  sayac++;
		  }
	  }	
	  System.out.println("ortalama : "+ortalama);
	  System.out.println("ortalama uzerindeki eleman sayisi: "+sayac);
	
	
	}

}
