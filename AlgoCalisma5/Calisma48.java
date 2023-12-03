package AlgoCalisma5;

public class Calisma48 
{

	public static void main(String[] args) 
	{
		double [] array = {1 , 2 , 3 , 4 , 5};
	
		double enbuyuk = array[0];
		for(int i = 0 ; i < array.length ; i++ )
		{
			if(enbuyuk < array[i])
			{
				enbuyuk = array[i];
			}
		}
		System.out.println("Dizinin en buyuk elemani : "+enbuyuk);
		System.out.println("---------------------------------------");
		int enBuyukIndis = 0;
		for(int i = 1 ; i < array.length ; i++)
		{
			if(array[i] > enbuyuk)
			{
				enbuyuk = array[i];
				enBuyukIndis = i;
			}
		}
		System.out.println("Dizinin en buyuk elemani : "+enbuyuk+ " dizinin en buyuk indisi : "+enBuyukIndis);
		
		
		
		
		
		
		
		
		
		
	}

}
