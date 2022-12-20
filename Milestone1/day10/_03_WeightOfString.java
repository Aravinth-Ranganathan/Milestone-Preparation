package day10;

public class _03_WeightOfString {
	public static void main(String[] args) {
		String input1="Hello World";
		int input2=0;
		input1=input1.toLowerCase();
		int a=0,b=0;
		int ch;
		for(int i=0;i<input1.length();i++){
			ch=input1.charAt(i);
			if(input2==1){
				a=Math.abs(ch-96);
				if(a>0 && a<27) {
					b+=a;
				}
			}
			if(input2==0) {
				a=Math.abs(ch-96);
				if((a>0 && a<27) && !(a==1 || a==5 || a==9 || a==15 || a==21)) {
					b+=a;
				}
			}
		}
		System.out.println("total "+b);
	}
}
