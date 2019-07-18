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
 * 1����ʼ������Ա����������ӵ�ʵ�����У���ʾ���������Ϣ�ɹ���
2������̨��ʾ��ʾ��Ϣ
----Ա����ϵͳ----
���� 0--------�˳�
���� 1--------ǩ��
���� 2--------ǩ��
���� 3--------�鿴ǩ����Ϣ
��������ִ�еĲ�����
3����������
     1)���� 0 ��ʾ���˳��������̽���;
     2)���� 1 ��ʾ��������ǩ��Ա��ID����������ִ�У�����ID��
δ�����-��ʾ�������ţ�XXX  �򿨳ɹ����������·���2����ʾ��
�Ѵ����-��ʾ���������Ѿ�������ˡ��������·���2����ʾ��
3)���� 2 ��ʾ��������ǩ��Ա��ID����������ִ�У�
����ID(�򿨹��Ŀ���)����ʾ�������ţ�XXX  ǩ�˳ɹ����������·���2����ʾ��
        ����ID(δ�򿨵Ŀ���)����ʾ�������ţ�XXX  ���컹û��ǩ�����޷�ǩ�ˡ��������·���2����ʾ�� 
     4)���� 3 ��ʾ ��ʾ����֮ǰ��ǩ�����͡�ǩ�ˡ�����Ϣ������ʾ����ʱ�䣬�����·���2����ʾ�� Ҫ�������Ա��ֻ��ʾ1�Σ�������¼��ʾ���,
 */
	
/*
 * ������������Main.java��Ҫ��ǩ����ǩ�ˣ��鿴3�����ܣ�
   ǩ����ǩ�˶�Ҫ��������Ϣ�洢��"*:/io/clockin.txt"�ļ��С�
 */
	public static void main(String[] args) throws EOFException {
		com=new Company();
		// TODO Auto-generated method stub
		System.out.println("-------------��ʼ����Ϣ-----------");
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
		System.out.println("----Ա����ϵͳ----");
		boolean flag =true;
		while(flag) {
			System.out.println("���� 0--------�˳�\r\n" + 
					"���� 1--------ǩ��\r\n" + 
					"���� 2--------ǩ��\r\n" + 
					"���� 3--------�鿴ǩ����Ϣ\r\n" + 
					"��������ִ�еĲ�����");
			int choose=new Scanner(System.in).nextInt();
			switch(choose) 
			{
			case(0):System.out.println("�˳��ɹ�");
			flag=false;
			break;
			case(1):
				signIn();
				System.out.println("�Ѿ����·���");
			
			break;
			case(2):
				signOut();
				System.out.println("�Ѿ����·���");
				break;
			case(3):
				display();
				System.out.println("�Ѿ����·���");
				break;
			}
		}
		
		
		
	}
	private static Company com ;
	
	
	
	public static void signIn() {
		System.out.println("����������Ա���ţ�");
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
							System.out.println("����Ϊ "+employeeId+" ��Ա��ǩ���ɹ�,����������ĵ�"+(maxnum+1)+"��ǩ��");
							try {
								File file =new File("C:\\Users\\ZOE\\Desktop\\ʵѵ�ļ�\\ʵѵ�μ�\\clockin.txt");
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
							System.out.println("��Ǹ���Ѿ�ǩ���� ��");
						}
						
					}else {
						com.addDakaInfo(tempt);
						com.getMapall().get(n).get(maxnum+1).signIn();
						try {
							File file =new File("C:\\Users\\ZOE\\Desktop\\ʵѵ�ļ�\\ʵѵ�μ�\\clockin.txt");
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
						System.out.println("����Ϊ "+employeeId+" ��Ա��ǩ���ɹ�,����������ĵ�"+(maxnum+1)+"��ǩ��");
						break;
					}
					
					try {
						File file =new File("C:\\Users\\ZOE\\Desktop\\ʵѵ�ļ�\\ʵѵ�μ�\\clockin.txt");
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
//							System.out.println("����Ϊ "+empolyeeId+" ��Ա��ǩ���ɹ�");
//							findflag=true;
//							break;
//						}
//						
//					}else {
//						System.out.println("���Ѿ������");
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
//						System.out.println("����Ϊ "+empolyeeId+" ��Ա��ǩ���ɹ�");
//						break;
//					}else {
//						System.out.println("���Ѿ������");
//						break;
//					}
//					
//				}
			
//		}
//		try {
//			File file =new File("C:\\Users\\ZOE\\Desktop\\ʵѵ�ļ�\\ʵѵ�μ�\\clockin.txt");
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
		System.out.println("����������Ա���ţ�");
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
							System.out.println("����Ϊ "+employeeId+" ��Ա����δǩ��,����ǩ��");
							break;
						}else {
							last.signOut();
							System.out.println("����Ϊ "+employeeId+" ��Ա��ǩ�˳ɹ�,�������ĵ�"+(maxnum+1)+"��ǩ��");
							break;
						}
						
					}else {
						System.out.println("���Ѿ�ǩ�˹�,�������ĵ�"+(maxnum+2)+"��ǩ��");
						break;
					}
				}
			}
		}
		
		try {
			File file =new File("C:\\Users\\ZOE\\Desktop\\ʵѵ�ļ�\\ʵѵ�μ�\\clockin.txt");
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
//							System.out.println("����Ϊ "+empolyeeId+" ��Ա����δǩ��,����ǩ��");
//						}else {
//							System.out.println("���Ѿ�ǩ�˹�");
//							break;
//						}
//						
//					}else {
//						if(com.getDakaList().get(i).getEndDate()==null) {
//							com.getDakaList().get(i).signOut();
//							System.out.println("����Ϊ "+empolyeeId+" ��Ա��ǩ�˳ɹ�");
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
