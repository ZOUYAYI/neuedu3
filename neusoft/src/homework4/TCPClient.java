package homework4;

import java.io.*;
import java.net.*;
import java.util.*;

public class TCPClient {
	static /*
	 * 1����дһ�������˳���ʵ�ֶ�ȡ�ͻ��˷��͹�����һ��������
	 * ����Ϊһ��������֮���ÿո�������ַ�����
	 * ��������������������󣬷�����Ӧ���ַ������ͻ��ˣ�
	 * ������ݸ�ʽ����ȷ���򷵻ش�����Ϣ���Ա�����Ϊ�������� [������]
	 */
	Socket s =null;
	static BufferedWriter bw=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			s=new Socket("10.25.35.39",3334);
			System.out.println("��������������ӡ���");
			System.out.println("������һ�������ÿո�ֿ���");
			Scanner in =new Scanner(System.in);
			String str =in.nextLine();
			bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bw.write(str);
			bw.flush();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(bw!=null) {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(s!=null) {
				try {
					s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
