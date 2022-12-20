package _04_StringBased02;

public class _01_IdentifyThePossibleWords {
	public static void main(String[] args) {
		String input1="_iber",input2="fiber:liber:filer:fiter:fttre";
		input1=input1.toUpperCase();
		input2=input2.toUpperCase();
		String str[]=input2.split(":");
		String st[]=input1.split("_");
		String tot="";
		for(int i=0;i<str.length;i++) {
			if(str[i].length()==input1.length()) {
				
				for(int j=0;j<st.length;j++) {
					if(st[j].equals(str[i].substring(0,st[j].length()))) {
						if(st[j].length()!=str[i].length()-1) {
						if(st[j+1].equals(str[i].substring(st[j].length()+1))) {
								tot+=str[i]+":";
						}
						}
						else {
							tot+=str[i]+":";
						}
					}
				}
			}
		}
		if(tot.length()!=0) {
			System.out.println(tot.substring(0,tot.length()-1));
		}
		else {
			System.out.println("ERROR-009");
		}
	}
}
