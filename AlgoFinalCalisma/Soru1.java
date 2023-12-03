package AlgoFinalCalisma;

import java.util.Scanner;

public class Soru1 
{

	public static void main(String[] args)
	{
		int sabit = 2023100;
		int [] a = new int [300];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sabit + i;
		}
		Scanner input = new Scanner (System.in);
		System.out.print("Sayi giriniz : ");
		int n = input.nextInt();
		
		int []liste = new int [n];
		for(int i = 0 ; i < n ; i++)
		{
			int rastgele = (int) (Math.random() * 300);
			liste[i] = a[rastgele];
			System.out.println((i+1)+". ogrenci:" +liste[i]);
		}
		
	

	}

}
