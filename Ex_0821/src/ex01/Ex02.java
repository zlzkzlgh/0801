package ex01;

public class Ex02 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <=20; i++) {
			//내려온 i에 대해서 2의 배수와 3의 배수가 아닌것들을 검증
			if((i % 2 != 0) && (i % 3 != 0)) {
				sum += i;
			}
		}
		System.out.println("총합 : " + sum);
	}
}
