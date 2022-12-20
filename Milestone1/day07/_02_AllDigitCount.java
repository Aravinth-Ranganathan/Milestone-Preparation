package day07;

public class _02_AllDigitCount {
	public static void main(String[] args) {
		int input1=45678;
		int a=0,count=0;
		while(input1!=0){
			a+=input1%10;
			count++;
			input1/=10;
		}
		System.out.println(count);
	}
}
