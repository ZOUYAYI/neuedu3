package homework2;

import java.util.HashSet;
import java.util.Set;

public class RankListTest {
/**
 * 3����һ���б��д洢����Ԫ�أ�apple,grape,banana,pear
3.1 ���ؼ����е����ĺ���С��Ԫ��
3.2 �����Ͻ������򣬲��������Ľ����ӡ�ڿ���̨�� [������]

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"apple","grape","banana","pear"};
		rank(s);
		//ָ��ַ�����С
		System.out.println("���Ԫ��Ϊ"+s[0]);
		System.out.println("��СԪ��Ϊ"+s[s.length-1]);
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
