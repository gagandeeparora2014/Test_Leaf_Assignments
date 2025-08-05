package week3.day1;

public class OccurOfChar
{

	public static void main(String[] args)
	{

		String input = "TestLeaf";
		int count = 0;

		char[] charArray = input.toCharArray();

		for (int i = 0; i < charArray.length - 1; i++)

		{
			char c = charArray[i];
			if (c == 'e') 
			{
				
				count += 1;
			}
		}
		System.out.println("The  count occurrences of character ‘e’ in the given String is: " + count);
	}

}
