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

	//1、请使用LinkedList来模拟一个队列(先进先出的特性): [必做题]
	//1.1 拥有放入对象的方法void put(Object o)
//	1.2 取出对象的方法Object get()
//	1.3 判断队列当中是否为空的方法boolean isEmpty()；并且，编写测试代码，验证你的队列是否正确。
	
	
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
