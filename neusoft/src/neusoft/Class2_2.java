package neusoft;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Class2_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		 int i = 0;
//	       String greetings[] = {"Hello World","Hello Dingdang","Hello Kitty"};
//	       while(i<4){
//	          System.out.println(greetings[i]);
//	          i++;
//	       }
		
//		try {
//			int x=0;
//			int y=5/x;
//			
//		}catch(ArithmeticException ae) {
//			System.out.println("ArithmeticException");
//		}catch(Exception e) {
//			System.out.println("Exception");
//		}finally {
//			System.out.println("Finished");
//		}
		
		
		try {
			System.out.println("a=");
			int a =new Scanner(System.in).nextInt();
			System.out.println("b=");
			int b =new Scanner(System.in).nextInt();
			add(a,b);
		}catch(MyException e) {
			System.out.println("输入错误！");
		}
		
//		
//		int num[]= {3,4,2,6};
//		try {
//			for(int i =0;i<num.length;i++) {
//				
//			}
//		}
//		
//		ThrowTest  tt = new ThrowTest();
//		try{
//			tt.createFile("c:/abc.txt");
//		}catch(IOException ie){
//			ie.printStackTrace();
//			throw ie;    //再次抛出
//		}
		 
//		method1();
		
		
	}
	static int[] arr =new int[3];
	public static void method1() {
		method2();
		System.out.println("method1");
	}

	public static void method2() {
		method3();
		System.out.println("method1");
	}
	
	public static void method3() {
		System.out.println(arr[3]);
		System.out.println("method3");
	}

	public static void add(int a,int b)throws MyException{
		if(a<0&&b<0) {
			throw new MyException();
		}else {
			System.out.println(a+b);
		}
	}
	
}

class MyException extends Exception{

}


class ThrowTest{
	public void createFile(String path) throws IOException{
		File f= new File(path);
		try{
			f.createNewFile();
		}catch(IOException ie){
			ie.printStackTrace();
			throw ie;    //再次抛出
		}
	}
}
