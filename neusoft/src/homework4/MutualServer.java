package homework4;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MutualServer {
	private static ServerSocket ss =null;
//	private static BufferedReader br=null;
//	private static BufferedWriter bw=null;
//	public static boolean flag =false;
	private static ArrayList<Socket> al=new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
			try {
				ss=new ServerSocket(3349);
				System.out.println("����������!");
				while(true) {
					Socket s =ss.accept();
					al.add(s);
					System.out.println("�ͻ���"+s.getInetAddress().getHostAddress()+"��������!");
					ServerReceive rc=new ServerReceive(s);
					rc.start();
					ServerSend sc =new ServerSend(s);
					sc.start();
				}
//				Socket s =ss.accept();
//				System.out.println("�ͻ���"+s.getInetAddress().getHostAddress()+"��������!");
//				ReceiveClass rc=new ReceiveClass(s);
//				rc.start();
//				SendClass sc =new SendClass(s);
//				sc.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
//				if(ss!=null) {
//					try {
//						ss.close();
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
				
			}
			
			
//			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
//			String str =br.readLine();
//			System.out.println("�ͻ��������Ϣ��"+str);
//			if(br!=null) {
//				try {
//					br.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			//���մӿ���̨�������Ϣ
//			InputStreamReader isr2=new InputStreamReader(System.in); 
//			BufferedReader br2=new BufferedReader(isr2); 
//			//��ӡ�ӿ���̨�������Ϣ
//			System.out.println("����Ҫ���͸��ͻ��˵���Ϣ"); 
//			String response=br2.readLine(); 
//			bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
////			System.out.println("����˶���������Ϣ:");
////			Scanner in=new Scanner(System.in);
////			String str2 =in.nextLine();
//			bw.write(response);
//			bw.flush();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			if(ss!=null) {
//				try {
//					ss.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			
//			if(bw!=null) {
//				try {
//					bw.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			if(br!=null) {
//				try {
//					br.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
		
	}

}
