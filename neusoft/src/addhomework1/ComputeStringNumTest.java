package addhomework1;

import java.util.Scanner;

public class ComputeStringNumTest {
//3���ֱ��ڿ���̨�����ַ��������ַ������������ַ��������ַ������ֵĴ����� [ѡ����]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������һ���ַ���");
		String s1 =new Scanner(System.in).next();
//		String s1="asdfgsdfghfghj";
		System.out.println("����������Ҫ���ҳ��ִ��������ַ���");
		String s2 =new Scanner(System.in).next();
//		String s2 ="dfg";
		System.out.println(s2+"��"+s1+"�г��ֵĴ�����"+ComputeStringAppearTimes(s1,s2));
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
