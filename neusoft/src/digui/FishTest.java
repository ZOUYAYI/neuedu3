package digui;

public class FishTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String Recursion(int n,StringBuffer str) {
		str.append("抱着");
		if(n==0) {
			str.append("我的小鲤鱼");
			
		}else {
			n--;
			Recursion(n,str);
		}
		str.append("的我");
		return str.toString();
	}

}
