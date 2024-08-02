package ex03_array;

import java.util.Random;
import java.util.Scanner;

public class Ex04_Array {
	public static void main(String[] args) {

		// 10개의 정수를 담을 수 있는 배열의 생성
		// 배열의 이름은 numbers

		int[] numbers = new int[10];

		// 배열에 Random클래스를 이용하여 1~30 사이의 난수 넣기
		// nextInt(30)+1;

		Random rnd = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rnd.nextInt(30) + 1;
		}

		// 배열의 모든 요소 출력하기(가로)

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		// 배열 안에서 짝수의 합 구하기

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
		}
		System.out.println("짝수의 합 : " + sum);

		// 배열에 영문자만 추출하여 이어붙혀 출력하기

		char[] cards = { '1', 'L', '2', 'O', '3', 'V', 'E', '4' };
		String myWord = "";
		// 배열의 전체를 순회하는 반복문
		for (int i = 0; i < cards.length; i++) {
			if (cards[i] >= 'A' && cards[i] <= 'Z') {
				myWord += cards[i];
				// myWord = "" + cards[i];
			}
		}
		System.out.println("단어 : " + myWord);
		// 출력결과
		// LOVE
		// 'A' -> 65

		System.out.println("----------------------");

		// 배열 arr에 담겨있는 모든 값의 합을 구하시오
		int sum1 = 0;
		int[] arr = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < arr.length; i++) {
			sum1 += arr[i];
		}
		System.out.println("arr에 담겨있는 모든수의 합 : " + sum1);

		// 배열명.length : 배열에 들어있는 요소의 개수
		// index : 요소에게 번호표를 나눠준다.(근데 0부터 시작)
		// 배열에 있는 요소 꺼내는법
		// 배열명[인덱스번호] -> 변수처럼 사용을 한다.

		// arr[0] -> 10

		System.out.println("----------------------");

		// 다음조건에 맞는 문제를 푸세요
		// 키보드에서 배열의 길이를 입력받는다.
		// 입력받은 길이만큼 알파벳을 넣고 출력한다.
		// ex)배열의 길이를 입력하세요 : 5
		// ABCDE

		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 길이를 입력하세요 : ");

		char[] c = new char[sc.nextInt()];
		char c2 = 'A';

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i] = c2++);
		}

		// 동전의 개수 구하기
		// 10~5000사이의 난수를 변수에 담는다.
		// 1의 자리는 반드시 0이 되어야 합니다.
		// 발생된 난수를 각 동전으로 바꾸면 몇개씩 필요한지 판단하는 코드
		// 가능한 적은 수의 동전을 사용하도록 한다.
		// 4170
		// 500원:8개
		// 100원:1개
		// 50원: 1개
		// 10원: 2개

		int[] coin = { 500, 100, 50, 10 };

		// 난수에는 1의자리가 없어야함
		// 10,20,30,40,50,60 ~ 4990,5000
		int money = (rnd.nextInt(500) + 1) * 10;
		System.out.println("돈 : " + money);

		for (int i = 0; i < coin.length; i++) {
			// 4170원이라고 가정
			int res = money / coin[i];// 동전의 개수
			money %= coin[i];// 잔돈
			System.out.printf("%d원 : %d개\n", coin[i], res);
		}

		//로또번호 생성하기
		//1 ~ 45 사이의 난수를 발생시켜 로또번호를 배열에 저장하고
		//출력하기
		
		int [] lotto = new int[6];
		
		//6번만에 뽑을수 있나...?
		//몇번만에 끝날지 모름
		outer : for(int i = 0; i < lotto.length;) {
			lotto[i] = rnd.nextInt(45)+1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					continue outer;
				}
			}//inner
			System.out.print(lotto[i]+" ");
			i++;
		}
		
	}
}
