package addhomework1;

import java.util.Scanner;

public class countDifferentNumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countDifferentNum();
	}
	//4����һ���ַ��������а��������ַ���Ӣ���ַ��������ַ�����ͳ�ƺʹ�ӡ�������ַ��ĸ����� [ѡ����]
	public static void countDifferentNum() {
		System.out.println("�������ַ���");
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
				//�����ַ�
				chinesenum +=1;
				
			}
			if(input.charAt(i)>= 'a' && input.charAt(i) <= 'z' || input.charAt(i) >= 'A' && input.charAt(i)<= 'Z') {
				//Ӣ����ĸ
				englishgnum+=1;
			}	
		}
		
		System.out.println(input+"������"+chinesenum+"��������ĸ��"+englishgnum+"��Ӣ����ĸ��"+digitnum+"������");
		
	}

}
