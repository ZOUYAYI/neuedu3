package homework2_2;

import java.util.Scanner;

public class AddExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入需要判断是否是byte表示的数据类型的数字：");
		int i =new Scanner(System.in).nextInt();
		try {
			judgeByte(i);
		}catch(ByteSizeException bse) {
//			System.out.println("ByteSizeException 输入的数据不是byte类型");
			bse.printStackTrace();
		}
	}
//	1、编写一个检查给定的数字的数据类型是否为byte的程序，
//	如果此数字超出byte数据类型表示的数的范围，则引发用户自定义的异常ByteSizeException,
//	并显示相应的错误信息（知识点：自定义异常） [选作题]
//	步骤1：创建用户自定义异常类ByteSizeException
//	步骤2：在main方法中编写逻辑代码
//	步骤3：运行并测试

	public static boolean judgeByte(int i)throws ByteSizeException {
		//保证输入的数据范围在-128~127之间
		if(i<-128||i>127) {
			throw new ByteSizeException();
		}else {
			return true;
		}
	}
	
}
