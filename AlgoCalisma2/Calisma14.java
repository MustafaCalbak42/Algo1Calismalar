package AlgoCalisma2;

import java.util.Scanner;

public class Calisma14 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Bir sayi giriniz: ");
		int sayi = input.nextInt();
		int faktoriyel = 1 , i = 1;
		while(i <= sayi)
		{
			faktoriyel *= i;
			i++;
		}
		System.out.println("Girilen sayini faktoriyeli : "+faktoriyel);
		
		
		
		
		
	}

}
