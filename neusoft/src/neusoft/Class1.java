package neusoft;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=10;
//		int a2=10;
//		System.out.println(a1==a2);
		Integer b1 =10;
//		Integer b2=10;
//		System.out.println(b1==b2);
//		Integer c1 =new Integer(10);
//		Integer c2 =new Integer(10);
//		System.out.println(c1==c2);
//		int A =65;
//		System.out.println(5+6+'A');
//		System.out.println(5+6+"A");
//		System.out.println(5+"A"+6);
//		String d1= "hello";
//		String d2 =new String("hello");
//		System.out.println(d1==d2);
//		System.out.println(d1.equals(d2));
//		Integer dd =Integer.valueOf(a1);
//		System.out.println(a1==b1);
//		System.out.println(dd==a1);
////		String i ="1,2,3,4";
////		String[] array =i.split(",");
////		System.out.println(i.split(","));
//		int i1=1234567;
//		int i2=1234567;
//		String s1 =new String("123234567890");
//		String s2="123234567890";
//		System.out.println(i1==i2);
//		System.out.println(s1.equals(s2));
//		
//	System.out.println("输入的手机号：");
//	int num=new Scanner(System.in).nextInt();
//	//将输入的int包装为Integer再转换成String类型
//	String input =Integer.toString(num);
//	String i =input.replace(input.substring(3, 6), "****");
//	System.out.println("输出的手机号："+i);
//	//因为String是不可变的
////	System.out.println(input);
//	System.out.println("      123       ".trim());
//	String k =i.concat("34567b bnjkl");
//	System.out.println(k);
//	StringBuffer sb =new StringBuffer();
//	sb.append(i);
//	System.out.println(sb);
//	sb.append(input);
//	System.out.println(sb);
	
	
	int a =2;
	int b =3;
	int c =4;
	
	int p =a+b+c;
	double totalInside =p*(p-a)*(p-b)*(p-c);
	//要转换成double才能使用Math.sqrt()
	double s =Math.sqrt(totalInside);
	System.out.println(s);
	String l="fg jkFTYUJKMNBGghln";
	for(int i=0;i<l.length();i++) {
		char o =l.toLowerCase().charAt(i);
		System.out.println(o);
	}
	System.out.println(l.equalsIgnoreCase("fg jkFTYUJKMnBgghln"));
	System.out.println(l.indexOf('g',2));
	System.out.println(l.lastIndexOf('g'));
	String o1="2000-8-20 12:34:22";
	String o2="2000-999-21 18:34:22";
//	System.out.println(max(o1,o2).toLocaleString());
	System.out.println(max(o1,o2).toLocaleString());
	}

	public static Date max(String date1,String date2) {
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d1;
		Date d2;
		try {
			d1 =sdf.parse(date1);
			d2 =sdf.parse(date2);
			int flag = d1.compareTo(d2);
//			if(flag<0) {
//				return d2;
//			}else if(flag ==0) {
//				return d1;
//			}else if(flag>0) {
//				return d1;
//			}
			
			if(d1.after(d2)) {
				return d1;
			}else {
				return d2;
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	
}
