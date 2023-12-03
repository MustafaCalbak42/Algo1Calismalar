package AlgoCalisma3;

public class Calisma24 
{

	public static void main(String[] args) 
	{
		String dosyaAd = "Mustafa CALBAK ";
		System.out.println(dosyaAd.indexOf(" "));// dosyaAd içindeki ilk " " ’un indeksini döndürür, eşleşme olmazsa -1 döndürür. cevap = 7
		System.out.println(dosyaAd.indexOf(" " ,9));// dosyaAd  içindeki [9] ’ ndan itibaren ilk " " ’ un indeksini döndürür
	                                              	//eşleşme olmazsa -1 döndürür. cevap = 14
	    System.out.println(dosyaAd.indexOf("A"));//dosyaAd içindeki ilk "A" ’ nın indeksini döndürür, eşleşme olmazsa -1 döndürür. cevap = 9
		System.out.println(dosyaAd.indexOf("L" , 11));//dosyaAd  içindeki [11] ’ den itibaren ilk "L" ’ nin indeksini döndürür,
													  //eşleşme olmazsa -1 döndürür. cevap = -1
		System.out.println("-------------------------------");
		System.out.println(dosyaAd.lastIndexOf(" ")); //dosyaAd içindeki son " " ’un indeksini döndürür, eşleşme olmazsa -1 döndürür. cevap = 14
		System.out.println(dosyaAd.lastIndexOf(" ", 7));//dosyaAd içindeki [7] ’ indeksten sonra son " " ' un indeksini döndürür,
														//eşleşme olmazsa -1 döndürür.
														//(Yalnız kelimenin son indisine geldikten sonra [0]. indise geri dönüp [7] e kadar 
														//tekrar döner).
		                                                //cevap = 14
		System.out.println(dosyaAd.lastIndexOf("a"));//dosyaAd içindeki son "a" ’ nın indeksini döndürür, eşleşme olmazsa -1 döndürür. 
													 //cevap = 6
		System.out.println(dosyaAd.lastIndexOf("A" , 5));//dosyaAd içindeki [5] ’ indeksten sonra son " " ' un indeksini döndürür,
														 //eşleşme olmazsa -1 döndürür.
													   	 //(Yalnız kelimenin son indisine geldikten sonra [0]. indise geri dönüp [5] e kadar 
														 //tekrar döner).
														 //cevap = 4						
		
		
		
		
		
		
		
		
		
		
		
	}

}
