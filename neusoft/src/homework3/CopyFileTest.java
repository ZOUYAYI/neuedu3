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
// * 2����дһ��java����ʵ���ļ����ƹ��ܣ�Ҫ��d:/io/copysrc.doc�е����ݸ��Ƶ�d:/io/copydes.doc�С� [������]
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
////				System.out.println("�ļ�����");
////				f2.delete();
////				System.out.println("�ļ�ɾ���ɹ�");
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
////			System.out.println("�ļ����Ƴɹ�");
//			if((s=br.readLine())!=null) {
//				bw.write(s);
//				bw.newLine();
//			}
//			System.out.println("�ļ����Ƴɹ�");
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
