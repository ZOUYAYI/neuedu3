package homework1;

import java.util.Scanner;

public class ComputeEtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ���ַ���");
		String s =new Scanner(System.in).next();
		System.out.println("����ַ����г��֡�e���Ĵ���Ϊ"+computeTimes(s));
	}

	//2����дһ������ʵ�ִ������в�������һ�ַ�����ͳ�Ƹ��ַ������ַ���e�����ֵĴ�������ʶ�㣺String�г��õķ����� [������]
	
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
