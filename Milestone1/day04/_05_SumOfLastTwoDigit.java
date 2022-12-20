package day04;

import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode5
{

	public int addLastDigits(int input1,int input2){
		// Read only region end
		// Write code here...
		input1=Math.abs(input1);
		input2=Math.abs(input2);
		int a=input1%10;
		int b=input2%10;
		return a+b;
	}
}
public class _05_SumOfLastTwoDigit {
	public static void main(String[] args) {
		UserMainCode5 obj=new UserMainCode5();
		System.out.println(obj.addLastDigits(123, 5465));
	}
}
