package addhomework1;

import java.util.Scanner;

public class HuiWenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一串数字判断是否是回文数字：");
		int input =new Scanner(System.in).nextInt();
		if(isHuiWen(input)) {
			System.out.println("是回文");
		}else {
			System.out.println("不是回文");
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
