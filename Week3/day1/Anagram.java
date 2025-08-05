package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
	String 	text1 = "stops";  
	 String     text2 = "potwss";
	 char[] charArray1 = text1.toCharArray();
	
	 char[] charArray2=text2.toCharArray();
	 Arrays.sort(charArray1);
	 Arrays.sort(charArray2);
if (text1.length()==text2.length())
{

	if(Arrays.toString(charArray1).equals(Arrays.toString(charArray2)))
			{		
	System.out.println("The given strings are Anagram.");
			}
	else {System.out.println("The given strings are  not Anagram.");}
}
else
{
	System.out.println("Lengths mismatch, therefore the strings are not an Anagram" );
	
}
	}

}
