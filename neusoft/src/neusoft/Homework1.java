package neusoft;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Homework1 {
	//�������ڸ�ʽ�ַ�����Ϊ��Ʒ���������ڣ�
	//���뱣���ڣ��죩
	//�����ֹ�����죬����Ʒ���ж�������������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������Ʒ�����ڣ�yyyy-MM-dd��");
		String input1 =new Scanner(System.in).next();
		System.out.println("�������Ʒ�ı�������");
		int input2 =new Scanner(System.in).nextInt();
//		System.out.println("�������������ڣ�yyyy-MM-dd��");
//		String input3 =new Scanner(System.in).next();
		//��ʵ����ֱ��new Date();
		
		Date d3= new Date();
		try {
//			Date d1=(Date)sdf.parse(input1);
			int ord =Integer.valueOf((String) input1.subSequence(8,10));
			System.out.println(input1.subSequence(8,10));
			String target =input1.replace(input1.subSequence(8,10) ,Integer.toString(ord+input2));
			System.out.println(target);
			SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
			Date dtarget=(Date)sdf.parse(target);
			if(dtarget.after(d3)) {
				long num =(dtarget.getTime()-d3.getTime())/86400000;
				System.out.println("����"+num+"�����");
			}else {
				System.out.println("��Ʒ�Ѿ�����");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
