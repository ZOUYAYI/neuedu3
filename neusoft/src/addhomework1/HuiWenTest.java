package addhomework1;

import java.util.Scanner;

public class HuiWenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ�������ж��Ƿ��ǻ������֣�");
		int input =new Scanner(System.in).nextInt();
		if(isHuiWen(input)) {
			System.out.println("�ǻ���");
		}else {
			System.out.println("���ǻ���");
		}
	}
	
	public static boolean isHuiWen(int num) {
		String s =Integer.toString(num);
		boolean flag =true;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				flag=false;
				return flag;
			}
		}
		return flag;
	}
}
