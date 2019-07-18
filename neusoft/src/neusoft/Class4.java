package neusoft;

public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dumplings d =new Dumplings();
//		Noodles n=new Noodles();
//		Thread t1 =new Thread(d);
//		Thread t2 =new Thread(n);
//		t1.start();
//		t2.start();
	
//	Thread01 t1 =new Thread01("线程1");
//	Thread01 t2 =new Thread01("线程2");
////	Thread t1 =new Thread(t11);
////	Thread t2 =new Thread(t22);
//	t1.start();
//	t2.start();
//	for(int i=0;i<30;i++) {
//		System.out.println("Main:"+i);
//	}
	
//		TicketRunable runner =new TicketRunable();
//		Thread t1 =new Thread(runner);
//		Thread t2 =new Thread(runner);
//		Thread t3 =new Thread(runner);
//		t1.start();
//		t2.start();
//		t3.start();
//		
//		TicketThread t11 =new TicketThread();
//		TicketThread t22 =new TicketThread();
//		TicketThread t33 =new TicketThread();
//		t11.start();
//		t22.start();
//		t33.start();
	
		
		T1 t1 =new T1();
		T2 t2 =new T2();
		t1.setPriority(Thread.NORM_PRIORITY+2);
		t1.start();
		t2.start();
		try {
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		t1.stopThread();
		
		System.out.println("t1的优先级： "+t1.getPriority());
		System.out.println("t2的优先级： "+t2.getPriority());
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


