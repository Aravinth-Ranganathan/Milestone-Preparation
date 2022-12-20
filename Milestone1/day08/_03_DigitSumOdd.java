package day08;

public class _03_DigitSumOdd {
	public static void main(String[] args) {
		int input1=2136;
		int sum=0,a=0;
		while(input1!=0){
			sum=input1%10;
			if(sum%2!=0){
				a+=sum;
			}
			input1/=10;
			if(sum>9 && input1==0){
				input1=sum;
				sum=0;
			}
		}
		System.out.println(a);
	}
}
