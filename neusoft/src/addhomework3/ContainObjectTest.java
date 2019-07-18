package addhomework3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ContainObjectTest {
/*
 * 4���ڳ����д���һ��Student���͵Ķ���
 * ���Ѷ�����Ϣ���浽d:/io/student.txt�ļ���
 * ��Ȼ���ٴ��ļ��а�Student�������Ϣ������ʾ�ڿ���̨�ϣ�
 * Student����������£� [ѡ����]
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos =new FileOutputStream("C:\\Users\\ZOE\\test3.txt");
			oos=new ObjectOutputStream(fos);
			
			Student s1 =new Student("001","Zoe","2000-08-20");
			Student s2 =new Student("002","Ivy","1999-12-09");
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.flush();
			System.out.println("�������");
		}catch(FileNotFoundException e) {
			System.out.print(e.getMessage());
		}catch(IOException e) {
			System.out.print(e.getMessage());
		}finally {
			try {
				fos.close();
				oos.close();
			}catch(IOException e) {
				System.out.print(e.getMessage());
			}
		}
		
		FileInputStream fis =null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("C:\\Users\\ZOE\\test3.txt");
			ois=new ObjectInputStream(fis);
			Object c=null;
			while((c=ois.readObject())!=null) {
				System.out.print(c.toString());
			}
			//����ȡ���������ӡ
			System.out.println("��д���");
		}catch(FileNotFoundException e) {
			System.out.print(e.getMessage());
		}catch(IOException e) {
			System.out.print(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				ois.close();
			}catch(IOException e) {
				System.out.print(e.getMessage());
			}
		}
		//���Ϊʲô������null��
		
	}

}

class Student implements Serializable{
	private String id;
	private String name;
	private String birthday;
	
	Student(String id,String name,String birth){
		this.id=id;
		this.name=name;
		this.birthday=birth;
	}
	
	public String toString() {
		return "id�ǣ�"+id+"\n�����ǣ�"+name+"\n�����ǣ�"+birthday+"\n";
	}
}