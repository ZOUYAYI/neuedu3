package addhomework1;

import java.util.Scanner;

public class MailTestHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(testMail()) {
			System.out.println("��ϲ������淶");
		}
	}
/**
 * 2������һ�������ַ�Ƿ�Ϸ�������Ϸ����ӡ���û������ֺ͸�������������վ��������������ַ���Ϸ�����ʾ���Ϸ���ԭ��    [ѡ����]
2.1 ��ʾ�������ַ���Ϸ������أ�
2.1.1�����ַ�в�����@��.
2.1.2�����ַ�к��ж���@��.
2.1.3�����ַ��.������@��ǰ��
2.1.4�û������������ַ�
 */
	
	public static boolean testMail() {
		boolean flag =true;
		int atnum =0;
		int dotnum=0;
		System.out.println("���������������ַ");
		//�жϲ��������Ϸ��ַ���@�ĸ�����"."���ڵ�λ�ã��û���Ӧ��ֻ������ĸ������
		
		//!!!�趨�ָ���useDelimiter
		Scanner in =new Scanner(System.in);
		in.useDelimiter("\n");
		String email =in.next();
		char[] oklist = {'1','2','3','4','5','6','7','8','9','0','q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m','Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M','@','.'};
		//System.out.println(email.charAt(email.length()-1));
		//System.out.println(email.length());
		//ǧ��ע�⣡��in.useDelimiter("\n");֮������ĳ���������1����
		for(int i=0;i<(email.length()-1);i++) {
//			System.out.println("ѭ������"+(i+1));
			boolean flag2=true;
			if(email.charAt(i)=='@') {
				atnum+=1;
			}
			if(email.charAt(i)=='@'&&email.charAt(i+1)=='.') {
				System.out.println("��Ǹ@��.�����������룬��ʽ����");
				return false;
			}
			
			//�س���charֵ��13
			if(email.charAt(i)=='.'&&email.charAt(i+1)==13) {
				System.out.println("��Ǹ.��������������룬��ʽ����");
				return false;
			}
			
			if(atnum>1) {
				flag=false;
				System.out.println("���ֶ���1���ġ�@�����������");
				return flag;
			}
			if(email.charAt(i)=='.') {
				dotnum+=1;
			}
			if(dotnum>1) {
				flag=false;
				System.out.println("���ֶ���1���ġ�.�����������");
				return flag;
			}
			for(int j=0;j<oklist.length&&flag2;j++) {
				if(email.charAt(i)==oklist[j]) {
//					System.out.print(oklist[j]);
					flag2=false;
//					System.out.println(flag2);
				}
			}
//			//!!!Ϊʲô������flag2ֵδ�䣿��
//			System.out.println(flag2);
//			if(flag2==false) {
//				System.out.println(email.charAt(i));
//			}
			
			if(flag2) {
				System.out.println("���벻��ָ����Χ,���ֲ��Ϸ��ַ�");
				return false;
			}
			
			
		}
		
		if(atnum==0&&dotnum==0) {
			flag=false;
			System.out.println("�������ޡ�@����.�����Ƿ�����");
			return flag;
		}
		if(atnum==0) {
			flag=false;
			System.out.println("�������ޡ�@�����Ƿ�����");
			return flag;
		}
		
		if(dotnum==0) {
			flag=false;
			System.out.println("�������ޡ�.�����Ƿ�����");
			return flag;
		}
		String[] slist =email.split("@");
		String sub1=slist[0];
		for(int i=0;i<sub1.length();i++) {
			if(sub1.charAt(i)=='.') {
				flag=false;
				System.out.println("'.'��Ӧ�ó�����'@'֮ǰ");
				return flag;
			}
		}
		
		
		
		
		return flag;
	}
}

