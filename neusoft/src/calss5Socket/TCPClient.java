package calss5Socket;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {

//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		Socket s =new Socket("10.25.35.39",4447);
//		OutputStream os =s.getOutputStream();
//		DataOutputStream dos =new DataOutputStream(os);
//		dos.writeUTF("Hello server!");
//		dos.flush();
//		dos.close();
//		s.close();
//	}
	
	public static void main(String[] args) {
		Socket s = null;
		BufferedWriter out = null;
		try {
			s = new Socket("127.0.0.1", 6680);
			System.out.println("与服务器端建立连接...");
			System.out.println("客户端输入信息：");

			Scanner sc = new Scanner(System.in);
			String clientStr = sc.nextLine();
			//String clientStr="hello";
			out = new BufferedWriter(
					new OutputStreamWriter(s.getOutputStream()));
			out.write(clientStr);
			out.flush();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (s != null) {
					s.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
