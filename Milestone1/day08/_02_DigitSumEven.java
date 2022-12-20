package day08;

public class _02_DigitSumEven {
	public static void main(String[] args) {
		int input1=108;
		int sum=0,a=0;
		while(input1!=0){
			sum=input1%10;
			System.out.println(sum);
			if(sum%2==0){
				a+=sum;
			}
			input1/=10;
			if(input1==0 && sum>9){
				input1=sum;
				sum=0;
			}
		}
		System.out.println(a);
	}
}
