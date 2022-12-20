package _02_ArrayBased;

public class _02_DecreasingSequence {
	public static void main(String[] args) {
		int input1[]=new int[] {11,8,3,2,1,4,56,5,3,1,89,67,45};
		int count,a=0,max=0;
		boolean b;
		for(int i=0;i<input1.length;i++) {
			count=1;b=true;
			for(int j=i;j<input1.length-1;j++) {
				if(input1[j]>input1[j+1]) {
					count++;
					b=false;
					i++;
				}
				else {
					break;
				}
			}
			if(b==false) {
				a++;
				if(max<count) {
					max=count;
				}
			}
		}
		System.out.println(max);
		System.out.println(a);
	}
}
