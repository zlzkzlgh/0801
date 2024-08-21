package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int sum = 0;
		System.out.print("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i <= n; i++ ) {
			sum += i;
		}
		System.out.println(sum);
	}
}
