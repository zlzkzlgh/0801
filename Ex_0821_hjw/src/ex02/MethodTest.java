package ex02;

import java.util.Scanner;

public class MethodTest {
	public void maxFinder(int[]arr) {
		int max = arr[0];
		
		for(int x : arr) {
			if(x > max)
			max = x;
			
		}
		System.out.println("최대값 : " + max);
	}
	
	public void cToc() {
		Scanner sc = new Scanner(System.in);
		
		double c;
		double f;
		
		System.out.print("섭씨 입력 : ");
		
		c = sc.nextDouble();
		
		f = 1.8 * c + 32;

		System.out.printf("화씨로 바뀐 온도는 %.2f 도 입니다.",f);
	}
	
	public void fToc() {
		Scanner sc = new Scanner(System.in);
		
		double c;
		double f;
		
		System.out.print("화씨 입력 : ");
		
		f = sc.nextDouble();
		
		c = (f-32)/1.8;

		System.out.printf("섭씨로 바뀐 온도는 %.2f 도 입니다.",c);
	}
}
