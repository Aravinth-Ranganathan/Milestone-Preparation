package _01_NumberBasedPrograms;

public class _02_FindResultAfterAlternateAdd_SubOnN {
	public static void main(String[] args) {
		int input1=6,input2=100;
		int a=0,b=0;
		if(input2==1){
			for(int i=0;i<input1;i++){
				a=input1-i;
				if(i%2==0){
					b+=a;
				}else{
					b-=a;
				}
			}
		}
		else{
			for(int i=0;i<input1;i++){
				a=input1-i;
				if(i%2==1){
					b+=a;
				}else{
					if(i==0){
						b+=a;
					}
					else{
						b-=a;
					}
				}
			}
		}
		System.out.println(b);
	}
}
