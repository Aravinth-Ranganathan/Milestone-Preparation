package _04_StringBased02;

public class _02_EncodingThreeStrings {
	public static void main(String[] args) {
		String input1="john",input2="johny",input3="janardhaN";
		String str[]={input1,input2,input3};
		String front="",middle="",end="",totf="",totm="",tote="",totee="";
		int len=0;
		for(int i=0;i<str.length;i++){
			len=str[i].length()/3;
			if(str[i].length()%3==1){
				front=str[i].substring(0,len);
				middle=str[i].substring(len,len+len+1);
				end=str[i].substring(len+len+1);
			}
			if(str[i].length()%3==2){
				
				front=str[i].substring(0,len+1);
				middle=str[i].substring(len+1,len+len+1);
				end=str[i].substring(len+len+1);
			}
			if(str[i].length()%3==0){
				front=str[i].substring(0,len);
				middle=str[i].substring(len,len+len);
				end=str[i].substring(len+len);
			}
			
			totf+=front;
			totm+=middle;
			tote+=end+" ";
		}
		for(int j=0;j<tote.length();j++) {
			if(Character.isUpperCase(tote.charAt(j))){
				totee+=tote.toLowerCase().charAt(j);
			}
			else {
				totee+=tote.toUpperCase().charAt(j);
			}
		}
		System.out.println(totf);
		System.out.println(totm);
		System.out.println(totee);
	}
}
