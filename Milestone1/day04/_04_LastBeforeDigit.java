package day04;

import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode4
{

	public int secondLastDigitOf(int input1){
		// Read only region end
		// Write code here...
		input1=Math.abs(input1);
    if(input1>9){
		return input1%100/10;
	}else{
		return -1;
	}
	}
}
public class _04_LastBeforeDigit {
	public static void main(String[] args) {
		UserMainCode4 obj=new UserMainCode4();
		System.out.println(obj.secondLastDigitOf(121546));
	}
}
