package _02_ArrayBased;

import java.util.Arrays;

public class _03_MostFrequentlyOccuringDigit {
	public static void main(String[] args) {
		int input1[]= {1237,202,666,140};
		int input2=4;
		String str="";
		int count=0,max=0,val=0;
		for(int i=0;i<input2;i++){
			str+=input1[i];
		}
		char arr[]=str.toCharArray();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			//System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++) {
			count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(max<=count) {
				val=arr[i]-48;
				max=count;
			}
		}
		System.out.println("Maximum count: "+max);
		System.out.println("Maximum repeated value:"+val);
	}
}
