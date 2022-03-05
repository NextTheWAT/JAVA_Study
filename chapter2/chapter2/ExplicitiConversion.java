package chapter2;          //4강   3)

public class ExplicitiConversion {

	public static void main(String[] args) {
		
		int iNum = 1000;
		byte bNum = (byte)iNum;  //한 바이트라 -127~127까지만 가능함
								// 그래서 맨 앞이 1이되어서 음수로 표현이 됨
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14;
		iNum = (int)dNum ;
		
		System.out.println(iNum); // 형 변환을 하면 소수점 이하부분은 사라짐
		
		float fNum = 0.9F;
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);
		
		System.out.println(num1);  //3 
		System.out.println(num2);  //4 
	}

}