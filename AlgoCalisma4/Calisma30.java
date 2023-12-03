package AlgoCalisma4;

import java.util.Scanner;

public class Calisma30 
{

	public static void main(String[] args) 
	{
		int top = 0 , sayi;
		Scanner input = new Scanner (System.in);
		do
		{
			System.out.print("Bir sayi gir:");
			sayi = input.nextInt();
			top += sayi;// top = top + sayi;
		}while(sayi !=0);
		System.out.println("Toplam : "+top);
		
		
		
		
		
		
		
		

	}

}
