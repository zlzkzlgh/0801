package ex05_try_catch;

import java.util.Scanner;

//키보드에서 정수를 입력받도록 하고, 정수 이외의 값이 입력되었다면
//"정수만 입력 가능" 이라는 메시지 출력하기

//결과
//정수 : 100
//결과 : 100

//정수 : aaa
//결과 : aaa는 정수가 아닙니다.
public class Ex03_try_catch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String num = "";
		try {
			System.out.print("정수 : ");
			num = sc.next();
			int n = Integer.parseInt(num); //예외발생 가능성 있음
			System.out.println("입력받은 수 : " + n);
		} catch (Exception e) {		
			System.out.println(num + "정수가 아닙니다."); 
		}
	}
}
