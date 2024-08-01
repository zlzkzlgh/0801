package ex03_operator;

public class Ex07_Operator {
	public static void main(String[] args) {
		//삼항연산자
		//하나의 조건을 정의하여 조건식이 참일 때 반환할 값
		//거짓일 때 반환할 값을 얻어내기 위한 연산자
		
		int a = 10;
		int b = 15;
		
		boolean result = ++a >= b ? true : false;
		System.out.println(result);
		
		char result2 = (a+=b) == b ? 'O' : 'X';
		System.out.println(result2);
	}
}
