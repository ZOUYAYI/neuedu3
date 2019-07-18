package clockin;

import java.io.Serializable;

public class Employee implements Serializable{
	private static final long serialVersionUID =-2946318785043712537L;
	private int id;
	private String name;
	private static int ida =0;
	private int time=0;
	
	public Employee(String name) {
		this.name=name;
		ida+=1;
		this.id=ida;
	}
	public int getTime() {
		return this.time;
	}
	public void addTime() {
		this.time+=1;
	}
	public void setTime(int time) {
		this.time=time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "员工的工号为："+id+"\n姓名为："+name;
	}
	
	
	
}
