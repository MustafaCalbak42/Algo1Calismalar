package AlgoCalisma4;

import java.util.Scanner;

public class Calisma37 
{
	public static void main (String [] args)
	{
		Scanner border = new Scanner (System.in);
		System.out.print("Ilk tamsayiyi giriniz:");
		int s1 = border.nextInt();
		System.out.print("Ikinci tamsayiyi giriniz:");
		int s2 = border.nextInt();
		int ebob = 1;
		int k = 2;
		while(k <= s1 && k <= s2)
		{
			if(s1 %k == 0 && s2 %k == 0)
			{
				ebob = k;
				
			}
			k++;
		}
		System.out.println("Ebob : "+ebob);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
