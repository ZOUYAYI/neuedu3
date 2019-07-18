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
		//遍历方法：
		Iterator<Integer> it =al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		
		al.forEach(i->System.out.print(i+" "));
	}
//2、假设顺序列表ArrayList中存储的元素是整型数字1~5，遍历每个元素，将每个元素顺序输出。 [必做题]

}
