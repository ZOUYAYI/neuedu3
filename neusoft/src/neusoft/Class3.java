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
//			System.out.println("文件存在");
//			f.delete();
//			System.out.println("文件删除成功");
//		}
//		else {
//			try {
//				f.createNewFile();
//			}catch(IOException e) {
//				System.out.println(e.getMessage());
//				e.printStackTrace();
//			}
//			
//			System.out.println("文件名是："+f.getName());
//			System.out.println("文件的路径是："+f.getPath());
//			System.out.println("文件的绝对路径是："+f.getAbsolutePath());
//			System.out.println(f.canRead()?"文件是可读的":"文件是不可读的");
//			System.out.println(f.canWrite()?"文件是可写的":"文件是不可写的");
//			
//		}
		
//		/*监控目标路径 */
//		Path path = Paths.get("C:\\");
//		try {
//			/* 创建文件监控对象 */
//			WatchService watchService = FileSystems.getDefault().newWatchService();
//			/* 注册文件监控的所有事件类型,register:使用手表服务注册此路径所在的文件。
//		StandardWatchEventKinds:标准事件种类 */
//			path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
//					StandardWatchEventKinds.ENTRY_DELETE,
//					StandardWatchEventKinds.ENTRY_MODIFY);
//			/* 循环监测文件 */
//			while (true) {
//		                                    /* WatchKey ：令牌，watchService.take()检索信息 */
//				WatchKey watchKey = watchService.take();
//				/* 迭代触发事件的所有文件 ,WatchEvent一种事件类型，用于识别*/
//				for (WatchEvent<?> event : watchKey.pollEvents())
//					System.out.println(event.context().toString() + " 事件类型："
//							+ event.kind());
//		                                       /*重置此手表键*/
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
		
		//复制的部分功能
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
//		System.out.println("文件复制成功");
		
		
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
//			System.out.println("要读文件不存在");
//			e.printStackTrace();
//		}catch(IOException e) {
//			System.out.println("读取错误");
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
			
			System.out.println("对象序列化…………");
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
//	System.out.println("文件写入成功");
		
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

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

