package homework4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SendClass extends Thread {
//	private BufferedWriter bw=null;
//	private DataOutputStream bw=null;
	private PrintWriter bw=null;
	private BufferedReader br=null;
	private Socket s=null;
	public SendClass(Socket s) {
		this.s=s;
	}
	
	public void run() {
		while(true) {
			try {
//					bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
//				bw=new DataOutputStream(s.getOutputStream());
				bw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
//					System.out.println("------2222222222222-------");
	//				bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		//			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		//			String s=br.readLine();
		//			System.out.println("接收到的消息是："+s);
				System.out.println("请输入消息：");
				Scanner in=new Scanner(System.in);
				String str=in.nextLine();
				bw.println(str);
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
	//			e.printStackTrace();
			
			}finally {
//				if(bw!=null) {
//					try {
//						bw.close();
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			if(s!=null) {
//				try {
//					s.close();
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
		}
		}
	}
}
