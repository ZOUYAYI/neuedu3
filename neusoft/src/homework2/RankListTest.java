package homework2;

import java.util.HashSet;
import java.util.Set;

public class RankListTest {
/**
 * 3、在一个列表中存储以下元素：apple,grape,banana,pear
3.1 返回集合中的最大的和最小的元素
3.2 将集合进行排序，并将排序后的结果打印在控制台上 [必做题]

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"apple","grape","banana","pear"};
		rank(s);
		//指地址最大最小
		System.out.println("最大元素为"+s[0]);
		System.out.println("最小元素为"+s[s.length-1]);
	}

public static void rank(String[] s) {
	for(int i =0;i<s.length;i++) {
		for(int j=i;j<s.length;j++) {
			if(s[i].charAt(0)<s[j].charAt(0)) {
				String tempt =s[i];
				s[i]=s[j];
				s[j]=tempt;
				
			}
		}
	}
}
	
	

}
