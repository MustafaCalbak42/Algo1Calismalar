package AlgoCalisma6;

import java.util.Scanner;

public class Calisma55 {

	public static void main(String[] args) 
	{
		Scanner border = new Scanner (System.in);
		int [] a = new int[10];
		System.out.println("10 tane sayi giriniz : ");
		int enkucuk , enKucukIndis , temp;
		for(int i = 0 ; i < a.length ; i++)
		{
			a [i] = border.nextInt();
		}
		for(int i = 0 ; i < a.length ; i++)
		{
			enKucukIndis = i ; enkucuk = a [i];
			for(int j = i ; j < a.length ; j++)
			{
			if( a[j] <= enkucuk)
			{
				enkucuk = a[j];
				enKucukIndis = j;
			}
			}
			temp = a[i] ; a[i] = a[enKucukIndis];
			a[enKucukIndis] = temp ;
		}
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
		

	}

}
