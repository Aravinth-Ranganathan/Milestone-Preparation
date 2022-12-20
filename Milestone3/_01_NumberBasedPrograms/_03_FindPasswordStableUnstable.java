package _01_NumberBasedPrograms;

public class _03_FindPasswordStableUnstable {
	public static void main(String[] args) {
		int input1=455,input2=257,input3=3300,input4=110,input5=303;
		String st1=Integer.toString(input1);
		String st2=Integer.toString(input2);
		String st3=Integer.toString(input3);
		String st4=Integer.toString(input4);
		String st5=Integer.toString(input5);
		String str[]= {st1,st2,st3,st4,st5};
		int count=0,co=0;
		int stable=0,unstable=0;
		for(int i=0;i<str.length;i++) {
			
			int st[]=new int[str[i].length()];
			boolean b=false;
			for(int j=0;j<str[i].length();j++) {
				
				count=0;
				for(int k=0;k<str[i].length();k++) {
					if(str[i].charAt(j)==str[i].charAt(k)) {
						count++;
					}
				}
				    st[j]=count;
					System.out.println(st[j]);
			}
			for(int l=0;l<st.length;l++) {
				if(st[0]==st[l]) {
					b=true;
				}
				else {
					b=false;
					break;
				}
			}
			if(b==true) {
				stable+=Integer.parseInt(str[i]);
			}
			else {
				unstable+=Integer.parseInt(str[i]);
			}
		}
		System.out.println(stable);
		System.out.println(unstable);
		int ab=stable-unstable;
		System.out.println("Final:"+ab);
	}
}
