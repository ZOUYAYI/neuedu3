package neusoft;

import java.io.File;
import java.io.IOException;

public class Filed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����ļ���4�ַ���
        //ͨ��·����
//        File f1 = new File("F:/test/test1.txt");
//        isEmpty(f1);
//        //Ĭ�ϴ�������ǰ����Ŀ¼��
//        File f2 = new File("test2.txt");
//        isEmpty(f2);
//        //���� parent ·�����ַ����� child ·�����ַ�������һ���� File ʵ��
//        File f3 = new File("C:/test", "test3.txt");
//        isEmpty(f3);
        //���� parent ����·������ child ·�����ַ�������һ���� File ʵ��
        File f = new File("C:/test");
        File f4 = new File(f, "test4.txt");
        isEmpty(f4);
	}
	   private static void isEmpty(File file) {
	        if (!file.exists()) {
	            try {
	                if (file.createNewFile()) {
	                    System.out.println("�����ļ��ɹ�");
	                } else {
	                    System.out.println("�����ļ�ʧ��");
	                }
	            }
	            catch (IOException e) {
	                e.printStackTrace();
	                System.out.println("�����ļ�����;������·��������");
	            }
	        }

	    }

}
