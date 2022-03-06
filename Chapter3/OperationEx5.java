package Chapter3;

public class OperationEx5 {      //6강    3)
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		
		int result = num1 & num2 ;
		System.out.println(result);     //1
		
		int num3 = 5;
		int num4 = 10;
		
		int result2 = num3 | num4 ;
		System.out.println(result2);     //15
		
		int num5 = 5;
		System.out.println(num5 << 1);    //10
		System.out.println(num5); //5
		
		int num6 = 5;
		System.out.println(num6 <<= 1);    //10      //= 을 붙여야 대입이 됨
													// = 을 붙이지 않으면 대입이 되지 않음
		System.out.println(num6); //10
		
		
	}

}