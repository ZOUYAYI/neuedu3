package addhomework2;

import java.util.Scanner;

import homework2.RankListTest;

public class DisrespectCapitalTest {
//2���ӿ���̨�������ɸ����ʣ�����س����������뼯���У�����Щ��������󣨺��Դ�Сд����ӡ������ [ѡ����]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ�����ʣ��ö��Ÿ���");
		String input =new Scanner(System.in).next();
		String[] list =input.split(",");
		String[] list2=new String[list.length];
		for(int i=0;i<list.length;i++) {
			list2[i]=list[i].toLowerCase();
			
		}
		RankListTest.rank(list2);
		for(int i=0;i<list.length;i++) {
			System.out.println(list2[i]);
			
		}
	}

}
