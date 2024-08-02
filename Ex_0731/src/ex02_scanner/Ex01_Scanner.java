package ex02_scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.print("나이를 입력해주세요 : ");
		int age = scan.nextInt();
		System.out.printf("제 나이는 %d세 입니다.\n",age);
		System.out.println("------------------------");
		//제 이름은 XXX입니다.
		//제 나이는 XX살입니다.
		//제 주소는 XXX입니다.
		//제 키는 XX.Xcm입니다.
		*/
		
		System.out.print("이름을 입력해주세요 : ");
		String name = scan.nextLine();
		System.out.printf("제 이름은 %s 입니다.\n",name);
		
		System.out.print("나이를 입력해주세요 : ");
		int age2 = scan.nextInt();
		scan.nextLine();
		System.out.printf("제 나이는 %d세 입니다.\n",age2);
				
		System.out.print("주소를 입력해주세요 : ");
		String adress = scan.nextLine();
		System.out.printf("제 주소는 %s 입니다.\n",adress);
		
		System.out.print("키 입력해주세요 : ");
		double height = scan.nextDouble();
		System.out.printf("제 키는 %.2f 입니다.\n",height);
		
	}
}
