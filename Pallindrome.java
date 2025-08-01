package week2.day1;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=123,input1=input;
int i,output=0;
for (i=input;i>=0;i--) {
	int rem=input%10;
		System.out.println(rem);
		output=output*10+input%10;
		
		input=i/10;
		i=input;
		
		//System.out.println(input);
	
}
System.out.println(output);
System.out.println(input1);
if(input1==output)
System.out.println(" input is a palindrome "+input1);

else
	System.out.println(" input is not palindrome "+input);
	}

}
