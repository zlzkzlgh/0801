package ex02_for;

import java.util.Scanner;

public class Ex01_for {
	public static void main(String[] args) {
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println(i);
		}
		
		System.out.println("------------------------------------");
		//1 2 3 4 5 6 7 8 9 10
		
		for(int i = 1; i < 11; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		//10 9 8 7 6 5 4 3 2 1
		
		for(int i = 10; i > 0; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		//1~20까지 홀수만 가로로 출력하기
				
		for(int i = 1; i < 21; i++) {
			if(i % 2 == 1) {
				System.out.print(i+" ");
			}			
		}
		System.out.println();
		//1~10까지 3의 배수만 출력하는 코드 작성하기
		
		for(int i = 3; i < 11; i++) {
			if(i % 3  == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		//1부터 10까지의 총합 구하기
		//총 합은 한번만 출력
		int sum = 0;
		for(int i = 1; i < 11; i++) {
			sum += i; //sum = sum + i
		}
		System.out.print(sum);
		
		//정수형 변수 dan에 2~9 사이의 값으로 초기화 하고
		//해당 dan에 해당하는 구구단 출력하기
		// 2 x 1 = 2
		// 2 x 2 = 4
		System.out.println();
		
		int dan = 2;
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			
		}
		//키보드에서 정수를 하나 입력받아
		//1부터 입력받은 수 까지의 총합을 구하세요
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		sum=0;
		for(int i = 0; i <= a; i++) {
			sum += i;
		}
		System.out.println("총합 : " + sum);
		
		System.out.println();
		//10개의 정수를 입력받아 그 중에 짝수가 몇개인지
		//개수를 출력해주세요
		
		//개수를 세서 저장 할 수 있는 변수
//		
//		int count = 0;
//		
//		for(int i = 1; i < 11; i++) {
//			System.out.print("정수 입력 : ");
//			int n = sc.nextInt();
//			
//			//짝수인지 판별
//			if(n % 2 == 0) {
//				//개수를 센다.
//				count++;
//			}
//			System.out.println("짝수의 개수 : " + count);
//		}
		
		//키보드로부터 정수를 두 개입력받는다.
		//입력받은 x부터 y까지의 총합을 출력하세요.
		//예를 들어 2 와 5를 입력받으면
		//2+3+4+5를 한 14가 출력이 되야한다.
		//단, x가 y보다 큰 경우
		//x와 y의 값을 바꿔서 총합을 구한다.
		
		System.out.println("첫 번째 숫자 : ");
		int x = sc.nextInt();
		System.out.println("두 번째 숫자 : ");
		int y = sc.nextInt();
		
		//x와 y의 크기비교
		if(x > y) {
			int z = x;
			x = y;
			y = z;
		}
		
		sum = 0;
		for(int i = x; i <= y; i++) {
			sum += i;
		}
		System.out.printf("%d 부터 %d 까지의 총합 : %d",x,y,sum);
		
	}			
}	

