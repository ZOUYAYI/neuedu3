package classFanshe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FansheTest1 {
	public static void main(String[] args) {
		String s="helloworld";
		Class clazz=s.getClass();
		Method m;
		try {
			m = clazz.getMethod("substring", int.class);
			Object o;
			try {
				o = m.invoke(s, 4);
				System.out.println(o);
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
