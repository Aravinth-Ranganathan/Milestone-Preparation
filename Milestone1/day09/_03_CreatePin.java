package day09;

import java.util.Arrays;
import java.util.Collections;

public class _03_CreatePin {
	public static void main(String[] args) {
		int input1=123,input2=582,input3=175;
		int a1=input1%10,b1=input2%10,c1=input3%10;
		int a2=input1%100/10,b2=input2%100/10,c2=input3%100/10;
		int a3=input1/100,b3=input2/100,c3=input3/100;
		Integer one[]={a1,b1,c1};
		Integer two[]={a2,b2,c2};
		Integer three[]={a3,b3,c3};
		int onemin=Collections.min(Arrays.asList(one));
		int onemax=Collections.max(Arrays.asList(one));
		int twomin=Collections.min(Arrays.asList(two));
		int twomax=Collections.max(Arrays.asList(two));
		int threemin=Collections.min(Arrays.asList(three));
		int threemax=Collections.max(Arrays.asList(three));
		Integer lastmax[]={onemax,twomax,threemax};
		int max=Collections.max(Arrays.asList(lastmax));
		int Pin=max*1000+threemin*100+twomin*10+onemin;
		System.out.println(Pin);
	}
}
