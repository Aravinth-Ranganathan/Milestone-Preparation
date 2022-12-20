package _01_StringBased01;


public class Additon {
	public static void main(String[] args) {
		String s1="99999",s2="999";
		int temp=0,temp1=0,temp2=0,rem=0;
		String str1="",str2="";
		int len=0;
		if(s1.length()>s2.length()) {
			len=s1.length();
		}
		else {
			len=s2.length();
		}
		for(int i=0;i<len;i++) {
			temp1=0;
			temp2=0;
			if(i<s1.length()) {
				temp1=Integer.parseInt(s1.substring(s1.length()-1-i, s1.length()-i));
			}
			if(i<s2.length()) {
				temp2=Integer.parseInt(s2.substring(s2.length()-1-i, s2.length()-i));
			}
			temp=temp1+temp2+rem;
			if(i!=len-1) {
				if(temp>9) {
					temp=temp%10;
					rem=1;
				}
				else {
					rem=0;
				}
				str1+=temp;
			}
			else {
				str2+=temp;
			}
		}
		StringBuilder sb=new StringBuilder(str1);
		sb.reverse();
		str1=sb.toString();
		System.out.println(str2+str1);
	}
}
