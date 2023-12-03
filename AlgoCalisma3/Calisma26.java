package AlgoCalisma3;

public class Calisma26 
{

	public static void main(String[] args) 
	{
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Derece", "Radyan", "Sinus", "Cosinus", "Tanjant");
		int derece = 30;	
		double radyan = Math.toRadians(derece);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",derece,radyan,Math.sin(radyan),Math.cos(radyan),Math.tan(radyan));
		derece = 60;
		radyan = Math.toRadians(derece);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",derece,radyan,Math.sin(radyan),Math.cos(radyan),Math.tan(radyan));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
