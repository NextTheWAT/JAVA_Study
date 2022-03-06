package Chapter3;

public class OperationEx4 {      // 6강 1)
	public static void main(String[] args) {
		
		int num1 = 10;
		System.out.println(num1 += 1);   //11
		
		System.out.println(num1 %= 10);  //1
		num1 -= 1;    // num1 = num1 - 1
		System.out.println(num1);          //0
		
		int num (5>3) ? 10 : 20;      // 2)   //참이면 10 거짓이면 20  
		System.out.println(num);     
	}

}