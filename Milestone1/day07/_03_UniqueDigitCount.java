package day07;

import java.util.*;

public class _03_UniqueDigitCount {
	public static void main(String[] args) {
		int input1=123451;
		Set<Integer> arr=new HashSet<Integer>();
		int a=0;
		while(input1!=0){
			a=input1%10;
			arr.add(a);
			input1/=10;
		}
		System.out.println(arr.size());
	}
}
