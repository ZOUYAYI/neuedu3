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
 * 4、在程序中创建一个Student类型的对象，
 * 并把对象信息保存到d:/io/student.txt文件中
 * ，然后再从文件中把Student对象的信息读出显示在控制台上，
 * Student类的描述如下： [选做题]
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
			System.out.println("输入完成");
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
			//换成取对象出来打印
			System.out.println("读写完成");
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
		//最后为什么还会打出null？
		
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
		return "id是："+id+"\n姓名是："+name+"\n生日是："+birthday+"\n";
	}
}