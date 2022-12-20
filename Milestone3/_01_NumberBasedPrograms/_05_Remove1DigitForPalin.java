package _01_NumberBasedPrograms;

public class _05_Remove1DigitForPalin {
	public static void main(String[] args) {
		int input1=23515362;
		  String str=Integer.toString(input1);
			StringBuilder sb=new StringBuilder(str);
			sb.reverse();
			String s=sb.toString();
			int count=0,a=0;
			if(str.equals(s)){
				System.out.println("-1");
			}
			else{
				for(int i=0;i<str.length();i++){
					count=0;
					for(int j=0;j<str.length();j++){
						if(str.charAt(i)==str.charAt(j)){
							count++;
						}
					}
					if(count%2==1 && (i!=str.length()/2)){
						a=str.charAt(i)-48;			
					}
				}
				System.out.println(a);
			}
	}
}
