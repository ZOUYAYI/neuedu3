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
		System.out.println(name+"正在制作……");
	}
	
	public void addSource() {
		System.out.println("正在给面包切片");
		System.out.println("给面包的中间加上"+source);
		System.out.println("开始烘焙30min");
	}
	
	public void pack() {
		System.out.println("打包进行中");
	}
}
