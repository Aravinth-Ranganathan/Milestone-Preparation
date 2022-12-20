package day07;

public class _04_NonRepetingDigitCount1 {
	public static void main(String[] args) {
		int a=2295;
		String str=Integer.toString(a);
		char ch[]=str.toCharArray();
		int count=0,o=0;
		for(int i=0;i<ch.length;i++) {
			count=0;
			char ab=ch[i];
			for(int j=0;j<ch.length;j++) {
				if(ab==ch[j]) {
					count++;
					ch[j]='\u0000';
				}
			}
			if(count==1) {
				o++;
			}
		}
		System.out.println(o);
	}
}
