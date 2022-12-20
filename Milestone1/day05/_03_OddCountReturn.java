package day05;

public class _03_OddCountReturn {
	public static void main(String[] args) {
		int input1=56,input2=90,input3=45,input4=87,input5=76;
		int count=0;
		int arr[]={input1,input2,input3,input4,input5};
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				count++;
			}
		}
		System.out.println(count);
	}
}
