package ex01_switch;

import java.util.Scanner;

public class Ex05_switch {
	public static void main(String[] args) {
		//10이하의 숫자를 키보드에서 입력받는다.
		//해당 숫자가 짝수인지 홀수인지 판별하는 코드를
		//switch로 작성해 주세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		
		int num = sc.nextInt();
		
			
		switch(num % 2) {
		case 0 -> System.out.println("짝수");
		case 1 -> System.out.println("홀수");
		}
		
		//키보드에서 달(month)를 입력받아
		//해당 달이 몇일까지 있는지 switch문을 이용해 작성해주세요.
		//결과
		//X월은 X일까지 있습니다.
		
		int month = sc.nextInt();
		
		switch(month) {
		case 1,3,5,7,8,10,12 -> System.out.printf("%d월은 31일까지 있습니다\n",month);
		
		case 4,6,9,11 -> System.out.printf("%d월은 30일까지 있습니다\n",month);
		
		case 2 -> System.out.printf("%d월은 28일까지 있습니다\n",month);
		
		default -> System.out.println("잘못된 입력입니다.");
		}
		//-------------------------------------------------
		//계산기 프로그램 만들기
		//두 개의 정수를 입력받는다.
		//산술연산자도 입력받아서 문자열에 담는다 ex)"+"
		//switch문을 이용하여 정수의 연산을 수행하는 코드 작성하기
		
		System.out.println("숫자를 입력하시오 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("연산자를 입력하시오 : ");
		String Operator = sc.next();
		
		switch(Operator) {
		case "+" -> System.out.printf("%d + %d = %d",a,b,a+b);
		case "-" -> System.out.printf("%d - %d = %d",a,b,a-b);
		case "*" -> System.out.printf("%d * %d = %d",a,b,a*b);
		//수학적인 나누기를 하려면 숫자 하나를 double로 형변환을 하면된다.
		case "/" -> System.out.printf("%d / %d = %f",a,b,(double)a/b);
		}
		
	}
}
