package ex02;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTest mt = new MethodTest();
		
		int[] arr = {4,1,2,10,7,9,5,6,3,8};
		
		mt.maxFinder(arr);
		
		System.out.print("1번을 누르면 화씨입력 , 2번을 누르면 섭씨입력 : ");
		
		int select = sc.nextInt();
		
		switch(select) {
		case 1:
			mt.fToc();
			break;
		case 2:
			mt.cToc();
			break;
		}
		
	}
}
