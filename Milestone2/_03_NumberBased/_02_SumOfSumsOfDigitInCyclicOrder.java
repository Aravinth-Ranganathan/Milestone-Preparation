package _03_NumberBased;

public class _02_SumOfSumsOfDigitInCyclicOrder {
	public static void main(String[] args) {
		int input1=582109;
		String st=Integer.toString(input1);
		int len=st.length();
		String  str=st;
		int b=0,tot=0,a,k=1;
		for(int i=0;i<len;i++) {
			b=0;
			a=Integer.parseInt(st);
			while(a!=0){
				b+=a%10;
				a/=10;
			}
			tot+=b;
			st=str.substring(k);
			k++;
		}
		System.out.println(tot);
	}
}
