package AlgoCalisma5;

public class Calisma44 
{

	public static void main(String[] args) 
	{

		System.out.println("\t\tTablo Indisleri ve Indis Toplamlari");
        System.out.print("  |");
        for (int i = 1; i < 10; i++) {
            System.out.printf("%7d", i);
        }
        System.out.println();

        System.out.print("--|");
        for (int i = 0; i < 7 ; i++) {
            System.out.print("---------");
        }
        System.out.println();

        for (int i = 1; i < 10 ; i++) {
            System.out.printf("%d |", i);
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d%d-%2d", j , i , (i + j));
            }
            System.out.println();
        }
		
		
		
		
		
		
		
	}

}
