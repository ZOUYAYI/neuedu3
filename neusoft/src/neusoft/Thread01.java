package neusoft;

public class Thread01 extends Thread{
	String name;
	public Thread01(String name) {
		this.name=name;
	}
	
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("Ïß³Ì"+name+" "+i);
		}
	}
}