package homework4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client2 {
		private static Socket s=null;
		private static BufferedWriter bw=null;
		private static BufferedReader br=null;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
//			try {
				try {
					
					System.out.println("¿Í»§¶ËÆô¶¯£¡");
//					while(true) {
					//10.25.35.40
					s=new Socket("192.168.43.240",3349);
					SendClass c =new SendClass(s);
					c.start();
					ReceiveClass r =new ReceiveClass(s);
					r.start();
//					}
					
					
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

}
