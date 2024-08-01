package ex04_if;

import java.util.Scanner;

public class Ex02_if_else {
	public static void main(String[] args) {
		int num = 5;
		if(num > 4) {
			System.out.println(num + "은 4보다 큽니다.");
		} else {
			System.out.println(num + "은 4보다 작습니다.");
		}
		//------------------------------------------
		//두개의 숫자 비교하기
		int a = 10;
		int b = 10;
		
		if(a > b) {
			System.out.println("a가 b보다 큽니다.");
		} else {
			if(a == b) {
				System.out.println("a는 b와 같습니다.");
			} else {
				System.out.println("a는 b보다 작습니다.");
			}
		}
		
		System.out.println("----------------------");
		
		/*
		//int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		if(x > 10 && x < 20)
			
		//char형 변수 ch가 'x' 또는 'X'일 떄 ture인 조건식
		if(ch == 'x' || ch == 'X')
		
		//char형변수 ch2가 알파벳(대문자 또는 소문자)일 때 true인 조건식		
		if((ch >= 'a' && ch <= 'z')||(ch >= 'A'&& ch <= 'Z'))
		*/
		
		//삼항연산자로 만들었던 x개의 농구공을 담기위한 박스의 개수 구하기
		//를 조건문으로 만들기
			
			Scanner sc = new Scanner(System.in);
		
		int ball = sc.nextInt();
		int box = 0;
		if(ball % 5 == 0) {
			box = ball /5;
			System.out.printf("필요한 박스의 개수는 %d 입니다\n",box);
		}else {
			box = ball /5+1;
			System.out.printf("필요한 박스의 개수는 %d 입니다",box);
		}
	}
}
	
	
