package homework1;

import java.util.Scanner;

public class ComputeEtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一串字符串");
		String s =new Scanner(System.in).next();
		System.out.println("这个字符串中出现‘e’的次数为"+computeTimes(s));
	}

	//2、编写一个程序，实现从命令行参数输入一字符串，统计该字符串中字符“e”出现的次数。（识点：String中常用的方法） [必做题]
	
	public static int computeTimes(String s) {
		int num =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='e') {
				num+=1;
			}
		}
		return num;
	}
	
	
	
	
}
