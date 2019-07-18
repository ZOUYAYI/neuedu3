package classFanshe;

public class FansheTest3 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		UserImp2 u2=new UserImp2();
		Class s=u2.getClass();
		UserService us =(UserService)s.newInstance();
		us.addUser();
	}

}

interface UserService {
public void addUser();
}

class UserImp1 implements UserService{
public void addUser() {
System.out.println("add user by userimp1");
}}

class UserImp2 implements UserService{
public void addUser() {
System.out.println("add user by userimp2");
}}
