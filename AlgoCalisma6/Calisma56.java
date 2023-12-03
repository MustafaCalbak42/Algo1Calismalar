package AlgoCalisma6;

public class Calisma56 {

	public static void main(String[] args) 
	{
		int [][] tablo = {{100 ,20,300} , {44,55,66} , {7,80,90},{10,11,12}};
		int enkucuk = tablo[0][0];
		int str=0,sut=0;
		for(int i = 0 ; i < tablo.length ; i++)
		{
			for(int j = 0 ; j < tablo[0].length ; j++)
			{
				if(tablo[i][j] < enkucuk)
				{
					enkucuk=tablo[i][j];
					 str=i;
					 sut=j;
				}
			}
		}
		System.out.println(enkucuk+" "+str+","+sut);
		
		
		
		
		
			
		

	}

}
