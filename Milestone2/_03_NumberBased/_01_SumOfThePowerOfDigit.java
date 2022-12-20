package _03_NumberBased;


public class _01_SumOfThePowerOfDigit {
	public static void main(String[] args) {
		int input1=582109;
		int at=0;
		String str=Integer.toString(input1);
		int a[]=new int[str.length()];
			while(input1!=0){
				for(int i=str.length()-1;i>=0;i--) {
				a[i]=input1%10;
				input1=input1/10;
			}
		}
			for(int i=0;i<str.length()-1;i++) {
				at+=(int)Math.pow(a[i],a[i+1]);
			}
		System.out.println("Pow "+(at+1));
	}
}

