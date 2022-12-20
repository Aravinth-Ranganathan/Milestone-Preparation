package day10;

import java.util.Arrays;

public class _04_MostFrequentDigit {
	public static void main(String[] args) {
		int input1=123,input2=456,input3=345,input4=5043;
		String str=Integer.toString(input1)+Integer.toString(input2)+Integer.toString(input3)+Integer.toString(input4);
		int arr[]=new int[str.length()];
		int count=0,max=0,value=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=str.charAt(i)-48;
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(max<=count) {
				max=count;
				value=arr[i];
			}
		}
		System.out.println(value);
	}
}
