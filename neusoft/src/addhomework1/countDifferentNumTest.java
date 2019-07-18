package addhomework1;

import java.util.Scanner;

public class countDifferentNumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countDifferentNum();
	}
	//4、有一个字符串，其中包含中文字符、英文字符和数字字符，请统计和打印出各个字符的个数。 [选做题]
	public static void countDifferentNum() {
		System.out.println("请输入字符串");
		String input =new Scanner(System.in).next();
		int digitnum =0;
		int englishgnum =0;
		int chinesenum =0;
		for(int i =0;i<input.length();i++) {
			if(Character.isDigit(input.charAt(i))) {
				digitnum+=1;
			}
			
//			if(Character.isLetter(input.charAt(i))) {
//				englishnum+=1;
//			}
			if(input.charAt(i) >= 0x0391 && input.charAt(i) <= 0xFFE5){
				//中文字符
				chinesenum +=1;
				
			}
			if(input.charAt(i)>= 'a' && input.charAt(i) <= 'z' || input.charAt(i) >= 'A' && input.charAt(i)<= 'Z') {
				//英文字母
				englishgnum+=1;
			}	
		}
		
		System.out.println(input+"里面有"+chinesenum+"个中文字母，"+englishgnum+"个英文字母和"+digitnum+"个数字");
		
	}

}
