package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
//		1. 정수의 총합 구하기1
//		Ex01클래스 생성하기
//		- Scanner를 이용해 정수 n을 입력받는다.
//		- 1부터 n까지의 합을 계산하여 결과를 출력하는 프로그램 작성
//		ex) 5를 입력받았다면 1+2+3+4+5의 연산결과인 15를 출력해야 한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
	}
}
