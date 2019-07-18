package classFanshe;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class FansheTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Person p=new Person();
		copy(s,p);
		System.out.println(p.getName());
		
	}
	public static void copy(Object source, Object target) 
	{
		Class clazzs =source.getClass();
		Class clazzt =target.getClass();
		
		Field[] f =clazzs.getDeclaredFields();
		for(Field fs:f) {
			String getter="get"+fs.getName().substring(0,1).toUpperCase()+fs.getName().substring(1);
			String setter="set"+fs.getName().substring(0,1).toUpperCase()+fs.getName().substring(1);
			
			Method ms;
			try {
				ms = clazzs.getMethod(getter, null);
				Object value;
				try {
					value = ms.invoke(source, null);
					Method mt =clazzt.getMethod(setter, value.getClass());
					mt.invoke(target, value);
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		}
	}
}


class Student
{
 private String name="Student";
 private Integer age=12222;
 private Date birthday=new Date();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public Date getBirthday() {
	return birthday;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
}

class Person
{
 private String name="person";
 private Integer age=123;
 private Date birthday=new Date();
 public String getName() {
		return name;
	}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public Date getBirthday() {
	return birthday;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
}