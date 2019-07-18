package clockin;

import java.io.*;
import java.util.*;

public class DakaInfo implements Serializable{
	private static final long serialVersionUID =9054178535126819091L;
	private Employee e;
	private int id;
	private Date startDate;
	private Date endDate;
	private boolean flag =false;
	private int innum=0;
	private int outnum =0;
//	private FileInputStream fis=null;
//	private FileOutputStream
	public DakaInfo(Employee e){
		this.setE(e);
		this.id=e.getId();
		this.startDate=null;
		this.endDate=null;
//		File f =new File("C:\\Users\\ZOE\\Desktop\\实训文件\\实训课件\\clockin.txt");
//		try {
////			fis =new FileInputStream(f);
//			
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}catch (IOException e1) {
//			e1.printStackTrace();
//		}
		
	}
	
	public void signIn() {
		setFlag(true);
		addInnum();
		this.startDate=new Date();
	}
//	private void setOutNull() {
//		this.endDate=null;
//	}
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void signOut() {
		setFlag(false);
		addOutnum();
		e.addTime();
		this.endDate=new Date();
	}

	public Employee getE() {
		return e;
	}

	public void setE(Employee e) {
		this.e = e;
	}

	public int getId() {
		return id;
	}

	public boolean getFlag() {
		return flag;
	}

	private void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getOutnum() {
		return outnum;
	}

	private void addOutnum() {
		this.outnum+=1;
	}

	public int getInnum() {
		return innum;
	}

	private void addInnum() {
		this.innum +=1;
	}

	
}
