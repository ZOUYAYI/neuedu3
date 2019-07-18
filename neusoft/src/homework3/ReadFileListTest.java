package homework3;

import java.io.File;

public class ReadFileListTest {
/*
 * 1、在本机的磁盘系统中，找一个文件夹，利用File类的提供方法，列出该文件夹中的所有文件的文件名和文件的路径，执行效果如下：[必做题]
路径是xxx的文件夹内的文件有：
 	文件名：abc.txt
	路径名：c:\temp\abc.txt 
	--------------------------------------------
	文件名：def.txt
	路径名：c:\temp\def.txt

 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f =new File("C:\\Users\\ZOE");
		//储存有文件名的list
		String[] filelist =f.list();
		//File fl[] =f.listFiles();
		System.out.println("路径是"+f.getPath()+"的文件夹内的文件有：");
		for(int i=0;i<filelist.length;i++) {
			System.out.println("文件名："+filelist[i]);
			System.out.println("文件路径："+f.getPath()+"\\"+filelist[i]);
		}
//		也可以使用 DirectoryStream目录流
		
	}

}
