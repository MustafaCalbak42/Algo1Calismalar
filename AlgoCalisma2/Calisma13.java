package AlgoCalisma2;

import java.util.Scanner;

public class Calisma13
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int sayi1 = input.nextInt();
		System.out.print("Ikinci sayiyi giriniz: ");
		int sayi2 = input.nextInt();
		if(sayi1 > sayi2)
		{
			System.out.println("Sayi1 ("+sayi1+") Sayi2 ' den ("+sayi2+") buyuktur");
		}
		else if(sayi1 == sayi2)
		{
			System.out.println("Sayi1 ("+sayi1+") Sayi2 ' ye ("+sayi2+") esittir");
		}
		else
		{
			System.out.println("Sayi1 ("+sayi1+") Sayi2 ' den ("+sayi2+") kucuktur");
		}
	}

}
