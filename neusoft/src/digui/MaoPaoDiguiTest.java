package digui;

public class MaoPaoDiguiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {657,4,3,6789,90,239,777};
		maoPao(list,0,list.length-1);
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		
	}
	public static void maoPao(int[] list,int L,int R) {
		int tempt;
		if(L!=R) {
			for(int i=L;i<R;i++)
			{
				if(list[i]>list[i+1]) {
					tempt=list[i+1];
					list[i+1]=list[i];
					list[i]=tempt;
					
				}
			}
			maoPao(list,L,R-1);
		}
		
		
	}

}
