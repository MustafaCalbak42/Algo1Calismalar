package AlgoCalisma6;

public class Calisma53 
{

	public static void main(String[] args) 
	{
		int []a = {120 , 422 , 354 , 74 , 45 , 687 , 7 , 8, 12 , 54 , 87 , 99 , 81 , 21 , 31 , 65 , 47 , 42 , 3 , 61}; 
		int enkucuk = a[0];
		int enKucukIndis = 0;
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a [i] < enkucuk)
			{
				enkucuk = a[i];
				enKucukIndis = i;
			}
		}
		System.out.println("Dizinin en kucuk elemani : "+enkucuk);
		System.out.println("Dizinin en kucuk indisi : "+enKucukIndis);
		
		
		
		
		
	}

}
