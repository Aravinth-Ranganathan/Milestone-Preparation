package day10;

public class _01_2ndWordUpperCase {
	public static void main(String[] args) {
		String input1="Wipro Technology";
		String str[]=input1.split(" ");
		if(str.length>=2){
			System.out.println(str[1].toUpperCase());
		}
		else{
			System.out.println("LESS");
		}
	}
}
