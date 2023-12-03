package AlgoCalisma3;

public class Calisma20 
{

	public static void main(String[] args) 
	{
		char ch = '1';
		char ch1 = 'a';
		System.out.println(Character.isDigit(ch));//ch sayı ise true döndür. cevap = true
		System.out.println(Character.toUpperCase(ch1));//ch1 karakterini buyuk harfe dönüştürür. cevap = A
		System.out.println(Character.isLetter(ch1));//ch1 karakteri harf ise true döndürür. cevap = true
		String mesaj = "Mustafa ";
		System.out.println(mesaj.length());// mesaj ' ın uzunluğunu bulur. cevap = 8
		String mesaj2 = "";
		System.out.println(mesaj2.length());//mesaj2 ' nin uzunluğunu bulur. cevap = 0
		System.out.println(mesaj.charAt(0));//mesaj ' ın 0. indisini yazar cevap = M
		String s1 = "Mustafa";
		String s2 = " CALBAK";
		String s3 = s1.concat(s2);
		System.out.println(s3);//s1 ve s2 yi birlesştirip yazıyor cevap = Mustafa CALBAK
		System.out.println("Merhaba".toLowerCase());//Kelimeyi ful küçük harfle yazar. cevap = merhaba
		System.out.println("Merhaba".toUpperCase());//Kelimeyi ful büyük harfle yazar. cevap = MERHABA
		System.out.println("\tMerhaba".trim());//whitespace karakterleri silip yazar tab kadar bosluk bırakmadan yazar. cevap = Merhaba
		
	
	
	
	
	
	
	
	
	}

}
