package clockin;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Company implements Serializable {
	private static final long serialVersionUID =9054178535126819091L;
	/*
	 * 要新增人员、删除人员、查找人员、显示员工信息 4个方法
	 * ,操作后要有提示信息；
	 * 要求定义“存放员工的容器”和“存放考勤日期及打卡信息的容器”2个容器(需使用泛型)；
	 */
	private ArrayList<Employee> employeeList =new ArrayList<>();//记得写进文件中
//	private ArrayList<DakaInfo> dakaList =new ArrayList<>();//记得写进文件中
//	private HashMap<Integer,DakaInfo> map =new HashMap<>();
	private HashMap<Integer,HashMap<Integer,DakaInfo>> mapall =null;
	public Company() {
		File file =new File("C:\\Users\\ZOE\\Desktop\\实训文件\\实训课件\\clockin.txt");
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis = new FileInputStream(file);
			ois =new ObjectInputStream(fis);
			Object c=null;
			if((c=ois.readObject())!=null) {
				mapall=(HashMap<Integer,HashMap<Integer,DakaInfo>>)c;
			}
//			}else {
//				mapall =new HashMap<Integer,HashMap<Integer,DakaInfo>>();
//			}
//			ois.close();
			
		}catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch(java.io.EOFException e){
//			HashMap<Integer,DakaInfo> map =new HashMap<Integer,DakaInfo>();
//			map.put(, value)
			mapall =new HashMap<Integer,HashMap<Integer,DakaInfo>>();
		}
		catch(IOException e1) {
			e1.printStackTrace();
		}catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			try {
				if(ois!=null) {
					ois.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(NullPointerException e) {
				e.printStackTrace();
			}
		}
		FileOutputStream fos =null;
		ObjectOutputStream br =null;
		try {
			fos =new FileOutputStream(file);
			br =new ObjectOutputStream(fos);
			br.writeObject(mapall);
//			br.flush();
//			br.close();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}finally {
			
			try {
				br.close();
				br.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public ArrayList<Employee> getEmployeeList(){
		return this.employeeList;
	}
//	public HashMap<Integer,DakaInfo> getMap(){
//		return map;
//	}
	public void addEmployee(Employee e){
		this.employeeList.add(e);
//		File file =new File("C:\\Users\\ZOE\\Desktop\\实训文件\\实训课件\\clockin.txt");
//		FileInputStream fis;
//		try {
//			fis = new FileInputStream(file);
//			ObjectInputStream ois =new ObjectInputStream(fis);
//			Object c=null;
//			while((c=ois.readObject())!=null) {
//				mapall=(HashMap<Integer,HashMap<Integer,DakaInfo>>)c;
//				
//			}
//			ois.close();
//			
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}catch(IOException e1) {
//			e1.printStackTrace();
//		}catch (ClassNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		Set<Integer> s =mapall.keySet();
		boolean flag1=false;
		for(Integer ss:s) {
			if(ss==e.getId()) {
				flag1=true;
			}
		}
		if(!flag1) {
			HashMap<Integer,DakaInfo> map =new HashMap<>();
			mapall.put(e.getId(),map);
			File f = new File("C:\\Users\\ZOE\\Desktop\\实训文件\\实训课件\\clockin.txt");
			FileOutputStream fos =null;
			ObjectOutputStream oos=null;
			try {
				fos=new FileOutputStream(f);
				oos=new ObjectOutputStream(fos);
				oos.writeObject(mapall);
			}catch(FileNotFoundException e1) {
				e1.printStackTrace();
			}catch(IOException e1) {
				e1.printStackTrace();
			}finally {
				try {
					oos.flush();
					oos.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		}
		
	}
	
	public void removeEmployee(int id) {
		for(int i=0;i<employeeList.size();i++) {
			if(employeeList.get(i)!=null) {
				if(employeeList.get(i).getId()==id) {
					employeeList.remove(i);
					System.out.println("员工删除完毕");
				}
			}
			
		}
	}
	
	public void addDakaInfo(Employee e) {
		File file =new File("C:\\Users\\ZOE\\Desktop\\实训文件\\实训课件\\clockin.txt");
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			ObjectInputStream ois =new ObjectInputStream(fis);
			Object c=null;
			if((c=ois.readObject())!=null) {
				mapall=(HashMap<Integer,HashMap<Integer,DakaInfo>>)c;
				
			}
			ois.close();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Set<Integer> s2 =mapall.keySet();
		Employee tempt=null;
		Integer maxnum=0;
		if(findEmployee(e.getId())) {
			for(Integer n:s2) {
				if(n==e.getId()) {
					if(mapall.get(n).size()==0) {
						mapall.get(n).put(e.getTime(), new DakaInfo(e));
						Set<Integer> s =mapall.get(n).keySet();
						tempt=mapall.get(n).get(0).getE();
						Iterator<Integer> it=s.iterator();
						Integer c;
						while(it.hasNext()) {
							if((c=it.next())>maxnum) {
								maxnum=c;
							}
						}
						DakaInfo last =mapall.get(n).get(maxnum);
						e.setTime(maxnum);
						System.out.println("初始化打卡次数成功，这是他的第"+(e.getTime()+1)+"次打卡记录,员工的姓名为"+e.getName()+"，工号为"+e.getId());
					}else {
						Set<Integer> s =mapall.get(n).keySet();
						tempt=mapall.get(n).get(0).getE();
						Iterator<Integer> it=s.iterator();
						Integer c;
						while(it.hasNext()) {
							if((c=it.next())>maxnum) {
								maxnum=c;
							}
						}
						DakaInfo last =mapall.get(n).get(maxnum);
//						if(last.getInnum()!=last.getOutnum()) {
//							System.out.println("抱歉工号为"+last.getId()+"的雇员"+last.getE().getName()+"的第"+(maxnum+1)+"次签到还未签退请签退后再进行签到");
//							e.setTime(maxnum);
//						}else {
							e.setTime(maxnum+1);//从文件取出最大的一次打卡次数；
//							File file =new File("C:\\Users\\ZOE\\Desktop\\实训文件\\实训课件\\clockin.txt");
							DakaInfo d =new DakaInfo(e);
//							HashMap<Integer,DakaInfo> map =new HashMap<>();
//							map.put(e.getTime(),d);
//							mapall.put(e.getId(),map);
							mapall.get(e.getId()).put(e.getTime(), d);
							System.out.println("初始化打卡次数成功，这是他的第"+(e.getTime()+1)+"次打卡记录,员工的姓名为"+e.getName()+"，工号为"+e.getId());
					}
//					Set<Integer> s =mapall.get(n).keySet();
//					tempt=mapall.get(n).get(0).getE();
//					Iterator<Integer> it=s.iterator();
//					Integer c;
//					while(it.hasNext()) {
//						if((c=it.next())>maxnum) {
//							maxnum=c;
//						}
//					}
//					DakaInfo last =mapall.get(n).get(maxnum);
////					if(last.getInnum()!=last.getOutnum()) {
////						System.out.println("抱歉工号为"+last.getId()+"的雇员"+last.getE().getName()+"的第"+(maxnum+1)+"次签到还未签退请签退后再进行签到");
////						e.setTime(maxnum);
////					}else {
//						e.setTime(maxnum+1);//从文件取出最大的一次打卡次数；
////						File file =new File("C:\\Users\\ZOE\\Desktop\\实训文件\\实训课件\\clockin.txt");
//						DakaInfo d =new DakaInfo(e);
////						HashMap<Integer,DakaInfo> map =new HashMap<>();
////						map.put(e.getTime(),d);
////						mapall.put(e.getId(),map);
//						mapall.get(e.getId()).put(e.getTime(), d);
//						System.out.println("初始化打卡次数成功，这是他的第"+(e.getTime()+1)+"次打卡记录,员工的姓名为"+e.getName()+"，工号为"+e.getId());
						try {
							FileOutputStream fos =new FileOutputStream(file);
							ObjectOutputStream br =new ObjectOutputStream(fos);
							br.writeObject(mapall);
							br.flush();
							br.close();
							
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}catch(IOException e1) {
							e1.printStackTrace();
						}
					//}
				}
			}
		}
		
//		e.setTime(maxnum);//从文件取出最大的一次打卡次数；
////		File file =new File("C:\\Users\\ZOE\\Desktop\\实训文件\\实训课件\\clockin.txt");
//		DakaInfo d =new DakaInfo(e);
////		HashMap<Integer,DakaInfo> map =new HashMap<>();
////		map.put(e.getTime(),d);
////		mapall.put(e.getId(),map);
//		mapall.get(e.getId()).put(e.getTime(), d);
//		System.out.println("初始化打卡次数成功，这是他的第"+(e.getTime()+1)+"次打卡记录,员工的姓名为"+e.getName()+"，工号为"+e.getId());
//		try {
//			FileOutputStream fos =new FileOutputStream(file);
//			ObjectOutputStream br =new ObjectOutputStream(fos);
//			br.writeObject(mapall);
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
	
	public void removeEmployee() {
		System.out.println("请输入您想要删除的员工的id");
		int employeeId =new Scanner(System.in).nextInt();
		boolean removeflag =false;
		for(int i=0;i<employeeList.size();i++) {
			if(employeeId==employeeList.get(i).getId()) {
				System.out.println("恭喜您删除员工成功，员工的工号是"+employeeId+"，姓名是"+employeeList.get(i).getName());
				employeeList.remove(i);
				removeflag =true;
			}
		if(!removeflag) {
			System.out.println("抱歉未找到此工号的员工，删除员工失败");
		}
			
		}
	}
	
//	public void findEmployee(){
//		System.out.println("请输入您想要查找的员工的工号");
//		int employeeId =new Scanner(System.in).nextInt();
//		boolean removeflag =false;
//		for(int i=0;i<employeeList.size();i++) {
//			if(employeeId==employeeList.get(i).getId()) {
//				System.out.println("恭喜您查找员工成功！");
//				System.out.println(employeeList.get(i).toString());
//				removeflag =true;
//			}
//		}
//		if(!removeflag) {
//			System.out.println("抱歉未找到此工号的员工");
//		}
//	}
	
	public boolean findEmployee(int employeeId){
		for(int i=0;i<employeeList.size();i++) {
			if(employeeId==employeeList.get(i).getId()) {
				return true;
			}
		}
		return false;
	}
	
//	public ArrayList<DakaInfo> getDakaList(){
//		return dakaList;
//	}
	public void displayDakaInfo(){//之后从文件中读取
		File file =new File("C:\\Users\\ZOE\\Desktop\\实训文件\\实训课件\\clockin.txt");
		FileInputStream fis;
		HashMap<Integer,HashMap<Integer,DakaInfo>> map=null;
		try {
			fis = new FileInputStream(file);
			ObjectInputStream ois =new ObjectInputStream(fis);
			Object c=null;
			if((c=ois.readObject())!=null) {//while 换成if
				map=(HashMap<Integer,HashMap<Integer,DakaInfo>>)c;
				System.out.println("300行执行");
			}
			ois.close();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Set<Integer> s =map.keySet();
		System.out.println(s);
//		System.out.println(map.get(1).get(0).getId());
//		System.out.println(map.get(2).get(0).getId());
			for(int i1:s) {
				Set<Integer> s2 =map.get(i1).keySet();
//				System.out.println(s2);
				for(int i2:s2) {
					Employee e =map.get(i1).get(i2).getE();
					DakaInfo daka =map.get(i1).get(i2);
					System.out.println(e.toString());
					SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					
					if(daka.getStartDate()!=null) {
						System.out.println("签到时间为:"+sdf.format(daka.getStartDate()));
					}else {
						System.out.println("签到时间为:"+"无记录");
					}

					if(daka.getEndDate()!=null) {
						System.out.println("签退时间为:"+sdf.format(daka.getEndDate()));
					}else {
						System.out.println("签退时间为:"+"无记录");
					}
					
					System.out.println("这是他的第"+(i2+1)+"次签到");
				}
				
			}
	
	}

	public HashMap<Integer,HashMap<Integer,DakaInfo>> getMapall() {
		return mapall;
	}

	public void setMapall(HashMap<Integer,HashMap<Integer,DakaInfo>> mapall) {
		this.mapall = mapall;
	}
}
