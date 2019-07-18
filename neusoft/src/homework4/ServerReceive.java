package homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceive extends Thread{
	private Socket s=null;
	private BufferedReader br=null;
	public ServerReceive(Socket s) {
		this.s=s;
	}
	
	public void run() {
		while(true) {
			try {
					br=new BufferedReader(new InputStreamReader(s.getInputStream()));
					String str=br.readLine();
					if(s!=null) {
						System.out.println("服务器接收到"+s.getInetAddress().getHostAddress()+"的消息是："+str);
//						if(str.equals("你好")) {
////							ServerSend.str="你不好";
//						}
					}
			} catch (IOException e) {
				// TODO Auto-generated catch block
	//			e.printStackTrace();
			
			}
		}
	}
}
