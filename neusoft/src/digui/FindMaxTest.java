package digui;

public class FindMaxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {657,4,3,32,666,2,543,53,456};
		int max=findMax(list,0,list.length-1);
		System.out.println("最大数为："+max);
	}
	
	public static int findMax(int[] list,int index,int index1) {
		int maxnum=0;
		if(index1==index+1) {
			if(list[index1]>list[index]) {
				maxnum=list[index1];
			}else {
				maxnum=list[index];
				index1--;
			}
		}else {
			findMax(list,index,index1);
		}
		return maxnum;
	}
}
