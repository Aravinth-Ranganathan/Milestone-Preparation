package day04;

import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode1
{

	public int isOdd(int input1){
		// Read only region end
		// Write code here...
		if(input1%2!=0){
			return 2;
		}
		else{
			return 1;
		}
	}
}
public class _02_IsOdd {
	public static void main(String[] args) {
		UserMainCode1 obj=new UserMainCode1();
		System.out.println(obj.isOdd(23));
	}
}
