package day05;
import java.io.*;
import  java.util.*;


// Read only region start
class UserMainCode6
{

	public int isMultiple(int input1,int input2){
		// Read only region end
		// Write code here...,
		input1=Math.abs(input1);
		if(input1==0 || input2==0){
			return 3;
		}
		else if(input1%input2==0){
			return 2;
		}
		else{
			return 1;
		}
	}
}
public class _01_IsNisTheExactMultipleOfM {
	public static void main(String[] args) {
		UserMainCode6 obj=new UserMainCode6();
		System.out.println(obj.isMultiple(8, 2));
	}
}
