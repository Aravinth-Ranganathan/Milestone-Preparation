package _02_ArrayBased;

public class _01_EncodedArray {
	public static void main(String[] args) {
		int input1[]= {7,6,8,16,12,3};
		int input2=6;
		  int arr[]=new int[input2];
			int sum=0,ar=0;
			arr[input2-1]=input1[input2-1];
			int k=1;
			for(int i=input2-2;i>=0;i--){
				arr[i]=input1[i]-arr[input2-k];
				k++;
			}
			for(int i=0;i<input2;i++){
				sum+=arr[i];
			}
			ar=arr[0];
			System.out.println(ar);
			System.out.println(sum);
	}
}
