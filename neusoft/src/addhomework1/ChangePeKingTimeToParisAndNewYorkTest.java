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
		System.out.println("�����뱱��ʱ�䣨yyyy-MM-dd HH:mm:ss��");
		Scanner in =new Scanner(System.in);
		String inputPekingDate =in.next();
		String inputPekingDate2 =in.next();
//		System.out.println(inputPekingDate.length());
		System.out.println("��������Ҫ������ʱ��ת��Ϊ����ʱ�仹��ŦԼʱ�䣿�����룺\n\t1������ʱ��\n\t2��ŦԼʱ��");
//		System.out.println(inputPekingDate.length());
//		System.out.println(inputPekingDate2.length());
//		System.out.println(inputPekingDate);
//		System.out.println(inputPekingDate2);
		int choose =new Scanner(System.in ).nextInt();
		switch(choose) {
		case(1):
			System.out.println("ת���ɵİ���ʱ��Ϊ��"+ChangePeKingTimeToParis(inputPekingDate+" "+inputPekingDate2).toLocaleString());
			break;
		case(2):
			System.out.println("ת���ɵ�ŦԼʱ��Ϊ��"+ChangePeKingTimeToNewYork(inputPekingDate+" "+inputPekingDate2).toLocaleString());
			break;
		}
	}

	//1������ʱ��ȱ���ʱ����7��Сʱ��ŦԼʱ��ȱ���ʱ����12��Сʱ���Ա�дһ���򣬸�������ı���ʱ�������Ӧ�İ����ŦԼʱ�䡣[ѡ����]
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
