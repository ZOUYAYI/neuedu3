package homework4;

public class TestPriority {
/*
 * 3����дһ��Java����(����һ���������࣬һ���߳��ࡣ
 * �����������д���2���̣߳�������һ���̵߳����ȼ���Ϊ10����һ���̵߳����ȼ���Ϊ6��
 * �����ȼ�Ϊ10���̴߳�ӡ200�Ρ��߳�1�������С������ȼ�Ϊ6���̴߳�ӡ200�Ρ��߳�2�������С��� [ѡ����] 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoForPriority d1=new DemoForPriority("t1");
		DemoForPriority d2=new DemoForPriority("t2");
		Thread t1=new Thread(d1);
		Thread t2 =new Thread(d2);
		t1.setPriority(10);
		t2.setPriority(6);
		t1.start();
		t2.start();
	}

}
