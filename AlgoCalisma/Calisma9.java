package AlgoCalisma;

public class Calisma9 
{

	public static void main(String[] args) 
	{
		int toplam = 0;
		int i = 2;
		while (i <= 100)
		{
			if(i % 2 == 0)
			{
				toplam += i;
			}
			i++;
		}
		System.out.println("Toplam : "+toplam);

	}

}
