package _01_NumberBasedPrograms;

public class _04_SumOfNonPrimeIndex {
	public static void main(String[] args) {
		int input1[]={-1,-2,-3,3,4,-7};
		int input2=input1.length;
		int count=0,sum=0;
		sum=input1[0]+input1[1];
		for(int i=2;i<input2;i++){
			count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count!=2){
				sum+=input1[i];
			}
		}
		System.out.println(sum);
	}
}
