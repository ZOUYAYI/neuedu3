package homework2;

import java.util.LinkedList;

public class ModelQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.put("ooo");
		q.put("ppp");
		System.out.println(q.get());
		System.out.println(q.get());
	}

	//1����ʹ��LinkedList��ģ��һ������(�Ƚ��ȳ�������): [������]
	//1.1 ӵ�з������ķ���void put(Object o)
//	1.2 ȡ������ķ���Object get()
//	1.3 �ж϶��е����Ƿ�Ϊ�յķ���boolean isEmpty()�����ң���д���Դ��룬��֤��Ķ����Ƿ���ȷ��
	
	
}

class Queue{
	private LinkedList ls =new LinkedList();
	
	public void put(Object o) {
		ls.add(o);
	}
	
	public Object get() {
		Object tempt =ls.get(0);
		ls.remove(0);
		return tempt;
	}
	
	public boolean isEmpty() {
		return ls.isEmpty();
	}
	
	
}
