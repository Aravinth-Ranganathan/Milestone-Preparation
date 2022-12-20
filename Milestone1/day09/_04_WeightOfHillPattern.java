package day09;

public class _04_WeightOfHillPattern {
	public static void main(String[] args) {
		int input1=4,input2=1,input3=5;
		int a=0,b=0;
		for(int i=0;i<input1;i++) {
			for(int j=0;j<i+1;j++) {
				a=input2;
				b+=a;
				System.out.print(a+" ");
			}
			input2+=input3;
		}
		System.out.println(b);
	}
}
