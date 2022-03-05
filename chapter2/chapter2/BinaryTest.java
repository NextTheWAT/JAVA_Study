package chapter2;  //3강 1)

public class BinaryTest {
	
	public static void main(String[] args) {
		
		int num = 10;
		int bNum = 0B1010;  // 0B 는 2진수 라는 뜻 10
		int oNum = 012 ;    // 그냥 0 는 8진수
		int hNum = 0XA ;    // 0X 는 16진수
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
		
	}
}