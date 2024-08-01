package ex02_print;

public class Print03 {

	public static void main(String[] args) {
		//printf()출력문은 값의 타입(숫자,문자)에 따라서 서식문자를 이용해
		//문장속에서 데이터를 출력하는것
		// %d : 정수형 서식문자
		// %f : 실수형 서식문자
		// %s : 문자열 서식문자
		// %c : 문자형 서식문자
		// %b : 논리형 서식문자
		
		//이스케이프 문자
		//특수한 기능이 있는 문자
		// \n : 개행문자(줄바꿈)
		
		System.out.printf("저는 대학교 %d학년에 재학중입니다.\n",3);
		System.out.printf("%d는 첫번째, %f는 두번째, %s는 세번째\n", 1, 2.0, "셋");
		
		//출력값의 정렬
		//%3d -> 주어진 숫자 칸만큼 자리를 확보후, 오른쪽 정렬하여 출력 
		System.out.printf("%5d\n",1);
		System.out.printf("%5d\n",12);
		System.out.printf("%5d\n",123);
		System.out.printf("%5d\n",1234);
		System.out.printf("%5d\n",12345);
		
		//실수의 정렬
		//%.2f
		System.out.printf("%.1f\n",1.234567);
		System.out.printf("%.2f\n",1.234567);
		System.out.printf("%.3f\n",1.234567);
		System.out.printf("%.4f\n",1.234567);
		System.out.printf("%.5f\n",1.234567);
		
		
	}

}
