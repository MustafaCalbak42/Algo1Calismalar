package AlgoCalisma3;

public class Calisma22 
{

	public static void main(String[] args) 
	{
		String s1 = "A";//length =65
		String s2 = "0";//length =48 ASCII karsılıkları
		String s3 = "Mustafa";
		String s4 = "ALI";
		String s5 = "fa";
		System.out.println(s1.concat(s2));// s1 = s2 ' ye true döndür. cevap = false
		System.out.println(s1.equals(s3));// s1 = s3 ' e true döndür. cevap = true 
		System.out.println(s2.equalsIgnoreCase(s4));// s2 = s4 ise true döndür. (Küçük büyük harf dikkate alınmaz.) cevap = true
		System.out.println(s2.compareTo(s1));//s1 , s4 ' ten büyükse sıfırdan büyük bir sayı, eşitse sıfır ve küçükse sıfırdan 
		System.out.println(s1.compareTo(s4));								     //küçük bir sayı döndürür. (kelimelerin ilk harfine bakılır)
		System.out.println("122");
		System.out.println(s3.startsWith("Mus"));// s3 Mus öne kiyle baslamıssa true döner cevap = true
		System.out.println(s3.endsWith(s5));// s3 s5 son ekiyle bitmişşe true döner. cevap = true
		System.out.println(s3.contains(s5));// s3 un icinde s5de bulunan herhangi bir harf varsa true döner. cevap = true
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
