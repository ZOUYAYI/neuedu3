package homework4;

import java.io.*;
import java.net.*;
import java.util.*;

public class TCPClient {
	static /*
	 * 1、编写一服务器端程序，实现读取客户端发送过来的一组整数，
	 * 表现为一组数与数之间用空格隔开的字符串。
	 * 对这组整数进行排序处理后，返回相应的字符串给客户端，
	 * 如果数据格式不正确，则返回错误信息，以本机作为服务器。 [必做题]
	 */
	Socket s =null;
	static BufferedWriter bw=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			s=new Socket("10.25.35.39",3334);
			System.out.println("正在与服务器连接……");
			System.out.println("请输入一串整数用空格分开：");
			Scanner in =new Scanner(System.in);
			String str =in.nextLine();
			bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bw.write(str);
			bw.flush();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(bw!=null) {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(s!=null) {
				try {
					s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
