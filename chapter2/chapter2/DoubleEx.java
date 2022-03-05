package chapter2;           //3강   7)

public class DoubleEx {

	int abc;
	
	public static void main(String[] args) {
		double dNum = 3.14;
		float fNum = 3.14F; // 뒤에 f,F 식별자를 써야 함
		
		var d2Num = 3.14;
		System.out.println(d2Num);
		
		var num = 10;       //자료형 var를 이런식으로 알아서 가능
							//하지만 지역변수로는 사용못함
		System.out.println(num);
		num = 3.14;  // 이런식으로 쓰지못함
	}
}