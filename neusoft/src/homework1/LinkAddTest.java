package homework1;

import java.util.Scanner;

public class LinkAddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������1������");
		String s1 =new Scanner(System.in).next();
		System.out.println("�������2������");
		String s2 =new Scanner(System.in).next();
		System.out.println("���������ֵĺ���"+addString(s1,s2));
	}
	
	//1����дһ������ʵ�ִ������в������������ַ������͵���ֵ�����������������ֵ�ĺ͡� [������]
	public static double addString(String s1,String s2) {
		int i1=Integer.valueOf(s1);
		int i2=Integer.valueOf(s2);
		int i3=i1+i2;
		return i3;
	}
	
	
	
}
