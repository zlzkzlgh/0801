package ex04_if;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Ex04_if_elseif {
	public static void main(String[] args) {
		int favorite = 7;
		
		if(favorite > 5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다.");
		} else if(favorite == 7) {
			System.out.println("좋아하는 숫자는 7 입니다.");
		}
		
		//---------------------------------------------//
		//나이를 키보드에서 입력받는다.
		//20살 이상이면 성인입니다.
		//14살 이상이면 청소년입니다.
		//7살 이상이면 어린이입니다.
		// 그 이외에는 유아입니다.
		
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("나이를 입력하세요 : ");
		
		int age = sc.nextInt();
				//객체명.메서드명(); -> 해당 클래스에 있는 메서드의 호출
		if(age >= 20) {
			System.out.println("성인 입니다.");
		} else if(age >= 14) {
			System.out.println("청소년 입니다.");
		} else if(age >= 7) {
			System.out.println("어린이 입니다.");
		}else {
			System.out.println("유아 입니다.");
		}
		*/
		
		//---------------------------------------------------
		
		//키보드에서 성적을 입력받는다.
		//100점에서 90점까지는 A
		//89 ~ 80점 까지는 B
		//79 ~ 70점 C
		//69 ~ 60 까지D
		//59 ~ 0 까지 F
		
		System.out.print("성적을 입력하세요 : ");
		
		int score = sc.nextInt();
		char grade = 'a';
		
		if(score <= 100 && score >=90 ) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.printf("점수는 %d이고 성적은 %c입니다.\n",score,grade);
	}
}
