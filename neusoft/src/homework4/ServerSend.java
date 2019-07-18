package homework4;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerSend extends Thread{
//	private PrintWriter bw=null;
	private PrintWriter bw=null;
//	public static Scanner in=new Scanner(System.in);
	public Scanner in=new Scanner(System.in);
	private Socket s=null;
	public ServerSend(Socket s) {
		this.s=s;
	}
//	public static String str=null;
	public void run() {
		while(true) {
			try {
				
//				System.out.println("++++++++++++");
				bw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
				System.out.println("«Î ‰»Îœ˚œ¢£∫");
				
				String str=in.nextLine();
//				str=in.nextLine();
				System.out.println("-----------"+str);
				bw.println(str);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("baocuo");
//			}
			}finally {
//				if(bw!=null) {
//					try {
//						bw.close();
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//	//					e.printStackTrace();
//					}
//				}
			}
		}
		}

}
