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
//	2����дһ���������Ƚ������ַ�����
//	��������һ���ַ���Ϊ�գ������NullPointerException�쳣���ڷ���������ͨ����쳣��
//	�����ʵ�ʱ�򴥷��쳣��Ȼ���дһ�����򲶻���쳣�� [������]

	public static void compare(String a,String b){
		try {
			if(a.charAt(0)>b.charAt(0)) {
				System.out.println("�ɱȽϣ������ַ���"+a+">"+b);
			}else {
				System.out.println("�ɱȽϣ������ַ���"+b+">"+a);
			}
		}catch(NullPointerException npe){
			System.out.println("���ɱȽ�");
			System.out.println("NullPointerException");
		}
		
	}

}
