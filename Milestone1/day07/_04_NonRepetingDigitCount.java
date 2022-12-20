package day07;

import java.util.ArrayList;

public class _04_NonRepetingDigitCount {
	public static void main(String[] args) {
		int input1=22256;
		String str=String.valueOf(input1);
		int len=str.length();
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<len;i++) {
			int j=0;
			for(j=0;j<len;j++) {
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					break;
				}
			}
			if(j==len) {
				a.add(i);
			}
		}
		System.out.println(a.size());
	}
}
