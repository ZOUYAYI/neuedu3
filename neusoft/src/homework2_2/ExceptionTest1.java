package homework2_2;

import java.util.Scanner;

public class ExceptionTest1 {
//1����дӦ�ó��򣬴������д���������������Ϊ�����ͱ�������
//Ҫ������в���NumberFormatException �쳣��ArithmeticException �쳣��
//������������������£������Ǳ�ִ�С���仰�����ڿ���̨����� [������]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������һ��������Ϊ������");
		Scanner in=new Scanner(System.in);
		in.useDelimiter("\n");
		
		String a = in.next();
		String a1=a.substring(0,a.length()-1);
		System.out.println("������ڶ���������Ϊ����");
		Scanner in2=new Scanner(System.in);
		in2.useDelimiter("\n");
		String b = in2.next();
		String b1=b.substring(0,b.length()-1);
		
		try {
			divide(a1,b1);
		}catch(NumberFormatException nfe) {
			nfe.printStackTrace();
			
			
		}catch(ArithmeticException ae) {
			
		}finally {
			System.out.println("���Ǳ�ִ��");
		}
		
	}
//�����ط���try catch
	
	public static void divide(String a,String b) {
		try {
//			if(a.length()==0||b.length()==0) {
//				throw ArrayIndexOutOfBoundsException;
//			}
			String[] s1=new String[a.length()];
			String[] s2=new String[b.length()];
			String i1 =s1[0];
			String i2 =s2[0];
					
			int a1 = Integer.parseInt(a);
			int b1 = Integer.parseInt(b);
			
			int c=a1/b1;
			System.out.println(0);
		}catch(ArrayIndexOutOfBoundsException aioobe){
			throw aioobe;
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
//			throw ae;
		}catch(NumberFormatException ne) {
			ne.printStackTrace();
//			throw ne;
			
		}catch(Exception e) {
			throw e;
		}
	}
}
