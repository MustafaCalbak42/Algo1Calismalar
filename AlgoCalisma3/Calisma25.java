package AlgoCalisma3;

public class Calisma25 
{

	public static void main(String[] args) 
	{
		double ucret = 16.404674;
		System.out.printf("%5.2f",ucret);//16,40
		System.out.printf("%n%7.2f",ucret);//  16,40
		System.out.printf("%n%7.2e",ucret);//1,64e+01
		
		System.out.println("\n------------------------------");
		
		int adet = 5;
		double miktar = 45.56;
		System.out.printf("Adet %d ve miktar %f",adet , miktar);//Adet 5 ve miktar 45,560000
		System.out.printf("%n%5d",adet);//    5
		
		System.out.println("\n------------------------------");
		
		boolean kosul = true;
		System.out.printf("%6b",kosul);//  true
		System.out.printf("%n%6b",false);// false
	
		System.out.println("\n------------------------------");
		
		String  ad = "Mustafa";
		System.out.printf("%8s",ad);// Mustafa
		
		System.out.println("\n------------------------------");
		
		char ch = 'A';
		char cd = (int)66.25;
		int ch1 = 'A';
		System.out.printf("%5c",ch);   //    A
		System.out.printf("%n%6d",ch1);//    65
		System.out.printf("%n%5c",cd); //    B
		
		
		
	}

}
