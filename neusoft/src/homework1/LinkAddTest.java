package homework1;

import java.util.Scanner;

public class LinkAddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入第1个数字");
		String s1 =new Scanner(System.in).next();
		System.out.println("请输入第2个数字");
		String s2 =new Scanner(System.in).next();
		System.out.println("这两个数字的和是"+addString(s1,s2));
	}
	
	//1、编写一个程序，实现从命令行参数输入两个字符串类型的数值，并计算输出两个数值的和。 [必做题]
	public static double addString(String s1,String s2) {
		int i1=Integer.valueOf(s1);
		int i2=Integer.valueOf(s2);
		int i3=i1+i2;
		return i3;
	}
	
	
	
}
