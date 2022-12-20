package day10;

public class _02_IsPalindromeString {
	public static void main(String[] args) {
		String input1="Madam";
		String a=input1.toUpperCase();
		StringBuilder sb=new StringBuilder(a);
		sb.reverse();
		String str=sb.toString();
		if(a.equals(str)){
			System.out.println(input1+" is palindrome");
		}
		else{
			System.out.println(input1+" is not a palindrome");
		}
	}
}
