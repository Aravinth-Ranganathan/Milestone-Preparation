package day06;

public class _03_NthFibonaci {
	public static void main(String[] args) {
		int input1=6;
		int a=0,b=0,c=1;
		if(input1==1){
			c=0;
		}
		if(input1>=1){
			for(int i=0;i<input1;i++){
			a=b;
			b=c;
			c=a+b;
		}
		}
		System.out.println(a);
	}
}
