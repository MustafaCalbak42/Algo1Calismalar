package AlgoCalisma5;

import java.util.Scanner;

public class Calisma46 
{

	public static void main(String[] args) 
	{
		double[] array = new double[5];
		Scanner border = new Scanner (System.in);
		for(int i = 0; i < array.length ; i++)
		{
			System.out.printf("array[%d]: ",i);
			array[i] = border.nextDouble();
		}
		System.out.print("array = {");
		for(int i = 0 ; i < array.length ; i++)
		{
			System.out.printf("%5.1f",array[i]);
		}
		System.out.print("}");
		
		
		
		
		
		
	}

}
