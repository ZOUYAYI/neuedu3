package makefood;

public abstract class HamStyle {
	private String name;
	private double price;
	private String source;
	
	public HamStyle() {
		
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getSource() {
		return source;
	}
	
	public void make() {
		System.out.println(name+"������������");
	}
	
	public void addSource() {
		System.out.println("���ڸ������Ƭ");
		System.out.println("��������м����"+source);
		System.out.println("��ʼ�決30min");
	}
	
	public void pack() {
		System.out.println("���������");
	}
}
