package day06;

public class _01_IsPrime {
	public static void main(String[] args) {
		int input1=7;
		int count=0;
	    for(int i=1;i<=input1;i++){
			if(input1%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println(input1+" is a Prime Number");
		}
		else{
			System.out.println(input1+" is not a Prime Number");
		}
	}
}
