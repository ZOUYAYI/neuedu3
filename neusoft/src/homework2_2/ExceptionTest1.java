package homework2_2;

import java.util.Scanner;

public class ExceptionTest1 {
//1、编写应用程序，从命令行传入两个整型数作为除数和被除数。
//要求程序中捕获NumberFormatException 异常和ArithmeticException 异常，
//而且无论在哪种情况下，“总是被执行”这句话都会在控制台输出。 [必作题]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入第一个整型数为被除数");
		Scanner in=new Scanner(System.in);
		in.useDelimiter("\n");
		
		String a = in.next();
		String a1=a.substring(0,a.length()-1);
		System.out.println("请输入第二个整型数为除数");
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
			System.out.println("总是被执行");
		}
		
	}
//两个地方有try catch
	
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
