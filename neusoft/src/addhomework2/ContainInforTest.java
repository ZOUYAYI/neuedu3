package addhomework2;

import java.util.HashMap;
import java.util.Map;

public class ContainInforTest {
/**
 * 1、编写一个程序，创建一个 HashMap对象，用于存储银行储户的
 * 信息(其中储户的主要信息有储户的ID，姓名和余额)。
 * 另外，计算并显示其中某个储户的当前余额。 [选做题]

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcount a =new BankAcount("zoe",12);
		BankAcount b =new BankAcount("Lily",13);
		BankAcount c =new BankAcount("Yuki",14);
		Map container =new HashMap();
		container.put(a.getId(), a);
		container.put(b.getId(), b);
		container.put(c.getId(), c);
		System.out.println("id为1的用户的余额是："+((BankAcount)container.get(a.getId())).getBalance());
		
	}

}

class BankAcount{
	private int id;
	private static int ida=0;
	private String name;
	private double balance;
	public BankAcount(String name,double balance) {
		ida+=1;
		setId(ida);
		this.balance=balance;
		this.name=name;
	}
	
	
	private void setId(int ida2) {
		// TODO Auto-generated method stub
		this.id=ida;
	}


	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}


	public int getId() {
		return id;
	}

}
