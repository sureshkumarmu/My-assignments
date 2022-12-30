package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int input= 32323;
		int temp=0,reverse;
		for (int i=input;i!=0;i=i/10)
		{
			reverse=i%10;
			temp=(temp*10)+reverse;
		}
			if(temp==input)
			{
				System.out.println(input+" is a palindrome");
			}
			else
			{
				System.out.println(input+" is not a palindrome");
			}
		}
}
