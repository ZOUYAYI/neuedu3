package neusoft;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		File f =new File("C:\\Users\\ZOE\\1.txt");
//		if(f.exists()) {
//			System.out.println("�ļ�����");
//			f.delete();
//			System.out.println("�ļ�ɾ���ɹ�");
//		}
//		else {
//			try {
//				f.createNewFile();
//			}catch(IOException e) {
//				System.out.println(e.getMessage());
//				e.printStackTrace();
//			}
//			
//			System.out.println("�ļ����ǣ�"+f.getName());
//			System.out.println("�ļ���·���ǣ�"+f.getPath());
//			System.out.println("�ļ��ľ���·���ǣ�"+f.getAbsolutePath());
//			System.out.println(f.canRead()?"�ļ��ǿɶ���":"�ļ��ǲ��ɶ���");
//			System.out.println(f.canWrite()?"�ļ��ǿ�д��":"�ļ��ǲ���д��");
//			
//		}
		
//		/*���Ŀ��·�� */
//		Path path = Paths.get("C:\\");
//		try {
//			/* �����ļ���ض��� */
//			WatchService watchService = FileSystems.getDefault().newWatchService();
//			/* ע���ļ���ص������¼�����,register:ʹ���ֱ����ע���·�����ڵ��ļ���
//		StandardWatchEventKinds:��׼�¼����� */
//			path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
//					StandardWatchEventKinds.ENTRY_DELETE,
//					StandardWatchEventKinds.ENTRY_MODIFY);
//			/* ѭ������ļ� */
//			while (true) {
//		                                    /* WatchKey �����ƣ�watchService.take()������Ϣ */
//				WatchKey watchKey = watchService.take();
//				/* ���������¼��������ļ� ,WatchEventһ���¼����ͣ�����ʶ��*/
//				for (WatchEvent<?> event : watchKey.pollEvents())
//					System.out.println(event.context().toString() + " �¼����ͣ�"
//							+ event.kind());
//		                                       /*���ô��ֱ��*/
//				if (!watchKey.reset())
//					return;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		
//		FileInputStream fis =null;
//		File f11  =new File("");
//		try {
//			File f1  =new File("C:\\try");
//			FileInputStream fis1 =new FileInputStream(f1);
//			System.out.print((char)fis1.read()+"\n");
//			//int c =0;
////			while((c=fis.read())!=-1) {
////				System.out.print((char)c);
////			}
////			System.out.print('\n');
//			byte b[] =new byte[fis1.available()];
//			fis1.read(b);
//			int j =0;
//			while(j<b.length) {
//				System.out.print((char)b[j]);
//				j++;
//			}
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}catch(IOException e2) {
//			e2.printStackTrace();
//		}
		
//		try {
//			byte[] bytes= {1,2,3,4,5};
//			ByteArrayInputStream in =new ByteArrayInputStream(bytes);
//			BufferedInputStream bis =new BufferedInputStream(in,2);
//			System.out.print(bis.read()+",");
//			System.out.println("mark");
//			bis.mark(1);
//			System.out.print(bis.read()+",");
//			System.out.print(bis.read()+",");
//			System.out.print("reset");
//			bis.reset();
//		}catch(FileNotFoundException e) {
//			System.out.println(e.getMessage());
//			System.exit(-1);
//			
//		}catch(IOException e) {
//			System.out.println(e.getMessage());
//		}
		
		//���ƵĲ��ֹ���
//		BufferedWriter bw =null;
//		BufferedReader br =null;
//		try {
//			File file =new File("C:\\Users\\ZOE\\1.txt");
//			FileReader fr =new FileReader(file);
//			br =new BufferedReader(fr);
//			FileWriter fw =new FileWriter("C:\\Users\\ZOE\\2.txt");
//			bw=new BufferedWriter(fw);
//			
//			br.mark(100000);
//			System.out.println((char)br.read());
//			System.out.println((char)br.read());
//			
//			System.out.println(br.readLine());
//			br.reset();
//			String str;
//			while((str =br.readLine())!=null) {
//				bw.write(str);
//				bw.newLine();
//			}
//			bw.flush();
//			bw.close();
//			br.close();
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			
//		}catch(IOException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//		
//		System.out.println("�ļ����Ƴɹ�");
		
		
		/*
		 * finally{
		 * 	fis.close();
		 * }
		 */
//		
//		File f =new File("C:\\Users\\ZOE\\1.txt");
//		FileReader fr =null;
//		try {
//			fr =new FileReader(f);
//			int c;
//			while ((c=fr.read())!=-1) {
//				System.out.print((char)c);
//			}
//		}catch(FileNotFoundException e){
//			System.out.println("Ҫ���ļ�������");
//			e.printStackTrace();
//		}catch(IOException e) {
//			System.out.println("��ȡ����");
//			e.printStackTrace();
//		}finally {
//			try {
//				if(fr !=null) {
//					fr.close();
//				}
//				}catch(IOException e) {
//					e.printStackTrace();
//				}
//			}
//		
//		
//		
		
		FileOutputStream fos =null;
		ObjectOutputStream oos =null;
		try {
			fos=new FileOutputStream("C:\\Users\\ZOE\\1.txt");
			oos= new ObjectOutputStream(fos);
			Customer c1 =new Customer("mika",7,"kangfu",200.0);
			Customer c2 =new Customer("kaka",10,"xiaom",2000.0);
			
			System.out.println("�������л���������");
			oos.writeObject(c1);
			oos.writeObject(c2);
			oos.flush();
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(fos!=null) {
					fos.close();
				}
				if(oos!=null) {
					oos.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
//	FileOutputStream fos =null;
//	try {
//		fos =new FileOutputStream("C:\\Users\\ZOE\\1.txt",true);
//		byte[] ch = {'s','b','c','o','m','p','u','t','e','r'};
//		fos.write(ch);
//		
//	}catch(IOException e) {
//		e.printStackTrace();
//	}finally {
//		if(fos!=null) {
//			try {
//				fos.close();
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//			
//		}
//	}
//	
//	System.out.println("�ļ�д��ɹ�");
		
	}	
		
	
}
class Customer implements Serializable {

	String name;
	int age;
	transient String password;
	//String password;
    // double money;
	double money;

	public Customer(String name, int age, String password, double money) {
		this.name = name;
		this.age = age;
		this.password = password;
		this.money = money;
	}

	public String toString() {
		return "name=" + name + " age=" + age + " password=" + password
				+ " money=" + money;

	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

