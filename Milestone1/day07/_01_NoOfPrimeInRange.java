package day07;

public class _01_NoOfPrimeInRange {
	public static void main(String[] args) {
		int input1=5;
		int input2=7;
		int count=0,co=0;
	    for(int n=input1;n<=input2;n++){
			count=0;
			for(int i=1;i<n;i++){
				if(n%i==0){
					count++;
				}
			}
			if(count==1){
				co++;
			}
		}
	    System.out.println(co);
	}
}
