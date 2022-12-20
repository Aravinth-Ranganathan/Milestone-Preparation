package _01_StringBased01;

public class _02_GetCodeThroughString {
	public static void main(String[] args) {
		String input1="Wipro Technology";
		String str[]=input1.split(" ");
		int len=0,a=0,b=0;
		for(int i=0;i<str.length;i++){
			len+=str[i].length();
		}
		while(len!=0){
			a+=len%10;
			len=len/10;
		}
		System.out.println("Pin "+a);
	}
}
