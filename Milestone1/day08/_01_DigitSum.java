package day08;

public class _01_DigitSum {
	public static void main(String[] args) {
		int input1=-99999;
		int sum=0;
		int a=Math.abs(input1);
		while(a!=0){
			sum+=a%10;
			a/=10;
			if(a==0 && (sum>9)) {
				a=sum;
				sum=0;
			}
		}
		if(input1<0){
			System.out.println(-sum);
		}
		else{
			System.out.println(sum);
		}
	}
}
