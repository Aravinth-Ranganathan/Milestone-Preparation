package _02_StringBasedPrograms;

public class _02_UserIdGenerator {
	public static void main(String[] args) {
		String input1="Kumer",input2="Kumar";
		int input3=5612321,input4=2;
		String smallstr="";
		String largestr="";
		String input5=Integer.toString(input3);
		String tote="";
		if(input1.length()>input2.length()){
			smallstr=input2;
			largestr=input1;
		}
		if(input2.length()>input1.length()){
			smallstr=input1;
			largestr=input2;
		}
		if(input1.length()==input2.length()){
				if(input1.toUpperCase().charAt(0)>=input2.toUpperCase().charAt(0)){
					smallstr=input2;
					largestr=input1;
				}
				else{
					smallstr=input1;
					largestr=input2;
				}
		}
		String ft=smallstr.substring(smallstr.length()-1);
		char te=input5.charAt(input4-1);
		char se=input5.charAt(input5.length()-input4);
		String tot=ft+largestr+te+se;
		for(int i=0;i<tot.length();i++) {
			if(Character.isLowerCase(tot.charAt(i))) {
				tote+=tot.toUpperCase().charAt(i);
			}else {
				tote+=tot.toLowerCase().charAt(i);
			}
		}
		System.out.println(tote);
	}
}
