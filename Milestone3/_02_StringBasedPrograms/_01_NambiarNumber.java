package _02_StringBasedPrograms;

public class _01_NambiarNumber {
	public static void main(String[] args) {
		String input1="9880127431";
		char ch[]=input1.toCharArray();
		int sum=0,ret=0;
		String tot="";
		for(int i=0;i<input1.length();i++){
			sum=0;
			int in=Character.getNumericValue(ch[i]);
				if(in%2==1){
					for(int j=i;j<input1.length();j++){
						sum+=Character.getNumericValue(ch[i]);
						if(sum%2==1){
							i++;
						}
						else{
							break;
						}
					}
				}
				if(in%2==0){
					for(int j=i;j<input1.length();j++){
						sum+=Character.getNumericValue(ch[i]);
						if(sum%2==0){
							i++;
						}
						else{
							break;
						}
					}
				}
			tot+=Integer.toString(sum);
		}
		ret=Integer.parseInt(tot);
		System.out.println(ret);
	}
}
