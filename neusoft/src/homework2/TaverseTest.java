package homework2;

import java.util.ArrayList;
import java.util.Iterator;

public class TaverseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al =new ArrayList<>();
		for(int i=0;i<5;i++) {
			al.add(i+1);
		}
		//����������
		Iterator<Integer> it =al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		
		al.forEach(i->System.out.print(i+" "));
	}
//2������˳���б�ArrayList�д洢��Ԫ������������1~5������ÿ��Ԫ�أ���ÿ��Ԫ��˳������� [������]

}
