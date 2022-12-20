package _02_StringBasedPrograms;

public class _03_MessageControlledRobotMovement {
	public static void main(String[] args) {
		int input1=3,input2=4;
		String input3="2-2-E",input4="R M L M L M R M";
		String s3[]=input3.split("-");
		String s4[]=input4.split("\\s+");
		int a=Integer.parseInt(s3[0]);
		int b=Integer.parseInt(s3[1]);
		String tot="";
		String d=s3[2];
		boolean boo=false;
		for(int i=0;i<s4.length;i++) {
			if(d.equals("E")){
				if(s4[i].equals("R")){
					d="S";
				}
				else if(s4[i].equals("L")){
					d="N";
				}
				else if(s4[i].equals("M")) {
					if(a+1<=input1) {
						a+=1;
					}
					else {
						boo=true;
						break;
					}
				}
			}
			else if(d.equals("W")){
				if(s4[i].equals("R")){
					d="N";
				}
				else if(s4[i].equals("L")){
					d="S";
				}
				else if(s4[i].equals("M")) {
					if(a-1>=0) {
						a-=1;
					}
					else {
						boo=true;
						break;
					}
				}
			}
			else if(d.equals("N")){
				if(s4[i].equals("R")){
					d="E";
				}
				else if(s4[i].equals("L")){
					d="W";
				}
				else if(s4[i].equals("M")) {
					if(b+1<=input2) {
						b+=1;
					}
					else {
						boo=true;
						break;
					}
				}
			}
			else if(d.equals("S")){
				if(s4[i].equals("R")){
					d="W";
				}
				else if(s4[i].equals("L")){
					d="E";
				}
				else if(s4[i].equals("M")) {
					if(b-1>=0) {
						b-=1;
					}
					else {
						boo=true;
						break;
					}
				}
            }
		}
		if(boo){
			tot=String.valueOf(a)+("-")+String.valueOf(b)+("-")+d+("-ER");
		}
		else{
			tot=String.valueOf(a)+("-")+String.valueOf(b)+("-")+d;
        }
		System.out.println(tot);
	}
}
