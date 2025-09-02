package returnLastwordString;

public class SubString {
public String s;
	public void findLastWord(String input) {
	     s=input;
		 String  s1[]=s.split(" ");
		int lenOfString=s1.length;
		
		
			 int len=s1[lenOfString-1].length();
			 System.out.println("Last word is \""+s1[lenOfString-1]+ "\" with size "+ len);
		 }
	
public static void main(String[] args) {
		 
	SubString lw=new SubString();
	lw.findLastWord("Hello World");
	lw.findLastWord("   fly me   to   the moon ");	
	lw.findLastWord("luffy is still joyboy");
   
	
	
		
	}

}
