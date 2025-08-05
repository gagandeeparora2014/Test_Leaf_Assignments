package week3.day1;

public class OddIndexToUppercase
{

	public static void main(String[] args) 
	{
		String test="changeme";
		
		
		for (int i=0; i<test.length();i++)
		{	
			if (i%2!=0)
			{
				char ltr = test.charAt(i);
				System.out.print(Character.toUpperCase(ltr));
				//(Character.toUpperCase(ltr);
			}
			else	
		System.out.print(test.charAt(i));
		}
	}

}
