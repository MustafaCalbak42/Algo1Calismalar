package AlgoCalisma5;

import java.util.Scanner;

public class Calisma43 
{

	public static void main(String[] args) 
	{
		Scanner border = new Scanner (System.in);
		int number , max;
		System.out.print("Bir sayi giriniz:");
		number = border.nextInt();
		max = number;
		while(number != 0)
		{
			System.out.print("Bir sayi giriniz:");
			number = border.nextInt();
			if(number > max)
			{
				max = number;
			}
		}
		System.out.println("max is : "+max);
		System.out.println("number is : "+number);
		
		
		

	}

}
