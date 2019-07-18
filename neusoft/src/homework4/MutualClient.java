package homework4;

import java.io.*;
import java.net.*;
import java.util.*;

public class MutualClient {
	private static Socket s=null;
	private static BufferedWriter bw=null;
	private static BufferedReader br=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
			try {
				
				System.out.println("客户端启动！");
//				while(true) {
				//10.25.35.40
				s=new Socket("127.0.0.1",3349);
				SendClass c =new SendClass(s);
				c.start();
				ReceiveClass r =new ReceiveClass(s);
				r.start();
//				}
				
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			finally {
//				if(s!=null) {
//					try {
//						s.close();
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//			bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
//			System.out.println("客户端请输入信息:");
//			Scanner in=new Scanner(System.in);
//			String str =in.nextLine();
//			bw.write(str);
//			bw.flush();
//			
//			System.out.println("接收到的服务端发送的信息：");
//			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
//			System.out.println(br.readLine());
//			
//			
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			if(s!=null) {
//				try {
//					s.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
////			if(bw!=null) {
////				try {
////					bw.close();
////				} catch (IOException e) {
////					// TODO Auto-generated catch block
////					e.printStackTrace();
////				}
////			}
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
