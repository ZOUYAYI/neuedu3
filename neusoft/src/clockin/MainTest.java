package clockin;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
public class MainTest {
/*
 * 1：初始化几个员工的数据添加到实体类中，提示：“添加信息成功”
2：控制台显示提示信息
----员工打卡系统----
输入 0--------退出
输入 1--------签到
输入 2--------签退
输入 3--------查看签到信息
请输入想执行的操作：
3：操作输入
     1)输入 0 显示“退出”，进程结束;
     2)输入 1 显示“请输入签到员工ID：”，继续执行，输入ID后，
未打过卡-提示：“卡号：XXX  打卡成功”，并重新返回2的提示；
已打过卡-提示：“今天已经打过卡了”，并重新返回2的提示；
3)输入 2 显示“请输入签到员工ID：”，继续执行，
输入ID(打卡过的卡号)后，提示：“卡号：XXX  签退成功”，并重新返回2的提示；
        输入ID(未打卡的卡号)后，提示：“卡号：XXX  今天还没有签到，无法签退”，并重新返回2的提示； 
     4)输入 3 显示 显示所有之前“签到”和“签退”的信息，并显示操作时间，并重新返回2的提示； 要求操作的员工只显示1次，操作记录显示多次,
 */
	
/*
 * 建立主方法类Main.java，要有签到，签退，查看3个功能；
   签到和签退都要将操作信息存储到"*:/io/clockin.txt"文件中。
 */
	public static void main(String[] args) throws EOFException {
		com=new Company();
		// TODO Auto-generated method stub
		System.out.println("-------------初始化信息-----------");
		Employee e1 =new Employee("Zoe");
		Employee e2 =new Employee("Ivy");
		Employee e3 =new Employee("cece");
		com.addEmployee(e1);
		com.addEmployee(e2);
		com.addDakaInfo(e1);
		com.addDakaInfo(e2);
		com.addEmployee(e3);
		com.removeEmployee(e3.getId());
		com.addDakaInfo(e3);
		System.out.println("----员工打卡系统----");
		boolean flag =true;
		while(flag) {
			System.out.println("输入 0--------退出\r\n" + 
					"输入 1--------签到\r\n" + 
					"输入 2--------签退\r\n" + 
					"输入 3--------查看签到信息\r\n" + 
					"请输入想执行的操作：");
			int choose=new Scanner(System.in).nextInt();
			switch(choose) 
			{
			case(0):System.out.println("退出成功");
			flag=false;
			break;
			case(1):
				signIn();
				System.out.println("已经重新返回");
			
			break;
			case(2):
				signOut();
				System.out.println("已经重新返回");
				break;
			case(3):
				display();
				System.out.println("已经重新返回");
				break;
			}
		}
		
		
		
	}
	private static Company com ;
	
	
	
	public static void signIn() {
		System.out.println("请输入您的员工号：");
		int employeeId =new Scanner(System.in).nextInt();
//		Set<Integer> s =com.getMap().keySet();
		Set<Integer> s2 =com.getMapall().keySet();
		Employee tempt=null;
		Integer maxnum=0;
		if(com.findEmployee(employeeId)) {
			for(Integer n:s2) {
				if(n==employeeId) {
					Set<Integer> s =com.getMapall().get(n).keySet();
					tempt=com.getMapall().get(n).get(0).getE();
					Iterator<Integer> it=s.iterator();
					
					Integer c;
					while(it.hasNext()) {
						if((c=it.next())>maxnum) {
							maxnum=c;
						}
					}
					DakaInfo last =com.getMapall().get(n).get(maxnum);
					if(last.getOutnum()==0) {
						if(last.getInnum()==0) {
							last.signIn();
							System.out.println("工号为 "+employeeId+" 的员工签到成功,这是您今天的第"+(maxnum+1)+"次签到");
							try {
								File file =new File("C:\\Users\\ZOE\\Desktop\\实训文件\\实训课件\\clockin.txt");
								FileOutputStream fos =new FileOutputStream(file);
								ObjectOutputStream br =new ObjectOutputStream(fos);
								br.writeObject(com.getMapall());
								br.flush();
								br.close();
								
							} catch (FileNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}catch(IOException e1) {
								e1.printStackTrace();
							}
							break;
						}else {
							System.out.println("抱歉您已经签过到 ！");
						}
						
					}else {
						com.addDakaInfo(tempt);
						com.getMapall().get(n).get(maxnum+1).signIn();
						try {
							File file =new File("C:\\Users\\ZOE\\Desktop\\实训文件\\实训课件\\clockin.txt");
							FileOutputStream fos =new FileOutputStream(file);
							ObjectOutputStream br =new ObjectOutputStream(fos);
							br.writeObject(com.getMapall());
							br.flush();
							br.close();
							
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}catch(IOException e1) {
							e1.printStackTrace();
						}
						System.out.println("工号为 "+employeeId+" 的员工签到成功,这是您今天的第"+(maxnum+1)+"次签到");
						break;
					}
					
					try {
						File file =new File("C:\\Users\\ZOE\\Desktop\\实训文件\\实训课件\\clockin.txt");
						FileOutputStream fos =new FileOutputStream(file);
						ObjectOutputStream br =new ObjectOutputStream(fos);
						br.writeObject(com.getMapall());
						br.flush();
						br.close();
						
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}catch(IOException e1) {
						e1.printStackTrace();
					}
						
				}
			}
		}
			
			
			
//			boolean findflag=false;
//			Employee tempt=null;
//			for(Integer m:s) {
//				if(com.getMap().get(m).getId()==empolyeeId) {
//					tempt=com.getMap().get(m).getE();
//					if(com.getMap().get(m).getFlag()==false) {
//						if(com.getMap().get(m).getOutnum()==0) {
//							com.getMap().get(m).signIn();
//							System.out.println("工号为 "+empolyeeId+" 的员工签到成功");
//							findflag=true;
//							break;
//						}
//						
//					}else {
//						System.out.println("您已经打过卡");
//						break;
//					}
//					
//				}
//			}
//			
//			if(!findflag) {
//				com.addDakaInfo(tempt);
//			}
			
//				if(com.getDakaList().get(i).getId()==empolyeeId) {
//					if(com.getDakaList().get(i).getFlag()==false) {
//						com.getDakaList().get(i).signIn();
//						System.out.println("工号为 "+empolyeeId+" 的员工签到成功");
//						break;
//					}else {
//						System.out.println("您已经打过卡");
//						break;
//					}
//					
//				}
			
//		}
//		try {
//			File file =new File("C:\\Users\\ZOE\\Desktop\\实训文件\\实训课件\\clockin.txt");
//			FileOutputStream fos =new FileOutputStream(file);
//			ObjectOutputStream br =new ObjectOutputStream(fos);
//			br.writeObject(com.getMapall());
//			br.flush();
//			br.close();
//			
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}catch(IOException e1) {
//			e1.printStackTrace();
//		}
	}
	
	
	public static void signOut() {
		System.out.println("请输入您的员工号：");
		int employeeId =new Scanner(System.in).nextInt();
		Set<Integer> s2 =com.getMapall().keySet();
		Employee tempt=null;
		Integer maxnum=0;
		if(com.findEmployee(employeeId)) {
			for(Integer n:s2) {
				if(n==employeeId) {
					Set<Integer> s =com.getMapall().get(n).keySet();
					tempt=com.getMapall().get(n).get(0).getE();
					Iterator<Integer> it=s.iterator();
					
					Integer c;
					while(it.hasNext()) {
						if((c=it.next())>maxnum) {
							maxnum=c;
						}
					}
					DakaInfo last =com.getMapall().get(n).get(maxnum);
					if(last.getOutnum()==0) {
						if(last.getInnum()==0) {
							System.out.println("工号为 "+employeeId+" 的员工还未签到,请先签到");
							break;
						}else {
							last.signOut();
							System.out.println("工号为 "+employeeId+" 的员工签退成功,这是您的第"+(maxnum+1)+"次签退");
							break;
						}
						
					}else {
						System.out.println("您已经签退过,这是您的第"+(maxnum+2)+"次签到");
						break;
					}
				}
			}
		}
		
		try {
			File file =new File("C:\\Users\\ZOE\\Desktop\\实训文件\\实训课件\\clockin.txt");
			FileOutputStream fos =new FileOutputStream(file);
			ObjectOutputStream br =new ObjectOutputStream(fos);
			br.writeObject(com.getMapall());
			br.flush();
			br.close();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}
	}
//		if(com.findEmployee(empolyeeId)) {
//			for(int i =0;i<com.getDakaList().size();i++) {
//				if(com.getDakaList().get(i).getId()==empolyeeId) {
//					if(com.getDakaList().get(i).getFlag()==false) {
//						if(com.getDakaList().get(i).getOutnum()==com.getDakaList().get(i).getInnum()) {
//							System.out.println("工号为 "+empolyeeId+" 的员工还未签到,请先签到");
//						}else {
//							System.out.println("您已经签退过");
//							break;
//						}
//						
//					}else {
//						if(com.getDakaList().get(i).getEndDate()==null) {
//							com.getDakaList().get(i).signOut();
//							System.out.println("工号为 "+empolyeeId+" 的员工签退成功");
//							break;
//						}
//					}
//					
//				}
//			}
//		}
	
	
	public static void display() throws EOFException {
		com.displayDakaInfo();
	}

}
