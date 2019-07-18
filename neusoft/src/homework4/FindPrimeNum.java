package homework4;

public class FindPrimeNum {
/*
 *  1、利用Thread实现，要求多线程求解某范围素数每个线程负责1000范围：
 *  线程1找1-1000；
 *  线程 2 找 1001-2000；
 *  线程 3 找2001-3000。编程程序将每个线程找到的素数及时打印。 [必做题] 
 */
	public static final Object obj=new Object();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPrime f1=new FindPrime();
		FindPrime2 f2 =new FindPrime2();
		FindPrime3 f3 =new FindPrime3();
//		Thread t1=new Thread(f1);
//		Thread t2=new Thread(f2);
//		Thread t3=new Thread(f3);
		f1.start();
		f2.start();
		f3.start();

	}

}
