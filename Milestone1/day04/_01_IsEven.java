package day04;

import java.io.*;
import  java.util.*;

class UserMainCode
{

	public int isEven(int input1){
		
		if(input1%2==0){
			return 2;
		}
		else{
			return 1;
		}
	}
}
public class _01_IsEven {
	public static void main(String[] args) {
		UserMainCode obj=new UserMainCode();
		System.out.println(obj.isEven(23));
	}
}
