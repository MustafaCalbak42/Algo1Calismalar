package AlgoCalisma2;

public class Calisma18 
{

	public static void main(String[] args) 
	{
		double sayi = Math.toRadians(45);
		System.out.println(sayi);//0.7853.....
		double deger = Math.toDegrees(Math.PI / 2);
		System.out.println(deger);//90.0
		double deger2 = Math.sin((3 * Math.PI) / 2);
		System.out.println((int)deger2);//-1
		double deger3 = Math.exp(2);
		System.out.println(deger3);//7.389...
		deger3 = Math.log(Math.pow(Math.exp(1), 2));
		System.out.println(deger3);//2.0
		deger2 = Math.sqrt(25);
		System.out.println(deger2);//5.0
		System.out.println("----------------------------------");
		deger = Math.rint(4.6);
		System.out.println(deger);//5.0
		deger = Math.rint(6.5);
		System.out.println(deger);//6.0
		deger = Math.ceil(2.1);
		System.out.println("ceil:"+deger);//3.0
		deger = Math.floor(5.9);
		System.out.println(deger);//5.0
		deger2 = Math.round(2.88899f);
		System.out.println(deger2);//3.0
		System.out.println("----------------------------------");
		deger3 = Math.max(8.1,9.8);
		System.out.println(deger3);//9.8
		deger3 = Math.min(88.8, 75.7);
		System.out.println(deger3);//75.7
		deger3 = Math.abs(-9.8);
		System.out.println(deger3);//9.8
		System.out.println("----------------------------------");
		deger2 = 8 + Math.random() * 1;
		System.out.println(deger2);//1 ile 9 arasında rastgele sayı tutuyor.
		
		
		

	}

}
