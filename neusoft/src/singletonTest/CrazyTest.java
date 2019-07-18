package singletonTest;

public class CrazyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton m1=Singleton.getSingleton();
		Singleton m2=Singleton.getSingleton();
		m1.setName("wahahah");
		System.out.println("m1:"+m1.getName());
		System.out.println("m2:"+m2.getName());
		m2.setName("ahhhh");
		System.out.println("m1:"+m1.getName());
		System.out.println("m2:"+m2.getName());
	}
	
}

class Singleton{
	private String name;
	private static class Handler{
		private static final Singleton demo =new Singleton();
	}
	private Singleton() {};
	public static Singleton getSingleton() {
		return Handler.demo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}