package homework1;

import java.util.ArrayList;

public class SortRandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort();
	}
	//3������ʮ��0~100֮�����������ŵ������У�Ȼ�������������֪ʶ�㣺Math��ȡ��,���������ȣ� [������]

	public static void sort() {
		System.out.println("���ڲ���ʮ��0-100֮��������");
		System.out.println("����ԭʼ˳������");
		int[] list1 =new int[10];
//		ArrayList<Integer> ali =new ArrayList<Integer>();
		for(int i =0;i<list1.length;i++) {
			double ran =Math.random();
			int a=(int) (100*ran);
//			ali.add(a);
			list1[i] =(int) (100*ran);
			System.out.println("�����ĵ�"+(i+1)+"������"+a);
		}
		
//		int[] list2 =new int[10];
		for(int i=0;i<list1.length;i++) {
			int maxnum =list1[i];
			for(int j =i;j<list1.length;j++) {
				if(list1[j]>list1[i]) {
					int tempt =list1[i];
					list1[i]=list1[j];
					list1[j]=tempt;
				}
			}
		}
		System.out.println();
		System.out.println("���մӴ�С��˳������");
		for(int i =0;i<list1.length;i++) {
			System.out.println("��"+(i+1)+"������"+list1[i]);
		}
		
		
		
		for(int i=0;i<list1.length;i++) {
			int minnum =list1[i];
			for(int j =i;j<list1.length;j++) {
				if(list1[j]<list1[i]) {
					int tempt =list1[i];
					list1[i]=list1[j];
					list1[j]=tempt;
				}
			}
		}
		System.out.println();
		System.out.println("���մ�С�����˳������");
		for(int i =0;i<list1.length;i++) {
			System.out.println("��"+(i+1)+"������"+list1[i]);
		}
		
		
		
	}

}
