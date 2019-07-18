package homework4;

import java.io.*;
import java.net.*;
import java.util.*;

public class TCPServer {
/*
 * 1、编写一服务器端程序，实现读取客户端发送过来的一组整数，
 * 表现为一组数与数之间用空格隔开的字符串。
 * 对这组整数进行排序处理后，返回相应的字符串给客户端，
 * 如果数据格式不正确，则返回错误信息，以本机作为服务器。 [必做题]
 */
	private static ServerSocket ss =null;
	private static BufferedReader br =null;
	private static ArrayList<Integer> al =new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ss=new ServerSocket(3334);
			System.out.println("服务器正在运行……");
			Socket s =ss.accept();
			System.out.println("有客户端请求连接，IP:"+s.getInetAddress().getHostAddress());
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			try {
				while(br.read()!=-1) {
					String str =br.readLine();
					String[] list =str.split(" ");
					for(int i=0;i<list.length;i++) {
						al.add(Integer.parseInt(list[i]));					
					}
				}
			}catch(NumberFormatException  e) {
				e.printStackTrace();
			}
			
			for(int i=0;i<al.size();i++) {
				int maxnum =al.get(i);
				for(int j=i;j<al.size();j++) {
					if(al.get(j)>maxnum) {
						int tempt=maxnum;
						maxnum=al.get(i);
						al.set(i,al.get(j));
						al.set(j, maxnum);	
					}
				}
			}
			
			System.out.println("输出客户信息：");
			for(int i=0;i<al.size();i++) {
				System.out.print(al.get(i)+",");
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(ss!=null) {
				try {
					ss.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
