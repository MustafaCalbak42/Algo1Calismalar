package AlgoCalisma3;

import java.util.Scanner;

public class Calisma23 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Bir kelime giriniz : ");
		String kelime = input.nextLine();
		System.out.print("Bir kelime daha giriniz : ");
		String kelime2 = input.nextLine();
		if(kelime.compareTo(kelime2) < 0)
		{
			System.out.println("Kelimelerin alfabetik sirasi : "+kelime+" , "+kelime2);
		}
		
		
		
		
		

	}

}
