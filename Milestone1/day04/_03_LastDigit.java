package day04;

import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode3
{

	public int lastDigitOf(int input1){
		// Read only region end
		// Write code here...
		input1=Math.abs(input1);
		return input1%10;
	}
}
public class _03_LastDigit {
	public static void main(String[] args) {
		UserMainCode3 obj=new UserMainCode3();
		System.out.println(obj.lastDigitOf(197));
	}
}
