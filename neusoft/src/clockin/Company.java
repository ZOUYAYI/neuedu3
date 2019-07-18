package clockin;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Company implements Serializable {
	private static final long serialVersionUID =9054178535126819091L;
	/*
	 * Ҫ������Ա��ɾ����Ա��������Ա����ʾԱ����Ϣ 4������
	 * ,������Ҫ����ʾ��Ϣ��
	 * Ҫ���塰���Ա�����������͡���ſ������ڼ�����Ϣ��������2������(��ʹ�÷���)��
	 */
	private ArrayList<Employee> employeeList =new ArrayList<>();//�ǵ�д���ļ���
//	private ArrayList<DakaInfo> dakaList =new ArrayList<>();//�ǵ�д���ļ���
//	private HashMap<Integer,DakaInfo> map =new HashMap<>();
	private HashMap<Integer,HashMap<Integer,DakaInfo>> mapall =null;
	public Company() {
		File file =new File("C:\\Users\\ZOE\\Desktop\\ʵѵ�ļ�\\ʵѵ�μ�\\clockin.txt");
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
//		File file =new File("C:\\Users\\ZOE\\Desktop\\ʵѵ�ļ�\\ʵѵ�μ�\\clockin.txt");
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
			File f = new File("C:\\Users\\ZOE\\Desktop\\ʵѵ�ļ�\\ʵѵ�μ�\\clockin.txt");
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
					System.out.println("Ա��ɾ�����");
				}
			}
			
		}
	}
	
	public void addDakaInfo(Employee e) {
		File file =new File("C:\\Users\\ZOE\\Desktop\\ʵѵ�ļ�\\ʵѵ�μ�\\clockin.txt");
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
						System.out.println("��ʼ���򿨴����ɹ����������ĵ�"+(e.getTime()+1)+"�δ򿨼�¼,Ա��������Ϊ"+e.getName()+"������Ϊ"+e.getId());
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
//							System.out.println("��Ǹ����Ϊ"+last.getId()+"�Ĺ�Ա"+last.getE().getName()+"�ĵ�"+(maxnum+1)+"��ǩ����δǩ����ǩ�˺��ٽ���ǩ��");
//							e.setTime(maxnum);
//						}else {
							e.setTime(maxnum+1);//���ļ�ȡ������һ�δ򿨴�����
//							File file =new File("C:\\Users\\ZOE\\Desktop\\ʵѵ�ļ�\\ʵѵ�μ�\\clockin.txt");
							DakaInfo d =new DakaInfo(e);
//							HashMap<Integer,DakaInfo> map =new HashMap<>();
//							map.put(e.getTime(),d);
//							mapall.put(e.getId(),map);
							mapall.get(e.getId()).put(e.getTime(), d);
							System.out.println("��ʼ���򿨴����ɹ����������ĵ�"+(e.getTime()+1)+"�δ򿨼�¼,Ա��������Ϊ"+e.getName()+"������Ϊ"+e.getId());
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
////						System.out.println("��Ǹ����Ϊ"+last.getId()+"�Ĺ�Ա"+last.getE().getName()+"�ĵ�"+(maxnum+1)+"��ǩ����δǩ����ǩ�˺��ٽ���ǩ��");
////						e.setTime(maxnum);
////					}else {
//						e.setTime(maxnum+1);//���ļ�ȡ������һ�δ򿨴�����
////						File file =new File("C:\\Users\\ZOE\\Desktop\\ʵѵ�ļ�\\ʵѵ�μ�\\clockin.txt");
//						DakaInfo d =new DakaInfo(e);
////						HashMap<Integer,DakaInfo> map =new HashMap<>();
////						map.put(e.getTime(),d);
////						mapall.put(e.getId(),map);
//						mapall.get(e.getId()).put(e.getTime(), d);
//						System.out.println("��ʼ���򿨴����ɹ����������ĵ�"+(e.getTime()+1)+"�δ򿨼�¼,Ա��������Ϊ"+e.getName()+"������Ϊ"+e.getId());
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
		
//		e.setTime(maxnum);//���ļ�ȡ������һ�δ򿨴�����
////		File file =new File("C:\\Users\\ZOE\\Desktop\\ʵѵ�ļ�\\ʵѵ�μ�\\clockin.txt");
//		DakaInfo d =new DakaInfo(e);
////		HashMap<Integer,DakaInfo> map =new HashMap<>();
////		map.put(e.getTime(),d);
////		mapall.put(e.getId(),map);
//		mapall.get(e.getId()).put(e.getTime(), d);
//		System.out.println("��ʼ���򿨴����ɹ����������ĵ�"+(e.getTime()+1)+"�δ򿨼�¼,Ա��������Ϊ"+e.getName()+"������Ϊ"+e.getId());
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
		System.out.println("����������Ҫɾ����Ա����id");
		int employeeId =new Scanner(System.in).nextInt();
		boolean removeflag =false;
		for(int i=0;i<employeeList.size();i++) {
			if(employeeId==employeeList.get(i).getId()) {
				System.out.println("��ϲ��ɾ��Ա���ɹ���Ա���Ĺ�����"+employeeId+"��������"+employeeList.get(i).getName());
				employeeList.remove(i);
				removeflag =true;
			}
		if(!removeflag) {
			System.out.println("��Ǹδ�ҵ��˹��ŵ�Ա����ɾ��Ա��ʧ��");
		}
			
		}
	}
	
//	public void findEmployee(){
//		System.out.println("����������Ҫ���ҵ�Ա���Ĺ���");
//		int employeeId =new Scanner(System.in).nextInt();
//		boolean removeflag =false;
//		for(int i=0;i<employeeList.size();i++) {
//			if(employeeId==employeeList.get(i).getId()) {
//				System.out.println("��ϲ������Ա���ɹ���");
//				System.out.println(employeeList.get(i).toString());
//				removeflag =true;
//			}
//		}
//		if(!removeflag) {
//			System.out.println("��Ǹδ�ҵ��˹��ŵ�Ա��");
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
	public void displayDakaInfo(){//֮����ļ��ж�ȡ
		File file =new File("C:\\Users\\ZOE\\Desktop\\ʵѵ�ļ�\\ʵѵ�μ�\\clockin.txt");
		FileInputStream fis;
		HashMap<Integer,HashMap<Integer,DakaInfo>> map=null;
		try {
			fis = new FileInputStream(file);
			ObjectInputStream ois =new ObjectInputStream(fis);
			Object c=null;
			if((c=ois.readObject())!=null) {//while ����if
				map=(HashMap<Integer,HashMap<Integer,DakaInfo>>)c;
				System.out.println("300��ִ��");
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
						System.out.println("ǩ��ʱ��Ϊ:"+sdf.format(daka.getStartDate()));
					}else {
						System.out.println("ǩ��ʱ��Ϊ:"+"�޼�¼");
					}

					if(daka.getEndDate()!=null) {
						System.out.println("ǩ��ʱ��Ϊ:"+sdf.format(daka.getEndDate()));
					}else {
						System.out.println("ǩ��ʱ��Ϊ:"+"�޼�¼");
					}
					
					System.out.println("�������ĵ�"+(i2+1)+"��ǩ��");
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
