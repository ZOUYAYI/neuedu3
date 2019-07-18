package calss5Socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		ServerSocket ss =new ServerSocket(4447);
//		while(true) {
//			Socket s=ss.accept();
//			DataInputStream dis =new DataInputStream(s.getInputStream());
//			System.out.println(dis.readUTF());
//			System.out.println("Hello,client"+s.getInetAddress()+"."+s.getPort());
//			dis.close();
//			s.close();
//		}
//	}
	
	public static void main(String args[]) {
		ServerSocket ss = null;
		BufferedReader in = null;
		try {
			ss = new ServerSocket(6680);
			System.out.println("����������...");
			Socket s = ss.accept();
			System.out.println("�пͻ����������ӣ�ip��"
					+ s.getInetAddress().getHostAddress());

			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String clientStr = in.readLine();
			System.out.println("����ͻ�����Ϣ��" + clientStr);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (ss != null) {
					ss.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
