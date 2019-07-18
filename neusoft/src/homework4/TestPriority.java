package homework4;

public class TestPriority {
/*
 * 3、编写一个Java程序(包括一个主程序类，一个线程类。
 * 在主程序类中创建2个线程，将其中一个线程的优先级设为10，另一个线程的优先级设为6。
 * 让优先级为10的线程打印200次“线程1正在运行”，优先级为6的线程打印200次“线程2正在运行”。 [选做题] 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoForPriority d1=new DemoForPriority("t1");
		DemoForPriority d2=new DemoForPriority("t2");
		Thread t1=new Thread(d1);
		Thread t2 =new Thread(d2);
		t1.setPriority(10);
		t2.setPriority(6);
		t1.start();
		t2.start();
	}

}
