package _01_StringBased01;

public class _01_FindStringCode {
	public static void main(String[] args) {
		String input1="World Wide Web";
		input1=input1.toLowerCase();
		String full="";
		 String str[]=input1.split(" ");
			int one=0,two=0,tot=0,a=0,b=0;
		   for(int i=0;i<str.length;i++){
			   if(str[i].length()%2==0){
				   a=0;
				   for(int j=0;j<str[i].length()/2;j++){
				   one=str[i].charAt(j)-96;
				   two=str[i].charAt(str[i].length()-j-1)-96;
				   tot=Math.abs(one-two);
				   a+=tot;
			      }
				   b=a;
			   }
			   else {
				   int c=str[i].charAt(str[i].length()/2)-96;
				   a=0;
				   for(int j=0;j<str[i].length()/2;j++){
					   one=str[i].charAt(j)-96;
					   two=str[i].charAt(str[i].length()-j-1)-96;
					   tot=Math.abs(one-two);
					   a+=tot;
				     }
				   b=a+c;
			   }
			   full+=Integer.toString(b);
		  }
		   int la=Integer.parseInt(full);
		   System.out.println(la);
	}
}
