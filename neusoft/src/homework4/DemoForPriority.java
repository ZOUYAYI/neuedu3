package homework4;

public class DemoForPriority implements Runnable{
	private String name;
	public DemoForPriority(String name){
		this.name=name;
	}
	
	public void run() {
		for(int i=0;i<200;i++) {
			System.out.println("线程"+name+"正在运行");
		}
		
	}
}
