package _01_NumberBasedPrograms;

public class _01_GeneratedSeriesFindNth {
	public static void main(String[] args) {
		int input1=1,input2=3,input3=6,input4=17;
		int d=input2-input1;
		int e=input3-input2;
		System.out.println(d);
		System.out.println(e);
		int arr[]=new int[input4];
		arr[0]=input1;
		arr[1]=input2;
		arr[2]=input3;
		for(int i=3;i<input4;i++){
			if(i%2!=0){
				arr[i]=d+arr[i-1];
			}
			else{
				arr[i]=e+arr[i-1];
			}
		}
		System.out.println(arr[input4-1]);
	}
}
