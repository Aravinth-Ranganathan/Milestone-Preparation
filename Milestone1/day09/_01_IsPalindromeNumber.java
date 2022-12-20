package day09;

public class _01_IsPalindromeNumber {
	public static void main(String[] args) {
		int input1=127821;
		String str1=Integer.toString(input1);
		StringBuilder sb=new StringBuilder(str1);
		String str2=sb.reverse().toString();
		if(str1.equals(str2)){
			System.out.println("2");
		}
		else
		System.out.println("1");
	}
}
