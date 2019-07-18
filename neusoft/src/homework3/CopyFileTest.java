//package homework3;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class CopyFileTest {
///*
// * 2、编写一个java程序实现文件复制功能，要求将d:/io/copysrc.doc中的内容复制到d:/io/copydes.doc中。 [必做题]
//
// */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
////		FileReader fr =null;
////		FileWriter fw =null;
////		BufferedReader br =null;
////		BufferedWriter bw =null;
//		FileInputStream fis =null;
//		FileOutputStream fos =null;
//		BufferedInputStream bis =null;
//		BufferedOutputStream bos =null;
//		
//		
//		try {
////			fr =new FileReader("C:\\Users\\ZOE\\test1.doc");
////			fw =new FileWriter("C:\\Users\\ZOE\\test2.doc");
////			br =new BufferedReader(fr);
////			bw =new BufferedWriter(fw);
//			File f2 =new File("C:\\Users\\ZOE\\test2.doc");
////			if(f2.exists()) {
////				System.out.println("文件存在");
////				f2.delete();
////				System.out.println("文件删除成功");
////			}
//			fis=new FileInputStream("C:\\Users\\ZOE\\test1.doc");
//			fos=new FileOutputStream(f2);
//			bis=new BufferedInputStream(fis);
//			bos =new BufferedOutputStream(fos);
//			
////			Byte[] b =
////			int fr;
////			if((fr=bis.read())!=-1) {
////				bos.write((char)fr);
////				
////			}
////			System.out.println("文件复制成功");
//			if((s=br.readLine())!=null) {
//				bw.write(s);
//				bw.newLine();
//			}
//			System.out.println("文件复制成功");
//			
//		}catch(FileNotFoundException e) {
//			System.out.print(e.getMessage());
//		}catch(IOException e) {
//			System.out.print(e.getMessage());
//		}finally {
//			try {
////				bos.flush();
////				bos.close();
////				bis.close();
//				bw.flush();
//				br.close();
//				bw.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//			
//		}
//	}
//
//}
