package day08;

public class _04_DigitSumEvenOdd {
	public static void main(String[] args) {
		int input1=21345;
		String input2="even";
		int sum=0,a=0,b=0;
		String od="odd",en="even";
		while(input1!=0){
			sum=input1%10;
			if(sum%2==0 && input2=="even"){
				a+=sum;
			}
			if(sum%2!=0 && input2=="odd"){
				b+=sum;
			}
			input1/=10;
		}
		if(input2=="even"){
			System.out.println(a);
		}
		else{
			System.out.println(b);
		}
	}
}
