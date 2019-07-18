package homework2_2;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c="ijkl";
		String d="nm";
		compare(c,d);
		
		String a=null;
		String b="nm";
		compare(a,b);
		
	}
//	2、编写一个方法，比较两个字符串。
//	假如其中一个字符串为空，会产生NullPointerException异常，在方法声明中通告该异常，
//	并在适当时候触发异常，然后编写一个程序捕获该异常。 [必作题]

	public static void compare(String a,String b){
		try {
			if(a.charAt(0)>b.charAt(0)) {
				System.out.println("可比较，并且字符串"+a+">"+b);
			}else {
				System.out.println("可比较，并且字符串"+b+">"+a);
			}
		}catch(NullPointerException npe){
			System.out.println("不可比较");
			System.out.println("NullPointerException");
		}
		
	}

}
