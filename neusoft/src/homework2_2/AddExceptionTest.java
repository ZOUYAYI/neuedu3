package homework2_2;

import java.util.Scanner;

public class AddExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������Ҫ�ж��Ƿ���byte��ʾ���������͵����֣�");
		int i =new Scanner(System.in).nextInt();
		try {
			judgeByte(i);
		}catch(ByteSizeException bse) {
//			System.out.println("ByteSizeException ��������ݲ���byte����");
			bse.printStackTrace();
		}
	}
//	1����дһ�������������ֵ����������Ƿ�Ϊbyte�ĳ���
//	��������ֳ���byte�������ͱ�ʾ�����ķ�Χ���������û��Զ�����쳣ByteSizeException,
//	����ʾ��Ӧ�Ĵ�����Ϣ��֪ʶ�㣺�Զ����쳣�� [ѡ����]
//	����1�������û��Զ����쳣��ByteSizeException
//	����2����main�����б�д�߼�����
//	����3�����в�����

	public static boolean judgeByte(int i)throws ByteSizeException {
		//��֤��������ݷ�Χ��-128~127֮��
		if(i<-128||i>127) {
			throw new ByteSizeException();
		}else {
			return true;
		}
	}
	
}
