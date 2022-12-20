package day06;

public class _02_Factorial {
	public static void main(String[] args) {
		int input1=5;
		int mul=1;
		for(int i=input1;i>0;i--){
			mul*=i;
		}
		System.out.println(mul);
	}
}
