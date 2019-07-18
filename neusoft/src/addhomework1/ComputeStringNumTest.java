package addhomework1;

import java.util.Scanner;

public class ComputeStringNumTest {
//3、分别在控制台输入字符串和子字符串，并计算字符串中子字符串出现的次数。 [选做题]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入第一个字符串");
		String s1 =new Scanner(System.in).next();
//		String s1="asdfgsdfghfghj";
		System.out.println("请输入您想要查找出现次数的子字符串");
		String s2 =new Scanner(System.in).next();
//		String s2 ="dfg";
		System.out.println(s2+"在"+s1+"中出现的次数是"+ComputeStringAppearTimes(s1,s2));
	}

	public static int ComputeStringAppearTimes(String s,String subString) {
		int num =0;
		int subLength =subString.length();
		for(int i=0;(i+subLength)<s.length();i++) {
			if(s.substring(i, i+subLength).equals(subString)) {
				num+=1;
			}
		}
		return num;
	}
}
