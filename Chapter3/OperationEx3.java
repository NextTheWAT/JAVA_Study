package Chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2 ;
		
		boolean value = (((num1 = num1 + 10) < 10 ) && ((i = i + 2) < 10)); 
						// 앞쪽이 false 이기 떄문에 뒤에 코드가 실행되지 않음
						// 앞쪽이 트루이면 뒤에까지 연산을 함
		System.out.println(value);     // false
		System.out.println(num1);		// 20
		System.out.println(i);			//2
		
		boolean value2 = (((num1 = num1 + 10) < 10 ) || ((i = i + 2) < 10)); 
		// 앞쪽이 true 이기 떄문에 뒤에 코드가 실행되지 않음
		// 앞쪽이 fales 이면 뒤에까지 연산을 함
System.out.println(value2);     // false
System.out.println(num1);		// 20
System.out.println(i);			//4

	}

}