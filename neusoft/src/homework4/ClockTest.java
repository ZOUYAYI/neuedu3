package homework4;

public class ClockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClockContext c =new ClockContext();
		Thread t =new Thread(c);
		t.start();
	}

}
