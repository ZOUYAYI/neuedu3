package homework4;

import java.io.*;
import java.net.*;
import java.util.*;

public class TCPServer {
/*
 * 1����дһ�������˳���ʵ�ֶ�ȡ�ͻ��˷��͹�����һ��������
 * ����Ϊһ��������֮���ÿո�������ַ�����
 * ��������������������󣬷�����Ӧ���ַ������ͻ��ˣ�
 * ������ݸ�ʽ����ȷ���򷵻ش�����Ϣ���Ա�����Ϊ�������� [������]
 */
	private static ServerSocket ss =null;
	private static BufferedReader br =null;
	private static ArrayList<Integer> al =new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ss=new ServerSocket(3334);
			System.out.println("�������������С���");
			Socket s =ss.accept();
			System.out.println("�пͻ����������ӣ�IP:"+s.getInetAddress().getHostAddress());
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			try {
				while(br.read()!=-1) {
					String str =br.readLine();
					String[] list =str.split(" ");
					for(int i=0;i<list.length;i++) {
						al.add(Integer.parseInt(list[i]));					
					}
				}
			}catch(NumberFormatException  e) {
				e.printStackTrace();
			}
			
			for(int i=0;i<al.size();i++) {
				int maxnum =al.get(i);
				for(int j=i;j<al.size();j++) {
					if(al.get(j)>maxnum) {
						int tempt=maxnum;
						maxnum=al.get(i);
						al.set(i,al.get(j));
						al.set(j, maxnum);	
					}
				}
			}
			
			System.out.println("����ͻ���Ϣ��");
			for(int i=0;i<al.size();i++) {
				System.out.print(al.get(i)+",");
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(ss!=null) {
				try {
					ss.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
