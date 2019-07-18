package homework4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockContext implements Runnable {
/*
 * 4、编写一个计时器，每隔一秒钟，在控制台打印出最新时间。 [必做题] 
 */
	
	public void run() {
		while(true) {
			Date d =new Date();
			SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(sdf.format(d));
		}
	}

	
	
	
}
