package homework1;

import java.util.ArrayList;

public class SortRandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort();
	}
	//3、生成十个0~100之间的随机数，放到数组中，然后排序输出。（知识点：Math类取整,获得随机数等） [必做题]

	public static void sort() {
		System.out.println("正在产生十个0-100之间的随机数");
		System.out.println("按照原始顺序排序");
		int[] list1 =new int[10];
//		ArrayList<Integer> ali =new ArrayList<Integer>();
		for(int i =0;i<list1.length;i++) {
			double ran =Math.random();
			int a=(int) (100*ran);
//			ali.add(a);
			list1[i] =(int) (100*ran);
			System.out.println("产生的第"+(i+1)+"个数是"+a);
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
		System.out.println("按照从大到小的顺序排序");
		for(int i =0;i<list1.length;i++) {
			System.out.println("第"+(i+1)+"个数是"+list1[i]);
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
		System.out.println("按照从小到大的顺序排序");
		for(int i =0;i<list1.length;i++) {
			System.out.println("第"+(i+1)+"个数是"+list1[i]);
		}
		
		
		
	}

}
