package AlgoCalisma2;

import java.util.Scanner;

public class Calisma16 
{

	public static void main(String[] args)
	{
		

		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			
			System.out.print("1 ile 7 arasinda sayi giriniz : ");
			int gun = input.nextInt();
			if(gun >=1 && gun < 8)
			{
				switch(gun)
				{
				case 1 : 
					System.out.println("Bugun gunlerden Pazartesi");
					break;
				case 2 :
					System.out.println("Bugun gunlerden Sali");
					break;
				case 3:
					System.out.println("Bugun gunlerden Carsamba");
					break;
				case 4:
					System.out.println("Bugun gunlerden Persembe");
					break;
				case 5:
						System.out.println("Bugun gunlerden Cuma");
				break;
				case 6:
					System.out.println("Bugun gunlerden Cumartesi");
					break;
				case 7:
					System.out.println("Bugun gunlerden Pazar");
					break;
				default:
					System.out.println("Lutfen gecerli bir sayi giriniz");
					System.exit(1);
			
				}
				break;
			
			}
		
		}
		
	}

}
