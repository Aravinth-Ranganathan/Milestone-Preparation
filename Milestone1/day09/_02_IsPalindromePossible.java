package day09;

public class _02_IsPalindromePossible {
	public static void main(String[] args) {
		int input1=1233321;
		String str=Integer.toString(input1);
		char ch[]=str.toCharArray();
		int count=0,a=0,b=0;
		int fg=0;
		for(int i=0;i<str.length();i++) {
			count=0;
			for(int j=0;j<str.length();j++) {
					if(ch[i]==ch[j]) {
						count++;
					}
			}
			if(str.length()%2==0 && count>1) {
				a++;
			}
			if(str.length()%2!=0 && count>1) {
				if(count>2) {
					fg++;
				}
				b++;
			}
		}
		if(str.length()%2==0 && a==str.length()) {
			System.out.println("palindrome possible");
		}
		else if(str.length()%2!=0 && b==str.length()&& fg>1) {
			System.out.println("palindrome possible");
		}
		else if(str.length()%2!=0 && b==str.length()-1) {
			System.out.println("palindrome possible");
		}
		else {
			System.out.println("palindrome not possible");
		}
	}
}
