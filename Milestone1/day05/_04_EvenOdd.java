package day05;

public class _04_EvenOdd {
	public static void main(String[] args) {
		int input1=56,input2=90,input3=45,input4=87,input5=76;
		String input6="odd";
		input6=input6.toLowerCase();
		int count=0;
		int arr[]={input1,input2,input3,input4,input5};
		if(input6.equals("even")){
			for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count++;
			}
		}
		}
		if(input6.equals("odd")){
			for(int i=0;i<arr.length;i++){
		if(arr[i]%2!=0){
				count++;
			}
		}
		}
		System.out.println(count);
	}
}
