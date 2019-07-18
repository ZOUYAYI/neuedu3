package addhomework1;

import java.util.Scanner;

public class MailTestHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(testMail()) {
			System.out.println("恭喜您输入规范");
		}
	}
/**
 * 2、解析一个邮箱地址是否合法，如果合法则打印出用户名部分和该邮箱所属的网站域名，如果邮箱地址不合法则显示不合法的原因    [选做题]
2.1 提示：邮箱地址不合法的因素：
2.1.1邮箱地址中不包含@或.
2.1.2邮箱地址中含有多了@或.
2.1.3邮箱地址中.出现在@的前面
2.1.4用户名里有其他字符
 */
	
	public static boolean testMail() {
		boolean flag =true;
		int atnum =0;
		int dotnum=0;
		System.out.println("请输入您的邮箱地址");
		//判断不包含不合法字符，@的个数，"."存在的位置，用户名应该只含有字母和数字
		
		//!!!设定分隔符useDelimiter
		Scanner in =new Scanner(System.in);
		in.useDelimiter("\n");
		String email =in.next();
		char[] oklist = {'1','2','3','4','5','6','7','8','9','0','q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m','Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M','@','.'};
		//System.out.println(email.charAt(email.length()-1));
		//System.out.println(email.length());
		//千万注意！！in.useDelimiter("\n");之后输入的长度增加了1！！
		for(int i=0;i<(email.length()-1);i++) {
//			System.out.println("循环次数"+(i+1));
			boolean flag2=true;
			if(email.charAt(i)=='@') {
				atnum+=1;
			}
			if(email.charAt(i)=='@'&&email.charAt(i+1)=='.') {
				System.out.println("抱歉@和.不能连续输入，格式错误！");
				return false;
			}
			
			//回车的char值是13
			if(email.charAt(i)=='.'&&email.charAt(i+1)==13) {
				System.out.println("抱歉.不能置于最后输入，格式错误！");
				return false;
			}
			
			if(atnum>1) {
				flag=false;
				System.out.println("出现多于1个的‘@’，输入错误");
				return flag;
			}
			if(email.charAt(i)=='.') {
				dotnum+=1;
			}
			if(dotnum>1) {
				flag=false;
				System.out.println("出现多于1个的‘.’，输入错误");
				return flag;
			}
			for(int j=0;j<oklist.length&&flag2;j++) {
				if(email.charAt(i)==oklist[j]) {
//					System.out.print(oklist[j]);
					flag2=false;
//					System.out.println(flag2);
				}
			}
//			//!!!为什么出来后flag2值未变？？
//			System.out.println(flag2);
//			if(flag2==false) {
//				System.out.println(email.charAt(i));
//			}
			
			if(flag2) {
				System.out.println("输入不在指定范围,出现不合法字符");
				return false;
			}
			
			
		}
		
		if(atnum==0&&dotnum==0) {
			flag=false;
			System.out.println("输入中无“@”或“.”，非法输入");
			return flag;
		}
		if(atnum==0) {
			flag=false;
			System.out.println("输入中无“@”，非法输入");
			return flag;
		}
		
		if(dotnum==0) {
			flag=false;
			System.out.println("输入中无“.”，非法输入");
			return flag;
		}
		String[] slist =email.split("@");
		String sub1=slist[0];
		for(int i=0;i<sub1.length();i++) {
			if(sub1.charAt(i)=='.') {
				flag=false;
				System.out.println("'.'不应该出现在'@'之前");
				return flag;
			}
		}
		
		
		
		
		return flag;
	}
}

