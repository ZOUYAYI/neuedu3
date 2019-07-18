package addhomework1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ChangePeKingTimeToParisAndNewYorkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2019-07-05 23:34:22
		System.out.println("yyyy-MM-dd HH:mm:ss".length());
		System.out.println("2019-07-05 23:34:22".length());
		System.out.println("请输入北京时间（yyyy-MM-dd HH:mm:ss）");
		Scanner in =new Scanner(System.in);
		String inputPekingDate =in.next();
		String inputPekingDate2 =in.next();
//		System.out.println(inputPekingDate.length());
		System.out.println("请问您想要将北京时间转换为巴黎时间还是纽约时间？请输入：\n\t1、巴黎时间\n\t2、纽约时间");
//		System.out.println(inputPekingDate.length());
//		System.out.println(inputPekingDate2.length());
//		System.out.println(inputPekingDate);
//		System.out.println(inputPekingDate2);
		int choose =new Scanner(System.in ).nextInt();
		switch(choose) {
		case(1):
			System.out.println("转换成的巴黎时间为："+ChangePeKingTimeToParis(inputPekingDate+" "+inputPekingDate2).toLocaleString());
			break;
		case(2):
			System.out.println("转换成的纽约时间为："+ChangePeKingTimeToNewYork(inputPekingDate+" "+inputPekingDate2).toLocaleString());
			break;
		}
	}

	//1、巴黎时间比北京时间晚7个小时，纽约时间比北京时间晚12个小时，试编写一程序，根据输入的北京时间输出相应的巴黎和纽约时间。[选做题]
		public static Date ChangePeKingTimeToParis(String s) {
			
			int sub =Integer.valueOf(s.substring(11,13));
			String target =s.replace(s.substring(11,13), Integer.toString(sub+7));
			SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date parisDate;
			try {
				parisDate = sdf.parse(target);
				return parisDate;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
			
		}
		
		public static Date ChangePeKingTimeToNewYork(String s) {
			int sub =Integer.valueOf(s.substring(11,13));
			String target =s.replace(s.substring(11,13), Integer.toString(sub+12));
			SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date NewYorkDate;
			try {
				NewYorkDate = sdf.parse(target);
				return NewYorkDate;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
}
