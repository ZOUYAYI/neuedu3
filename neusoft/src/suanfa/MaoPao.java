package suanfa;

public class MaoPao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {90,7,56,7777,34,24566};
//		rank3(list);
//		for(int i=0;i<list.length;i++) {
//			System.out.println(list[i]);
//		}
		searchNum(list,888);
		
	}
	
	public static void rankit(int[] list) {
		for(int i=0;i<list.length;i++) {
			for(int j=0;j<list.length-i-1;j++) {
				int num;
				if(list[j]>list[j+1]) {
					num=list[j+1];
					list[j+1]=list[j];
					list[j]=num;
				}
			}
		}
	}
	
	//插入排序
	public static void rank2(int[] list) {
		for(int i=0;i<list.length;i++) {
			int min=list[i];
			for(int j=i;j<list.length;j++) {
				if(list[j]<min) {
					min=list[j];
					list[j]=list[i];
					list[i]=min;
				}
			}
		}
	}
	//插入排序
	public static void rank3(int[] list) {
		for(int i=1;i<list.length;i++) {
			for(int j=0;j<i;j++) {
				if(list[j]>list[i]) {
					insertNum(list,i,j);
					break;
				}
			}
		}
	}
	public static void insertNum(int[] list,int numindex,int place) {
		int a=list[numindex];
		for(int i=numindex;i>place-1&&i>0;i--) {
			list[i]=list[i-1];
		}
		list[place]=a;
	}
	
	//二分查找
	public static void searchNum(int[] list,int findNum) {
		rank2(list);
		int left=0;
		int right =list.length-1;
		int mid =(left+right+1)/2;
		//while(left<=right)   right=mid-1;left=mid+1;
		while(list[mid]!=findNum&&left!=right&&left!=right-1) {
			if(list[mid]>findNum) {
				right=mid;
				mid =(left+right)/2;
			}else if(list[mid]<findNum) {
				left=mid;
				mid =(left+right)/2;
			}else {
				break;
			}
		}
		if(left==right) {
			if(list[mid]!=findNum) {
				System.out.println("抱歉未找到!");
			}else {
				System.out.println("找到了，是list中的数由小到大排列后的的第"+(mid+1)+"个");
			}
		}else {
			if(left==right-1) {
				if(list[right]==findNum) {
					System.out.println("找到了，是list中的数由小到大排列后的的第"+(right+1)+"个");
				}else {
					System.out.println("抱歉未找到!");
				}
			}else {
				System.out.println("找到了，是list中的数由小到大排列后的的第"+(mid+1)+"个");
			}
			
		}
		
	}


}
