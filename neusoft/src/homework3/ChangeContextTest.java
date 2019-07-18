package homework3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ChangeContextTest {

/*
 * 3������c:/test.txt�ļ�������������"hello world"
����һ����������ȡ���ļ��е��ı�
���Ұ�Сд��l��ɴ�дL�����������д�뵽d:\test.txt��  [������] 
3.1 ʵ�ֲ��裺
3.1.1 �ڱ���Ӳ��C���´���һ���ļ�test.txt
3.1.2 ����һ������main()�������࣬����main�б�д����
3.1.3 ���д��벢�Ҳ��Խ��
3.2 ʵ�ֹ������Ĺ���
Ч����ʾ��

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		FileReader fr2=null;
		FileWriter fw =null;
		FileWriter fw0 =null;
		BufferedReader br =null;
		BufferedReader br2 =null;
		BufferedWriter bw =null;
		try {
			File f1 =new File("C:\\Users\\ZOE\\test1.txt");
			File f2 =new File("C:\\Users\\ZOE\\test2.txt");
			fw0 =new FileWriter(f1);
			fr =new FileReader(f1);
			
			fw0.write("Hello world");
			fw0.close();
			fw =new FileWriter(f2);
//			fr2 =new FileReader(f2);
			br =new BufferedReader(fr);
			bw =new BufferedWriter(fw);
//			br2 =new BufferedReader(fr2);
			int c;
			br.mark(1000);
			while((c=br.read())!=-1) {
				if(c=='l') {
					bw.write('L');
				}else {
					bw.write(c);
				}
			}
			br.reset();
			System.out.print("��"+f1.getPath()+"�ж�ȡ��������:");
			String d;
			while((d=br.readLine())!=null) {
				System.out.println(d);
			}
//			bw.flush();
//			bw.close();
//			fr2 =new FileReader(f2);
//			br2 =new BufferedReader(fr2);
//			System.out.print("��"+f2.getPath()+"�ж�ȡ��������:");
//			String d2;
//			while((d2=br2.readLine())!=null) {
//				System.out.println(d2);
//			}
//			System.out.println("������ɣ����˺��ı�������C:\\Users\\ZOE\\test2.txt��");
			
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				bw.flush();
				br.close();
//				br2.close();
				bw.close();
//				File f2 =new File("C:\\Users\\ZOE\\test2.txt");
//				System.out.print("��"+f2.getPath()+"�ж�ȡ��������:");
//				String d2;
//				while((d2=br2.readLine())!=null) {
//					System.out.println(d2);
//				}
//				br2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		try {
			File f2 =new File("C:\\Users\\ZOE\\test2.txt");
			fr2 =new FileReader(f2);
			br2 =new BufferedReader(fr2);
			System.out.print("��"+f2.getPath()+"�ж�ȡ��������:");
			String d2;
			while((d2=br2.readLine())!=null) {
				System.out.println(d2);
			}
			System.out.println("��д���");
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	

}
