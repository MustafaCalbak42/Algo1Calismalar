package AlgoCalisma6;

import java.util.Scanner;

public class Calisma54 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		int[] a = new int [20];
		
		System.out.println("20 tane sayi giriniz : ");
		
		for(int i = 0 ; i < 20 ; i++)
		{
			a[i] = input.nextInt();
		} 
		int enkucuk = a [0];
		int enKucukIndis = 0;
		for(int j = 0 ; j < a.length ; j++)
		{
			if(a[j] < enkucuk)
			{
				a[j] = enkucuk;
				enKucukIndis = j;
			}
		}
		System.out.println("Dizinin en kucuk elemani : "+enkucuk);
		System.out.println("Dizinin en kucuk indisi : "+enKucukIndis);
		
		
		
		
		
		
		
		

	}

}
