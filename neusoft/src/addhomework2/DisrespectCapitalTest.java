package addhomework2;

import java.util.Scanner;

import homework2.RankListTest;

public class DisrespectCapitalTest {
//2、从控制台输入若干个单词（输入回车结束）放入集合中，将这些单词排序后（忽略大小写）打印出来。 [选做题]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一串单词，用逗号隔开");
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
