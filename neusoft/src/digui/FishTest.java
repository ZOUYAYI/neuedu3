package digui;

public class FishTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String Recursion(int n,StringBuffer str) {
		str.append("����");
		if(n==0) {
			str.append("�ҵ�С����");
			
		}else {
			n--;
			Recursion(n,str);
		}
		str.append("����");
		return str.toString();
	}

}
