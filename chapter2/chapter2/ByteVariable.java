package chapter2;    // 3강   4)

public class ByteVariable {
	
	public static void main(String[] args) {
		byte bData = -128;
		System.out.println(bData);
		
		byte bData2 = 127;    // byte는 127까지만 표현가능 128은 못함
		System.out.println(bData2);
	}
}