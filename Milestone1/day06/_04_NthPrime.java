package day06;

import java.util.ArrayList;

public class _04_NthPrime {
	public static void main(String[] args) {
		int input1=5;
		int a=0,count=0;
		int arr1[]=new int[1];
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=1;i<=1000;i++){
			count=0;
			for(int j=1;j<i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==1){
				arr.add(i);
			}
		}
//		System.out.println(arr);
//		for(int i=0;i<=1000;i++){
//			if(i==input1-1){
//			arr1[0]=arr.get(i);
//		}
//		}
		System.out.println(arr.get(input1-1));
	}
}
