package neusoft;

public class Timer {
	private static int num=0;
	public synchronized void add(String name) {
		num++;
		try {
			Thread.sleep(1);
			
		}catch(InterruptedException e) {
			
		}
		System.out.println(name+",���ǵ�"+num+"��ʹ��Timer���߳�");
		
	}
}
