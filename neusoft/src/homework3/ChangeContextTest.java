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
 * 3、创建c:/test.txt文件并在其中输入"hello world"
创建一个输入流读取该文件中的文本
并且把小写的l变成大写L再利用输出流写入到d:\test.txt中  [必做题] 
3.1 实现步骤：
3.1.1 在本地硬盘C盘下创建一个文件test.txt
3.1.2 创建一个包含main()方法的类，并在main中编写代码
3.1.3 运行代码并且测试结果
3.2 实现过滤器的功能
效果显示：

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
			System.out.print("从"+f1.getPath()+"中读取的内容是:");
			String d;
			while((d=br.readLine())!=null) {
				System.out.println(d);
			}
//			bw.flush();
//			bw.close();
//			fr2 =new FileReader(f2);
//			br2 =new BufferedReader(fr2);
//			System.out.print("从"+f2.getPath()+"中读取的内容是:");
//			String d2;
//			while((d2=br2.readLine())!=null) {
//				System.out.println(d2);
//			}
//			System.out.println("过滤完成，过滤后文本储存在C:\\Users\\ZOE\\test2.txt中");
			
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
//				System.out.print("从"+f2.getPath()+"中读取的内容是:");
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
			System.out.print("从"+f2.getPath()+"中读取的内容是:");
			String d2;
			while((d2=br2.readLine())!=null) {
				System.out.println(d2);
			}
			System.out.println("读写完毕");
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
