package homework4;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;


public class ReceiveClass extends Thread {
	private Socket s=null;
	private BufferedReader br=null;
	
//	private BufferedWriter bw=null;
	public ReceiveClass(Socket s) {
		this.s=s;
		
	}
	
	public void run() {
		while(true) {
		try {
				br=new BufferedReader(new InputStreamReader(s.getInputStream()));
//				System.out.println("------111111111-------");
				
				String s=br.readLine();
				if(s!=null) {
					System.out.println("客户端接收到的消息是："+s);
				}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
//		}finally {
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
//	public void run() {
//		try {
////			bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
////			System.out.println("请输入消息：");
////			Scanner in=new Scanner(System.in);
////			String str=in.nextLine();
////			bw.write(str);
////			bw.flush();
//			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
//			String s=br.readLine();
//			System.out.println("接收到的消息是："+s);
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//		
//		}finally {
////			if(s!=null) {
////				try {
////					s.close();
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
//		
//	}
}
