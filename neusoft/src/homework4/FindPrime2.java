package homework4;

//public class FindPrime2 implements Runnable{
//	public void run() {
//		synchronized(FindPrimeNum.obj) {
//			for(int i=1001;i<2001;i++) {
////				FindPrimeNum.obj.notify();
//				if(find(i)!=0) {
//					System.out.println(i);
////					try {
////						FindPrimeNum.obj.wait();
////					} catch (InterruptedException e) {
////						// TODO Auto-generated catch block
////						e.printStackTrace();
////					};
//				}else {
//					
//				}
//			}
//		}
//	}
//	
//	public  int  find(int num) {
//		boolean flag =true;
//		for(int j=1;j<num;j++) {
//			if(j!=1&&num%j==0) {
//				flag=false;
//			}
//		}
//		if(flag) {
//			return num;
//		}else {
//			return 0;
//		}
//	}
//}
public class FindPrime2 extends Thread{
	public void run() {
		synchronized(FindPrimeNum.obj) {
			for(int i=1001;i<2001;i++) {
//				FindPrimeNum.obj.notify();
				if(find(i)!=0) {
					System.out.println(i);
//					try {
//						FindPrimeNum.obj.wait();
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					};
				}else {
					
				}
			}
		}
	}
	
	public  int  find(int num) {
		boolean flag =true;
		for(int j=1;j<num;j++) {
			if(j!=1&&num%j==0) {
				flag=false;
			}
		}
		if(flag) {
			return num;
		}else {
			return 0;
		}
	}
}