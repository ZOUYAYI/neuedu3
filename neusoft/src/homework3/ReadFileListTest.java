package homework3;

import java.io.File;

public class ReadFileListTest {
/*
 * 1���ڱ����Ĵ���ϵͳ�У���һ���ļ��У�����File����ṩ�������г����ļ����е������ļ����ļ������ļ���·����ִ��Ч�����£�[������]
·����xxx���ļ����ڵ��ļ��У�
 	�ļ�����abc.txt
	·������c:\temp\abc.txt 
	--------------------------------------------
	�ļ�����def.txt
	·������c:\temp\def.txt

 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f =new File("C:\\Users\\ZOE");
		//�������ļ�����list
		String[] filelist =f.list();
		//File fl[] =f.listFiles();
		System.out.println("·����"+f.getPath()+"���ļ����ڵ��ļ��У�");
		for(int i=0;i<filelist.length;i++) {
			System.out.println("�ļ�����"+filelist[i]);
			System.out.println("�ļ�·����"+f.getPath()+"\\"+filelist[i]);
		}
//		Ҳ����ʹ�� DirectoryStreamĿ¼��
		
	}

}
